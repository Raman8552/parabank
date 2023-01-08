package com.parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.parabank.qa.base.TestBase;

public class BillPay extends TestBase {

	@FindBy(name = "payee.name") WebElement PayeeName ;
	@FindBy(name = "payee.address.street") WebElement Address;
	@FindBy(name = "payee.address.city") WebElement City;
	@FindBy(name = "payee.address.state") WebElement State;
	@FindBy(name = "payee.address.zipCode") WebElement ZipCode;
	@FindBy(name = "payee.phoneNumber") WebElement Phone;
	@FindBy(name = "payee.accountNumber") WebElement Account;
	@FindBy(name = "verifyAccount") WebElement VerifyAccount;
	@FindBy(name = "amount") WebElement Amount;
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[13]/td[2]/select") WebElement FromAccount;  //*[@id="rightPanel"]/div/div[1]/form/table/tbody/tr[13]/td[2]/select
	//empty fields error text
	@FindBy(xpath = "//span[@ng-show = '!validationModel.name']") WebElement PayeeNameText;
	@FindBy(xpath = "//span[@ng-show = '!validationModel.address']") WebElement AddressText;
	@FindBy(xpath = "//span[@ng-show = '!validationModel.city']") WebElement CityText;
	@FindBy(xpath = "//span[@ng-show = '!validationModel.state']") WebElement StateText;
	@FindBy(xpath = "//span[@ng-show = '!validationModel.zipCode']") WebElement ZipCodeText;
	@FindBy(xpath = "//span[@ng-show = '!validationModel.phoneNumber']") WebElement PhoneText;
	@FindBy(xpath = "//span[@ng-show = 'validationModel.account == 'empty'']") WebElement AccountText;
	@FindBy(xpath = "//span[@ng-show = 'validationModel.verifyAccount == 'empty'']") WebElement VerifyAccountText; //empty field
	@FindBy(xpath = "//span[@ng-show = 'validationModel.verifyAccount == 'mismatch'']") WebElement VerifyAccountMismatchText; //not as account field
	@FindBy(xpath = "//span[@ng-show = 'validationModel.amount == 'empty'']") WebElement AmountText;
	//Send Payment Button
	@FindBy(xpath = "//input[@text = 'submit' and @value = 'Send Payment']") WebElement SendPaymentBtn;
	@FindBy(xpath = "//div[@ng-show = 'showResult']") WebElement SendPaymentResult;
	@FindBy(xpath = "//span[@ng-show = 'validationModel.account == 'invalid'']") WebElement invalidAccText; // for putting characters
	@FindBy(xpath = "//span[@ng-show = 'validationModel.verifyAccount == 'invalid'']") WebElement invalidVerAccText; //for putting characters
	@FindBy(xpath = "//span[@ng-show = 'validationModel.amount == 'invalid'']") WebElement invalidAmtText;
	
	public BillPay() {
	PageFactory.initElements (driver, this);
	}

	public String validateBillPayPageTitle() {
	return driver.getTitle();
	}

	public String BillPayForm(String P_name, String address, String city, String state, 
			String Z_code,String PhnNo, String Acc, String VerifyAcc, String Amt, String FromAcc) {
		
	PayeeName.clear();
	PayeeName.sendKeys(P_name);
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
	Account.clear();
	Account.sendKeys(Acc);
	VerifyAccount.clear();
	VerifyAccount.sendKeys(VerifyAcc);
	Amount.clear();
	Amount.sendKeys(Amt);
	FromAccount.clear();
	FromAccount.sendKeys(FromAcc);
	return driver.getTitle();
	}

	public String emptyPnametext() {
	return PayeeNameText.getText();
	}

	public String emptyAddresstext() {
	return AddressText.getText();
	}

	public String emptyCitytext() {
	return CityText.getText();
	}

	public String emptyStatetext() {
	return StateText.getText();
	}

	public String emptyZcodetext() {
	return ZipCodeText.getText();
	}

	public String emptyPhonetext() {
	return PhoneText.getText();
	}

	public String emptyAccounttext() {
	return AccountText.getText();
	}

	public String emptyVerifyAcctext() {
	return VerifyAccountText.getText();
	}

	public String emptyVerifyAccMismatchtext() {
	return VerifyAccountMismatchText.getText();
	}

	public String emptyAmounttext() {
	return AmountText.getText();
	}

	public void validateSendPaymentBtn() {
	SendPaymentBtn.click();
	}

	public String validateSendPaymentSuccessPageText() {
		SendPaymentBtn.click();
	return SendPaymentResult.getText();
	}
	
	public String validateinvalidAccText() {
	return	invalidAccText.getText();
	}

	public String validateinvalidVerAccText() {
	return	invalidVerAccText.getText();
	}

	public String validateinvalidAmtText() {
	return	invalidAmtText.getText();
	}
	
	public String validateVerifyAccMismatchtext() {
		return VerifyAccountMismatchText.getText();
	}
	
	public void validateFromAccount(String f) {
		Select FromList = new Select(FromAccount);
		FromList.selectByValue(f);
		}
	
	
	

	
}
