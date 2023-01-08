package com.parabank.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.CustomerLogin;
import com.parabank.qa.pages.HomePage;
import com.parabank.qa.pages.OpenNewAccount;
import com.parabank.qa.util.TestUtil;

public class OpenNewaccountTest extends TestBase {

	CustomerLogin CLogin;
	TestUtil testUtil;
	OpenNewAccount ONA;
	HomePage homepage;
	
public OpenNewaccountTest() {
	super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		CLogin = new CustomerLogin();
		CLogin.Login(prop.getProperty("username"), prop.getProperty("password"));
		CLogin.LoginButton();
		homepage = new HomePage();
		homepage.ClickOpenNewAccount();
		ONA = new OpenNewAccount();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();}

	@Test
	public void ONATitleTest() {
	String Title = ONA.validateOpenNewAccountTitle();
		Assert.assertEquals(Title, "ParaBank | Open Account");
	}
		
	@Test
	public void WhattypeofaccountDisplayedTest() {
		Assert.assertTrue(ONA.validateWhattypeofaccountDisplayed());
	}
	
	@Test
	public void CheckingoptionTest() {
		ONA.validateCheckingOption();
   
	}
	
	@Test
	public void OpenAccountTest() {
		ONA.validateSavingOption();
		ONA.validateOpenNewAccountBtn();
		Assert.assertTrue(ONA.validateAccountOpenResults());
	}
	
}
