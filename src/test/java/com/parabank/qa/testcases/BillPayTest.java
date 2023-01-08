package com.parabank.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.BillPay;
import com.parabank.qa.pages.CustomerLogin;
import com.parabank.qa.pages.HomePage;
import com.parabank.qa.util.BillPayDataProviderData;
import com.parabank.qa.util.TestUtil;

public class BillPayTest  extends TestBase{
	BillPay billpay;
	TestUtil testUtil;
	CustomerLogin CLogin;
	HomePage homepage;

public BillPayTest() {
	super();
	}

@BeforeMethod
public void setUp() {
	initialization();
	CLogin = new CustomerLogin();
	CLogin.Login(prop.getProperty("username"), prop.getProperty("password"));
	CLogin.LoginButton();
	homepage = new HomePage();
	homepage.ClickBillPay();
	billpay = new BillPay();
	}

@AfterMethod
public void tearDown() {
	driver.quit();}


@Test (priority =1)
public void BillPayPageTitleTest() {
	String title = billpay.validateBillPayPageTitle();
	Assert.assertEquals(title, "ParaBank | Bill Pay");
	}

@DataProvider
public Iterator<Object[]> getExcelData() {
ArrayList<Object[]> it=BillPayDataProviderData.getData();
return it.iterator();
}

@Test(priority =2, dataProvider = "getExcelData")
public void validateBillPayFormTest(String PayeeName, String Address, String City, String State, String ZipCode, String Phone,
	String Account, String VerifyAccount, String Amount, String FromAccount) {
	billpay.BillPayForm(PayeeName, Address, City, State, ZipCode, Phone, Account, VerifyAccount, Amount, FromAccount);
	billpay.validateSendPaymentBtn();
	if (PayeeName.matches("^[a-zA-Z0-9]*$")) {
	String actualtitle = driver.getTitle();
	String expectedtitle = billpay.validateSendPaymentSuccessPageText();
	Assert.assertEquals(actualtitle, expectedtitle);
	}
	if (PayeeName.equals("")) {
	Assert.assertTrue(billpay.emptyPnametext().contains("Payee name is required"));
	}
	if (Address.matches("^[a-zA-Z0-9]*$")) {
	String actualtitle = driver.getTitle();
	String expectedtitle = billpay.validateSendPaymentSuccessPageText();
	Assert.assertEquals(actualtitle, expectedtitle);
	}
	if (Address.equals("")) {
	Assert.assertTrue(billpay.emptyAddresstext().contains("Address is required"));
	}
	if (City.matches("^[a-zA-z]*$")) {
	String actualtitle = driver.getTitle();
	String expectedtitle = billpay.validateSendPaymentSuccessPageText();
	Assert.assertEquals(actualtitle, expectedtitle);
	}
	if (City.equals("")) {
	Assert.assertTrue(billpay.emptyCitytext().contains("City is required"));
	}
	if (State.matches("^[a-zA-z]*$")) {
	String actualtitle = driver.getTitle();
	String expectedtitle = billpay.validateSendPaymentSuccessPageText();
	Assert.assertEquals(actualtitle, expectedtitle);
	}
	if (State.equals("")) {
	Assert.assertTrue(billpay.emptyStatetext().contains("State is required"));
	}
	if (ZipCode.matches("^[a-zA-Z0-9]*$")) {
	String actualtitle = driver.getTitle();
	String expectedtitle = billpay.validateSendPaymentSuccessPageText();
	Assert.assertEquals(actualtitle, expectedtitle);
	}
	if (ZipCode.equals("")) {
	Assert.assertTrue(billpay.emptyZcodetext().contains("Zip Code is required"));
	}
	if (Phone.matches("^[0-9]")) {
	String actualtitle = driver.getTitle();
	String expectedtitle = billpay.validateSendPaymentSuccessPageText();
	Assert.assertEquals(actualtitle, expectedtitle);
	}
	if (Account.matches("^[0-9]")) {
	String actualtitle = driver.getTitle();
	String expectedtitle = billpay.validateSendPaymentSuccessPageText();
	Assert.assertEquals(actualtitle, expectedtitle);
	}
	if (Account.equals("")) {
	Assert.assertTrue(billpay.emptyAccounttext().contains("Account number is required"));
	}
	if (Account.matches("^[a-zA-z]*$")) {
	Assert.assertTrue(billpay.validateinvalidAccText().contains("Please enter a valid number"));
	}
	if (VerifyAccount.matches("^[0-9]")) {
	String actualtitle = driver.getTitle();
	String expectedtitle = billpay.validateSendPaymentSuccessPageText();
	Assert.assertEquals(actualtitle, expectedtitle);
	}
	if (VerifyAccount.equals("")) {
	Assert.assertTrue(billpay.emptyVerifyAcctext().contains("Account number is required"));
	}
	if (VerifyAccount.matches("^[a-zA-z]*$")) {
	Assert.assertTrue(billpay.validateinvalidVerAccText().contains("Please enter a valid number"));
	}
	if (Amount.matches("^[0-9]")) {
	String actualtitle = driver.getTitle();
	String expectedtitle = billpay.validateSendPaymentSuccessPageText();
	Assert.assertEquals(actualtitle, expectedtitle);
	}
	if (Amount.equals("")) {
	Assert.assertTrue(billpay.emptyAmounttext().contains("Account number is required"));
	}
	if (Amount.matches("^[a-zA-z]*$")) {
	Assert.assertTrue(billpay.validateinvalidAmtText().contains("Please enter a valid number"));
	}
	if(Account == VerifyAccount) {
	String actualtitle = driver.getTitle();
	String expectedtitle = billpay.validateSendPaymentSuccessPageText();
	Assert.assertEquals(actualtitle, expectedtitle);
	}
	if(Account != VerifyAccount) {
	Assert.assertTrue(billpay. validateVerifyAccMismatchtext().contains("The account numbers do not match"));
	}

	}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

