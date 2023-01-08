package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;

public class FindTransactions extends TestBase{
	
	@FindBy(id = "criteria.transactionId") WebElement TransactionID;
	@FindBy(xpath = "//button[@type = 'submit']") WebElement FindTransactionBtn1;
	@FindBy(xpath = "//div[@ng-if = 'showResult']") WebElement IDResult;
	@FindBy(id = "criteria.onDate") WebElement Date;
	@FindBy(xpath = "//button[@type = 'submit']") WebElement FindTransactionBtn2;
	@FindBy(id = "criteria.fromDate") WebElement FromDate;
	@FindBy(id = "criteria.toDate") WebElement ToDate;
	@FindBy(xpath = "//button[@type = 'submit']") WebElement FindTransactionBtn3;
	@FindBy(id = "criteria.amount") WebElement Amount;
	@FindBy(xpath = "//button[@type = 'submit']") WebElement FindTransactionBtn4;
	
	
	public FindTransactions() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateFindTransactionsTitle() {
		return driver.getTitle();
	}
	
	public void validateTransactionID() {
		TransactionID.clear();
		TransactionID.sendKeys("15808");
	}
	
	public void validateFindTransactionBtn1() {
		FindTransactionBtn1.click();
	}
	
	public boolean ResultscreenbyID() {
		return IDResult.isDisplayed();
	}
	
	public void validateDate() {
		Date.clear();
		Date.sendKeys("01-06-2023");
	}
	
	public void validateFindTransactionBtn2() {
		FindTransactionBtn2.click();
	}
	
	
		
	
	public void validateDateRange() {
		FromDate.clear();
		FromDate.sendKeys("01-05-2023");
		ToDate.clear();
		ToDate.sendKeys("01-06-2023");
	}
	
	public void validateFindTransactionBtn3() {
		FindTransactionBtn3.click();
	}
	
	
	public void validateAmount() {
		Amount.clear();
		Amount.sendKeys("10");
	}
	
	public void validateFindTransactionBtn4() {
		FindTransactionBtn4.click();
	}
	
	
	

}
