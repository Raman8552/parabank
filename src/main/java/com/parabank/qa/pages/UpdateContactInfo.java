package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;

public class UpdateContactInfo extends TestBase{

	@FindBy(id = "customer.firstName") WebElement FirstName;
	@FindBy(id = "customer.lastName") WebElement LastName;
	@FindBy(id = "customer.address.street")WebElement Address;
	@FindBy(id = "customer.address.city") WebElement City;
	@FindBy(id = "customer.address.state") WebElement State;
	@FindBy(id = "customer.address.zipCode") WebElement ZipCode;
	@FindBy(id = "customer.phoneNumber") WebElement Phone;
	@FindBy(xpath = "//input[@type='submit'and @value='Update Profile']") WebElement UpdateProfileBtn;
	@FindBy(id = "//*[@id=\"rightPanel\"]/div/div/h1") WebElement Result;
	
	

	
	public UpdateContactInfo() {
		PageFactory.initElements(driver, this);}
		
	public String validateUpdateContactInfoPageTitle() {
			return driver.getTitle();
		}
	
	public void validateUCIData(String F_name, String L_name, String address, String city, String state, String Z_code, String phone) {
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
		Phone.sendKeys(phone);

	}
	
	
	public void validateUpdateProfileBtn() {
		UpdateProfileBtn.click();
	}
	
	public boolean validateResultPage() {
	return Result.isDisplayed();
	}

}

