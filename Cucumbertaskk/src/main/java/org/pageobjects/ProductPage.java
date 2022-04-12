package org.pageobjects;

import org.Utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends UtilityClass {

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
	private WebElement product;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement basket;
	@FindBy(xpath = "//button[@name='checkout']")
	private WebElement checkout;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement firstname;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement lastname;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement postalcode;

	@FindBy(id = "continue")
	private WebElement continuebutton;

	@FindBy(id = "finish")
	private WebElement finishbutton;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private WebElement beforeitemname;
	
	public WebElement getBeforeitemname() {
		return beforeitemname;
	}


	public WebElement getProduct() {
		return product;
	}

	public WebElement getBasket() {
		return basket;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPostalcode() {
		return postalcode;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getFinishbutton() {
		return finishbutton;
	}




}
