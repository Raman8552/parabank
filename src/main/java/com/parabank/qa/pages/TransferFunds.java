package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.parabank.qa.base.TestBase;

public class TransferFunds extends TestBase{

	@FindBy(id = "amount") WebElement Amount;
	@FindBy(id = "fromAccountId") WebElement FromAccount;
	@FindBy(id = "toAccountId") WebElement ToAccount;
	@FindBy(xpath = "//input[@value = 'Transfer']") WebElement TransferBtn;
	@FindBy(xpath = "//div[@ng-if = 'showResult']") WebElement TransferResult;

public TransferFunds() {
	PageFactory.initElements(driver, this);}

public String validateTransferfundsPageTitle() {
	return driver.getTitle();
	}

public void validateAmount(String amt) {
	Amount.sendKeys(amt);
	}

public void validateFromAccount(String f) {
	Select FromList = new Select(FromAccount);
	FromList.selectByValue(f);
	}

public void validateToAccount(String t) {
	Select ToList = new Select(ToAccount);
	ToList.selectByValue(t);
	}

public void validateTransferBtn() {
	TransferBtn.click();
	}



public boolean validateTransferResults() {
 return TransferResult.isDisplayed();
	}

public String validateTransferResultsText() {
	return TransferResult.getText();
	}
	
}
