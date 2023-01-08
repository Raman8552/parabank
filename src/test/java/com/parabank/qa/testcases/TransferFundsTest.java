package com.parabank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;

import com.parabank.qa.pages.CustomerLogin;
import com.parabank.qa.pages.HomePage;

import com.parabank.qa.pages.TransferFunds;
import com.parabank.qa.util.TestUtil;

public class TransferFundsTest extends TestBase{
	
	CustomerLogin CLogin;
	TestUtil testUtil;
	TransferFunds Tfunds;
	HomePage homepage;
	

public TransferFundsTest() {
	super();
	}

@BeforeMethod
public void SetUp() {
	initialization();
	CLogin = new CustomerLogin();
	CLogin.Login(prop.getProperty("username"), prop.getProperty("password"));
	CLogin.LoginButton();
	homepage = new HomePage();
	homepage.ClickTransferFunds();
	Tfunds = new TransferFunds();
	}

@AfterMethod
public void tearDown() {
	driver.quit();
	}

@Test (priority = 1)
public void TransferfundsTitle() {
	String Title = Tfunds.validateTransferfundsPageTitle();
	Assert.assertEquals(Title, "ParaBank | Transfer Funds");
	}



@Test (priority = 2)
public void TransferTest() {
	Tfunds.validateAmount("100");
	Tfunds.validateFromAccount("13566");
	Tfunds.validateToAccount("13677");
	Tfunds.validateTransferBtn();}

@Test (priority = 3)
public void TransferResultsTest() {
boolean result_actual = Tfunds.validateTransferResults();
boolean result_expected = true;
Assert.assertEquals(result_actual, result_expected);
}

@Test (priority =4)
public void TransferText() {
String actualtext = Tfunds.validateTransferResultsText();
Assert.assertTrue(actualtext.contains("Transfer Complete!"));
}

}
