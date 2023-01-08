package com.parabank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.CustomerLogin;
import com.parabank.qa.pages.FindTransactions;
import com.parabank.qa.pages.HomePage;
import com.parabank.qa.util.TestUtil;

public class FindTransactionsTest extends TestBase{

	FindTransactions FT;
	TestUtil testUtil;
	CustomerLogin CLogin;
	HomePage homepage;
	
	
	public FindTransactionsTest() {
		super();
		}

	@BeforeMethod
	public void setUp() {
		initialization();
		CLogin = new CustomerLogin();
		CLogin.Login(prop.getProperty("username"), prop.getProperty("password"));
		CLogin.LoginButton();
		homepage = new HomePage();
		homepage.ClickFindTransactions();
		FT = new FindTransactions();
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		}
	
	@Test
	public void FindTransactionspageTitleTest() {
	String Title = FT.validateFindTransactionsTitle();
		Assert.assertEquals(Title, "ParaBank | Find Transactions");
	}
	
	@Test
	public void FindByTransactionID() {
		FT.validateTransactionID();
		FT.validateFindTransactionBtn1();
		Assert.assertTrue(FT.ResultscreenbyID());
	}
	
	@Test
	public void FindByDate() {
		FT.validateDate();
		FT.validateFindTransactionBtn2();
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "ParaBank | Find Transactions");
	}
	
	@Test
	public void FindByDateRange() {
		FT.validateDateRange();
		FT.validateFindTransactionBtn3();
			String actual = driver.getTitle();
		Assert.assertEquals(actual, "ParaBank | Find Transactions");
	}
	
	@Test
	public void FindByAmount() {
		FT.validateAmount();
		FT.validateFindTransactionBtn4();
			String actual = driver.getTitle();
		Assert.assertEquals(actual, "ParaBank | Find Transactions");
	}
	
	
	
	
	
	
	
}
