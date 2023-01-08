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
import com.parabank.qa.pages.ForgotLoginInfo;
import com.parabank.qa.util.FMLIDataProviderData;
import com.parabank.qa.util.TestUtil;

public class ForgotLoginInfoTest extends TestBase{
	CustomerLogin CLogin;
	ForgotLoginInfo FMLI;
	TestUtil testUtil;
	
public ForgotLoginInfoTest() {
	super();
	}

@BeforeMethod
public void setUp() {
initialization();
CLogin = new CustomerLogin();
FMLI = CLogin.validateForgotLoginInfoLink();

}

@AfterMethod
public void tearDown() {
driver.close();}

@Test (priority =1)
public void ForgotLoginInfoPageTitleTest() {
String title = FMLI.validateForgotLoginInfoPageTitle();
Assert.assertEquals(title, "ParaBank | Customer Lookup");
}

@DataProvider
public Iterator<Object[]> getExcelData() {
ArrayList<Object[]> it=FMLIDataProviderData.getData();
return it.iterator();
}

@Test(priority =2, dataProvider = "getExcelData")
public void validateFMLIFormTest(String FirstName, String LastName, String Address, String City, String State, String ZipCode, String SSN ){
	FMLI.validateFMLIData(FirstName, LastName, Address, City, State, ZipCode, SSN);
	FMLI.validateFMLIBtn();
	if(FirstName.equals("")) {
		Assert.assertTrue(FMLI.emptyFnametext().contains("First name is required"));
	}
	if(LastName.equals("")) {
		Assert.assertTrue(FMLI.emptyLNtext().contains("Last name is required"));
	}
	if(Address.equals("")) {
		Assert.assertTrue(FMLI.emptyAddtext().contains("Address is required"));
	}
	if(City.equals("")) {
		Assert.assertTrue(FMLI.emptyCitytext().contains("City is required"));
	}
	if(State.equals("")) {
		Assert.assertTrue(FMLI.emptyStatetext().contains("State is required"));
	}
	if(ZipCode.equals("")) {
		Assert.assertTrue(FMLI.emptyZCtext().contains("Zip Code is required"));
	}
	if(SSN.equals("")) {
		Assert.assertTrue(FMLI.emptySSNtext().contains("SSN is required"));
	}
	
	
	
	
	
	
	
	

}	
}
