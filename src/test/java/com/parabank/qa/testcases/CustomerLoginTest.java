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
	CustomerLogin CLogin;
	
	public CustomerLoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		CLogin = new CustomerLogin();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void validateCLoginPageTitleTest() {
		String title = CLogin.validateCLoginPageTitle();
		Assert.assertEquals(title, "ParaBank | Welcome | Online Banking");
	}
	
	@Test 
	public void LoginTest() {
		CLogin.Login(prop.getProperty("username"), prop.getProperty("password"));
		CLogin.LoginButton();
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, "ParaBank | Accounts Overview");
	}
	
	
	@Test
	public void ForgotInfoLinkTest() {
		CLogin.validateForgotLoginInfoLink();
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, "ParaBank | Customer Lookup");
	}
	
	@Test
	public void RegisterLinkTest() {
		CLogin.validateRegisterlink();
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
		}
	
	@Test
	public void emptyFieldsTextTest() {
		CLogin.Login("", prop.getProperty("password"));
		CLogin.LoginButton();
		String actualmsg = CLogin.emptyFieldsText();
		Assert.assertTrue(actualmsg.contains("Please enter a username and password"));
	}
	
	
}
