package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;

public class Registration extends TestBase {
	@FindBy(id = "customer.firstName") WebElement FirstName;
	@FindBy(id = "customer.firstName.errors")WebElement FNtext;
	@FindBy(id = "customer.lastName") WebElement LastName;
	@FindBy(id ="customer.lastName.errors")WebElement LNtext;
	@FindBy(id = "customer.address.street")WebElement Address;
	@FindBy(id = "customer.address.street.errors") WebElement Addtext;
	@FindBy(id = "customer.address.city") WebElement City;
	@FindBy(id = "customer.address.city.errors") WebElement Citytext;
	@FindBy(id = "customer.address.state") WebElement State;
	@FindBy(id = "customer.address.state.errors") WebElement Statetext;
	@FindBy(id = "customer.address.zipCode") WebElement ZipCode;
	@FindBy(id = "customer.address.zipCode.errors") WebElement ZCtext;
	@FindBy(id = "customer.phoneNumber") WebElement Phone;
	@FindBy(id = "customer.ssn") WebElement SSN;
	@FindBy(id = "customer.ssn.errors") WebElement SSNtext;
	@FindBy(id = "customer.username") WebElement Username;
	@FindBy(id = "customer.username.errors") WebElement UNtext;
	@FindBy(id = "customer.password") WebElement Password;
	@FindBy(id = "customer.password.errors") WebElement Pwdtext;
	@FindBy(id = "repeatedPassword") WebElement Confirm;
	@FindBy(id ="repeatedPassword.errors") WebElement Conftext;
	@FindBy(xpath = "//input[@type='submit' and @value='Register']") WebElement RegisterBtn;
	
	public Registration() {
		PageFactory.initElements(driver, this);}
		
	public String validateRegistrationPageTitle() {
			return driver.getTitle();
		}
	
	public String RegistrationForm(String F_name, String L_name, String address, String city, String state, String Z_code, String PhnNo, String ssn, String un, String pwd, String confirm_pwd) {
		FirstName.clear();
		FirstName.sendKeys(F_name);
		LastName.clear();
		LastName.sendKeys(L_name);
		Address.clear();
		Address.sendKeys(address);
		City.clear();
		City.sendKeys(city);
		State.clear();
		State.sendKeys(state);
		ZipCode.clear();
		ZipCode.sendKeys(Z_code);
		Phone.clear();
		Phone.sendKeys(PhnNo);
		SSN.clear();
		SSN.sendKeys(ssn);
		Username.clear();
		Username.sendKeys(un);
		Password.clear();
		Password.sendKeys(pwd);
		Confirm.clear();
		Confirm.sendKeys(confirm_pwd);
		return driver.getTitle();}
	
	public String emptyFnametext() {
		return FNtext.getText();
	}
	
	public String emptyLNtext() {
		return LNtext.getText();
	}
	
	public String emptyAddtext() {
		return Addtext.getText();
	}
	
	public String emptyCitytext() {
		return Citytext.getText();
	}
	
	public String emptyStatetext() {
		return Statetext.getText();
	}
	
	public String emptyZCtext() {
		return ZCtext.getText();
	}
	
	public String emptySSNtext() {
		return SSNtext.getText();
	}
	
	public String emptyUNtext() {
		return UNtext.getText();
	}
	
	public String emptyPwdtext() {
		return Pwdtext.getText();
	}
	
	public String emptyConftext() {
		return Conftext.getText();
	}
	
	public void RegBtn() {
		RegisterBtn.click();
		}	
	
	public String validateWelcomeUserPageTitle() {
		return driver.getTitle();
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

