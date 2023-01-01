package com.parabank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.CustomerLogin;
import com.parabank.qa.util.TestUtil;

public class CustomerLoginTest extends TestBase{
	TestUtil testUtil;
	CustomerLogin CLogin =new CustomerLogin();
	
	public CustomerLoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@Test(priority = 1)
	public void validateCLoginPageTitleTest() {
		String title = CLogin.validateCLoginPageTitle();
		Assert.assertEquals(title, "ParaBank | Welcome | Online Banking");
	}
	
	@Test (priority = 2)
	public void LoginTest() {
		CLogin.Login(prop.getProperty("username"), prop.getProperty("password"));
		CLogin.LoginButton();
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, "ParaBank | Accounts Overview");

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
