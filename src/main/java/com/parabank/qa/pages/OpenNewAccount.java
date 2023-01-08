package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.parabank.qa.base.TestBase;

public class OpenNewAccount extends TestBase{

	@FindBy(id = "type") WebElement AccountType;
	@FindBy (xpath = "//b[contains(.,'What type of Account would you like to open?')]") WebElement WhattypeofaccountDisplayed;
	@FindBy (xpath = "//input[@type='submit']")WebElement OpenNewAccountBtn;
	@FindBy(xpath = "//div[@ng-if = 'showResult']") WebElement AccountOpenResult;
	@FindBy (id = "newAccountId")WebElement NewAccountID;

	
	public OpenNewAccount() {
		PageFactory.initElements(driver, this);}
	
	public String validateOpenNewAccountTitle() {
		return driver.getTitle();
	}
	
	public boolean validateWhattypeofaccountDisplayed() {
		return WhattypeofaccountDisplayed.isDisplayed();
	}
	
	public void validateCheckingOption() {
		Select select = new Select(AccountType);
	  select.selectByVisibleText("CHECKING");
	}
	
	public void validateSavingOption() {
		Select select = new Select(AccountType);
	  select.selectByVisibleText("SAVINGS");
	}
	
	public void validateOpenNewAccountBtn() {
		OpenNewAccountBtn.click();
	}
	
	public boolean validateAccountOpenResults() {
	return AccountOpenResult.isDisplayed();
	}

	public String NewAccountID() {
	 return NewAccountID.getText();	
	}

	
	}
	
		

