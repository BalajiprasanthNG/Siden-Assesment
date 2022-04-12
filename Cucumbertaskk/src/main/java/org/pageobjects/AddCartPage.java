package org.pageobjects;

import java.util.List;

import org.Utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage extends UtilityClass {
	
	public AddCartPage() {
		PageFactory.initElements(driver, this);
	}
	// 3
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private List<WebElement> itemname;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private WebElement addeditemname;

	public WebElement getAddeditemname() {
		return addeditemname;
	}

	public List<WebElement> getItemname() {
		return itemname;
	}

	@FindBy(xpath = "//div[@class='inventory_item_price']")
	private List<WebElement> itemPrice;

	public List<WebElement> getItemPrice() {
		return itemPrice;
	}

	@FindBy(xpath = "//div[@class='inventory_details_price']")
	private WebElement afitemPrice;

	public WebElement getAfItemPrice() {
		return afitemPrice;
	}

}
