package com.parabank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.parabank.qa.base.TestBase;
import com.parabank.qa.pages.CustomerLogin;
import com.parabank.qa.pages.Registration;
import com.parabank.qa.util.ExcelSheet;
import com.parabank.qa.util.TestUtil;

public class RegistrationTest extends TestBase{
	Registration registration;
	TestUtil testUtil;
	CustomerLogin CLogin;
	
	
	
	public RegistrationTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		CLogin = new CustomerLogin();
		registration= CLogin.validateRegisterlink();
		
	}
	
	@Test (priority =1)
	public void RegistrationPageTitleTest() {
		String title = registration.validateRegistrationPageTitle();
		Assert.assertEquals(title, "ParaBank | Register for Free Online Account Access");
	}
	
	
	@DataProvider
	public Object[][] getExcelData() {
		return ExcelSheet.getData();
	}
	
	@Test(priority =2, dataProvider = "getExcelData")
	public void validateRegistrationFormTest(String FirstName, String LastName, String Address, String City, String State, String ZipCode, String Phone, String SSN, String Username, String Password, String Confirm ){
		registration.RegistrationForm(FirstName, LastName, Address, City, State, ZipCode, Phone, SSN, Username, Password, Confirm);
		registration.RegBtn();
		if (FirstName.matches("^[a-zA-z]*$")) {
			String actualtitle = driver.getTitle();
			String expectedtitle = registration.validateWelcomeUserPageTitle();
			Assert.assertEquals(actualtitle, expectedtitle);
			}
		if (FirstName.matches("^[0-9]")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}    
		if (FirstName.equals ("12^%#M")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (FirstName.equals("")) {
			Assert.assertTrue(registration.emptyFnametext().contains("First name is required"));
			}	
		if (FirstName.equals("  ")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (LastName.matches("^[a-zA-z]*$")) {
			String actualtitle = driver.getTitle();
			String expectedtitle = registration.validateWelcomeUserPageTitle();
			Assert.assertEquals(actualtitle, expectedtitle);
			}
		if (LastName.matches("^[0-9]")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}    
		if (LastName.equals ("12^%#M")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (LastName.equals("")) {
			Assert.assertTrue(registration.emptyLNtext().contains("Last name is required"));
			}	
		if (LastName.equals("  ")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (Address.matches("^[a-zA-Z0-9]*$")) {
			String actualtitle = driver.getTitle();
			String expectedtitle = registration.validateWelcomeUserPageTitle();
			Assert.assertEquals(actualtitle, expectedtitle);
			}  
		if (Address.equals ("3@42 B@ll@d Dr!ve")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (Address.equals("")) {
			Assert.assertTrue(registration.emptyAddtext().contains("Address is required"));
			}	
		if (Address.equals("  ")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (City.matches("^[a-zA-z]*$")) {
			String actualtitle = driver.getTitle();
			String expectedtitle = registration.validateWelcomeUserPageTitle();
			Assert.assertEquals(actualtitle, expectedtitle);
			}
		if (City.matches("^[0-9]")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}    
		if (City.equals ("12^%#M")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (City.equals("")) {
			Assert.assertTrue(registration.emptyCitytext().contains("City is required"));
			}	
		if (City.equals("  ")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (State.matches("^[a-zA-z]*$")) {
			String actualtitle = driver.getTitle();
			String expectedtitle = registration.validateWelcomeUserPageTitle();
			Assert.assertEquals(actualtitle, expectedtitle);
			}
		if (State.matches("^[0-9]")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}    
		if (State.equals ("12^%#M")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (State.equals("")) {
			Assert.assertTrue(registration.emptyStatetext().contains("State is required"));
			}	
		if (State.equals("  ")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (ZipCode.matches("^[a-zA-Z0-9]*$")) {
			String actualtitle = driver.getTitle();
			String expectedtitle = registration.validateWelcomeUserPageTitle();
			Assert.assertEquals(actualtitle, expectedtitle);
			}  
		if (ZipCode.equals ("12^%#M")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (ZipCode.equals("")) {
			Assert.assertTrue(registration.emptyZCtext().contains("Zip Code is required"));
			}	
		if (ZipCode.equals("  ")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (Phone.matches("^[0-9]")) {
			String actualtitle = driver.getTitle();
			String expectedtitle = registration.validateWelcomeUserPageTitle();
			Assert.assertEquals(actualtitle, expectedtitle);
			}
		if (Phone.equals ("12^%#M")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}	
		if (Phone.equals("  ")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (SSN.matches("^[0-9]")) {
			String actualtitle = driver.getTitle();
			String expectedtitle = registration.validateWelcomeUserPageTitle();
			Assert.assertEquals(actualtitle, expectedtitle);
			}
		if (SSN.equals ("12^%#M")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}	
		if (SSN.equals("")) {
			Assert.assertTrue(registration.emptySSNtext().contains("SSN is required"));
			}
		if (SSN.equals("  ")) {
			String actualtitle = driver.getTitle();
		    Assert.assertEquals(actualtitle, "ParaBank | Register for Free Online Account Access");
			}
		if (Username.matches("^[a-zA-Z0-9]*$")) {
			String actualtitle = driver.getTitle();
			String expectedtitle = registration.validateWelcomeUserPageTitle();
			Assert.assertEquals(actualtitle, expectedtitle);
			}  
		if (Username.equals("")) {
			Assert.assertTrue(registration.emptyUNtext().contains("Username is required"));
			}	
		if (Password.equals("")) {
			Assert.assertTrue(registration.emptyPwdtext().contains("Password is required"));
			}	
		if (Confirm.equals("")) {
			Assert.assertTrue(registration.emptyConftext().contains("Password confirmation is required"));
			}	
	}	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
