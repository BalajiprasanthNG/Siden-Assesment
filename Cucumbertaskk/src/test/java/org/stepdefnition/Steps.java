package org.stepdefnition;

import java.util.LinkedList;
import java.util.List;

import org.Utility.UtilityClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pageobjects.AddCartPage;
import org.pageobjects.LoginPage;
import org.pageobjects.ProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends UtilityClass {

	LoginPage l;
	ProductPage p;
	static AddCartPage ac;
	List<String> productname;
	List<String> pricename;
	List<String> afterpricename;

	@Given("the user must be in  saucedemo page")
	public void the_user_must_be_in_saucedemo_page() {
		p = new ProductPage();
	}

	@When("The user should login to application")
	public void the_user_should_login_to_application() {
		l = new LoginPage();
		l.login("performance_glitch_user", "secret_sauce");

	}

	@When("The user must add the products in the cart")
	public void the_user_must_add_the_products_in_the_cart() {
		p = new ProductPage();
		click(p.getProduct());
		click(p.getBasket());
		click(p.getCheckout());
		sendKeys(p.getFirstname(), "Balaji");
		sendKeys(p.getLastname(), "Prasanth");
		sendKeys(p.getPostalcode(), "603108");
		click(p.getContinuebutton());
		
	}

	@Then("To validate the product added to the cart is correct or incorrect")
	public void to_validate_the_product_added_to_the_cart_is_correct_or_incorrect() {
		ac = new AddCartPage();
		String text = ac.getAddeditemname().getText();
		Assert.assertTrue(p.getBeforeitemname().getText().equals(text));
		click(p.getFinishbutton());
	}

	@When("To get all products")
	public void to_get_all_products() {
		ac = new AddCartPage();
		List<WebElement> name = ac.getItemname();
		productname = new LinkedList<String>();
		for (WebElement x : name) {
			productname.add(x.getText());
		}
	}

	@Then("To validate the {string} is availabale or unavailable")
	public void to_validate_the_is_availabale_or_unavailable(String dress) {
		for (String name1 : productname) {
			if (name1.equals(dress)) {
				System.out.println("Product name:.." + name1);
				Assert.assertEquals(dress, name1);
			}
		}
	}

	@When("To get all product price details and remove the dollor symbol in the price")
	public void to_get_all_product_price_details_and_remove_the_dollor_symbol_in_the_price()
			throws InterruptedException {
		Thread.sleep(3000);
		ac = new AddCartPage();
		List<WebElement> price = ac.getItemPrice();
		pricename = new LinkedList<String>();
		for (WebElement e : price) {
			String pp = e.getText();
			if (pp.contains("")) {
				String rp = pp.replace("$", "");
				pricename.add(rp);
			}
		}
	}

	@Then("To validate the product price when user click the product price is same or different")
	public void to_validate_the_product_price_when_user_click_the_product_price_is_same_or_different() {
		List<WebElement> pn = ac.getItemPrice();
		List<WebElement> name1 = ac.getItemname();
		afterpricename = new LinkedList<String>();
		for (int i = 0; i < name1.size(); i++) {
			name1.get(i).click();
			String tt = ac.getAfItemPrice().getText();
			if (tt.contains("$")) {
				String rr = tt.replace("$", "");
				System.out.println(rr);
				afterpricename.add(rr);
			}
			driver.navigate().back();
		}
		Assert.assertEquals("Product prices validation", pricename, afterpricename);
	}

	@When("The user login to application with invalid data")
	public void the_user_login_to_application_with_invalid_data() {
		l = new LoginPage();
		l.login("balaji", "balaji81/81");

	}

	@Then("To validate the invalid login error message")
	public void to_validate_the_invalid_login_error_message() {
		String text = l.getErrormsg().getText();
		System.out.println(text);
		Assert.assertTrue("Ivalid login", text.contains("Username and password do not match"));
	}

}
