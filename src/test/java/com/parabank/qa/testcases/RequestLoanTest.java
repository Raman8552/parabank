package com.parabank.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.CustomerLogin;
import com.parabank.qa.pages.HomePage;
import com.parabank.qa.pages.RequestLoan;
import com.parabank.qa.util.ReqLoanDataProviderData;
import com.parabank.qa.util.TestUtil;

public class RequestLoanTest extends TestBase{

	RequestLoan ReqLoan;
	TestUtil testUtil;
	CustomerLogin CLogin;
	HomePage homepage;
	
	
	public RequestLoanTest() {
		super();
		}

	@BeforeMethod
	public void setUp() {
		initialization();
		CLogin = new CustomerLogin();
		CLogin.Login(prop.getProperty("username"), prop.getProperty("password"));
		CLogin.LoginButton();
		homepage = new HomePage();
		homepage.ClickRequestLoan();
		ReqLoan = new RequestLoan();
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		}
	
	@Test
	public void RequestLoanpageTitleTest() {
	String Title = ReqLoan.validateRequestLoanPageTitle();
		Assert.assertEquals(Title, "ParaBank | Loan Request");
	}

	@DataProvider
	public Iterator<Object[]> getExcelData() {
	ArrayList<Object[]> it=ReqLoanDataProviderData.getData();
	return it.iterator();
	}
	
	@Test (priority =2, dataProvider = "getExcelData")
	public void validateReqLoanForm(String LoanAmount, String DownPayment) {
		ReqLoan.validateRequestLoanData(LoanAmount, DownPayment);
		ReqLoan.validateApplyNowBtn();
		if (LoanAmount.matches("^[0-9]")) {
			String actualtitle = driver.getTitle();
			   Assert.assertEquals(actualtitle, "ParaBank | Loan Request");
			}    
		if (LoanAmount.matches("^[a-zA-z]*$")) {
			Assert.assertTrue(ReqLoan.validateErrorText().contains("An internal error has occurred and has been logged"));
		}
		if(LoanAmount.equals("")) {
			Assert.assertTrue(ReqLoan.validateErrorText().contains("An internal error has occurred and has been logged"));
		}		
		if (DownPayment.matches("^[0-9]")) {
					String actualtitle = driver.getTitle();
					   Assert.assertEquals(actualtitle, "ParaBank | Loan Request");
		}    
		if (DownPayment.matches("^[a-zA-z]*$")) {
			Assert.assertTrue(ReqLoan.validateErrorText().contains("An internal error has occurred and has been logged"));
		}
		if(DownPayment.equals("")) {
			Assert.assertTrue(ReqLoan.validateErrorText().contains("An internal error has occurred and has been logged"));
		}		

		
			}

	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

