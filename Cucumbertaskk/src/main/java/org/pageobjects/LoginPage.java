package org.pageobjects;

import java.util.List;

import org.Utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends UtilityClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(name = "login-button")
	private WebElement login;

	@FindBy(xpath = "//h3[@data-test='error']")
	private WebElement errormsg;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getErrormsg() {
		return errormsg;
	}

	public void login(String username, String password) {
		sendKeys(getUsername(), username);
		sendKeys(getPassword(), password);
		click(getLogin());
	}


}
