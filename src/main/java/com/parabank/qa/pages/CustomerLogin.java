package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;

public class CustomerLogin extends TestBase{

	@FindBy(name = "username") WebElement Username;
	@FindBy(name = "password") WebElement Password;
	@FindBy(xpath = "[@id=\"rightPanel\"]") WebElement Emptyfields;
	@FindBy(xpath = "input[@type='submit'and @value='Log In']") WebElement LoginBtn;
	@FindBy(xpath = "[contains(text(),'lookup.htm')]") WebElement FLInfoLink;
	@FindBy(xpath = "[contains(text(), 'Register')]") WebElement RegLink;
	
	public CustomerLogin() {
		PageFactory.initElements(driver, this);}

	public String validateCLoginPageTitle() {
		return driver.getTitle();}

	public ForgotLoginInfo validateForgotLoginInfoLink() {
		FLInfoLink.click();
		return new ForgotLoginInfo();       
		}

	public Registration validateRegisterlink() {
		RegLink.click();
		return new Registration();
		}

	public void Login(String username, String password) {
		Username.sendKeys(username);
		Password.sendKeys(password);
		}
	
	public String LoginButton () {
		LoginBtn.click();
		return driver.getTitle();
	}
	
	public String emptyFieldsText() {
		return Emptyfields.getText();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	

