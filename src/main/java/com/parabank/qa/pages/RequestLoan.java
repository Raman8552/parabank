package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.qa.base.TestBase;

public class RequestLoan extends TestBase{

	@FindBy(id = "amount") WebElement LoanAmount;
	@FindBy(id = "downPayment") WebElement DownPayment;
	@FindBy(xpath = "//input[@value ='Apply Now']") WebElement 	ApplyNowBtn;
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/p") WebElement ErrorText;
	
	public RequestLoan() {
		PageFactory.initElements(driver, this);}

	public String validateRequestLoanPageTitle() {
		return driver.getTitle();
		}
	public String validateRequestLoanData(String LoanAmt, String DownPay) {
		LoanAmount.clear();
		LoanAmount.sendKeys(LoanAmt);
		DownPayment.clear();
		DownPayment.sendKeys(DownPay);
	return driver.getTitle();
	}
	
	public String validateErrorText() {
		return ErrorText.getText();
	}
	
	public void validateApplyNowBtn() {
		ApplyNowBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
