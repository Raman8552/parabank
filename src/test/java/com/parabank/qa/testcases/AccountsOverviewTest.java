package com.parabank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.AccountsOverview;
import com.parabank.qa.pages.CustomerLogin;
import com.parabank.qa.util.TestUtil;

public class AccountsOverviewTest extends TestBase {
	
	CustomerLogin CLogin;
	TestUtil testUtil;
	AccountsOverview AccOver;
	
public AccountsOverviewTest() {
		super();
	}

@BeforeMethod
public void setUp() {
	initialization();
	CLogin = new CustomerLogin();
	CLogin.Login(prop.getProperty("username"), prop.getProperty("password"));
	CLogin.LoginButton();
	AccOver =new AccountsOverview();
}

@AfterMethod
public void tearDown() {
	driver.quit();
}

@Test
public void AccountsOverviewTitleTest() {
	String title = AccOver.validateAccountsOverviewTitle();
	Assert.assertEquals(title, "ParaBank | Accounts Overview");
}
	
@Test
public void validateAccountTabTest() {
	Assert.assertTrue(AccOver.validateAccountTab());
}

@Test
public void validateBalancetTabTest() {
	Assert.assertTrue(AccOver.validateBalanceTab());
}

@Test
public void validateAvailableAmountTabTest() {
	Assert.assertTrue(AccOver.validateAvailableAmountTab());
}
	
public void validateAccounttextlinkTitleTest() {
	String title = AccOver.validateAccounttextlink();
	Assert.assertEquals(title, "ParaBank | Account Activity");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
