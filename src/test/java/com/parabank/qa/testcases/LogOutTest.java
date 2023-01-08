package com.parabank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.CustomerLogin;
import com.parabank.qa.pages.HomePage;

public class LogOutTest extends TestBase {
	HomePage homepage;
	CustomerLogin CLogin;
	
	public LogOutTest() {
		super();
		}

	@BeforeMethod
	public void setUp() {
		initialization();
		CLogin = new CustomerLogin();
		CLogin.Login(prop.getProperty("username"), prop.getProperty("password"));
		CLogin.LoginButton();
		homepage = new HomePage();}
	
		
	@AfterMethod
		public void tearDown() {
			driver.quit();
			}
	
	@Test
	public void validateLogOut() {
		homepage.ClickLogOut();
		String Actual = CLogin.validateCLoginPageTitle();
		Assert.assertEquals(Actual, "ParaBank | Welcome | Online Banking");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
