package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(linkText = "Open New Account") WebElement OpenNewAccountLink;
	@FindBy(linkText = "Transfer Funds") WebElement TransferFundsLink;
	@FindBy(linkText = "Bill Pay") WebElement BillPayLink;
	@FindBy(linkText = "Find Transactions") WebElement FindTransactionsLink;
	@FindBy(linkText = "Update Contact Info") WebElement UpdateContactInfoLink;
	@FindBy(linkText = "Request Loan") WebElement RequestLoanText;
	@FindBy(linkText = "Log Out") WebElement LogOutLink;

	public HomePage() {
	PageFactory.initElements (driver, this);
	}

	public void ClickOpenNewAccount() {
	OpenNewAccountLink.click();
	}

	public void ClickTransferFunds() {
	TransferFundsLink.click();
	}

	public void ClickBillPay() {
	BillPayLink.click();
	}

	public void ClickFindTransactions() {
	FindTransactionsLink.click();
	}

	public void ClickUpdateContactInfo() {
	UpdateContactInfoLink.click();
	}

	public void ClickRequestLoan() {
	RequestLoanText.click();
	}

	public void ClickLogOut() {
	LogOutLink.click();
	}	
	
}
