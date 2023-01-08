package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;

public class ForgotLoginInfo extends TestBase {

	@FindBy(id = "firstName") WebElement FName;
	@FindBy(id = "lastName") WebElement LName;
	@FindBy(id = "address.street") WebElement Address;
	@FindBy(id = "address.city") WebElement City;
	@FindBy(id = "address.state") WebElement State;
	@FindBy(id = "address.zipCode") WebElement ZCode;
	@FindBy(id = "ssn") WebElement SSN;
	@FindBy(xpath = "//*[@id=\"lookupForm\"]") WebElement FMLIBtn;
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/p") WebElement UnregDatatext;
	@FindBy(id = "firstName.errors") WebElement FNtext;
	@FindBy(id = "lastName.errors") WebElement LNtext;
	@FindBy(id = "address.street.errors") WebElement Addresstext;
	@FindBy (id = "address.city.errors") WebElement Citytext ;
	@FindBy (id = "address.state.errors") WebElement Statetext;
	@FindBy (id = "address.zipCode.errors") WebElement ZCtext;
	@FindBy (id = "ssn.errors") WebElement SSNtext;

	public ForgotLoginInfo() {
	PageFactory.initElements(driver, this);}

	public String validateForgotLoginInfoPageTitle() {
	return driver.getTitle();
	}

	public String validateFMLIData(String F_name, String L_name, String address, String city, String state, String Z_code, String ssn) {
	FName.clear();
	FName.sendKeys(F_name);
	LName.clear();
	LName.sendKeys(L_name);
	Address.clear();
	Address.sendKeys(address);
	City.clear();
	City.sendKeys(city);
	State.clear();
	State.sendKeys(state);
	ZCode.clear();
	ZCode.sendKeys(Z_code);
	SSN.clear();
	SSN.sendKeys(ssn);
	return driver.getTitle();
	}

	public String emptyFnametext() {
	return FNtext.getText();
	}

	public String emptyLNtext() {
	return LNtext.getText();
	}

	public String emptyAddtext() {
	return Addresstext.getText();
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

	public String validateUnregData() {
	return UnregDatatext.getText();
	}

	public void validateFMLIBtn() {
	FMLIBtn.click();
	}

	public String validateSuccessPage(){
	return driver.getTitle();
	}
	
	
}
