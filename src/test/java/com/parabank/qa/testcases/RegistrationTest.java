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
import com.parabank.qa.pages.Registration;
import com.parabank.qa.util.DataProviderData;
//import com.parabank.qa.util.ExcelSheet;
import com.parabank.qa.util.TestUtil;

public class RegistrationTest extends TestBase{
CustomerLogin CLogin;
Registration registration;
TestUtil testUtil;


public RegistrationTest() {
super();
}

@BeforeMethod
public void setUp() {
initialization();
CLogin = new CustomerLogin();
registration= CLogin.validateRegisterlink();

}
@AfterMethod
public void tearDown1() {
driver.close();
}
@Test (priority =1)
public void RegistrationPageTitleTest() {
String title = registration.validateRegistrationPageTitle();
Assert.assertEquals(title, "ParaBank | Register for Free Online Account Access");
}


@DataProvider
public Iterator<Object[]> getExcelData() {
ArrayList<Object[]> it=DataProviderData.getData();
return it.iterator();
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
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}    
if (FirstName.equals ("12^%#M")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (FirstName.equals("")) {
Assert.assertTrue(registration.emptyFnametext().contains("First name is required"));
}
if (FirstName.equals("  ")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (LastName.matches("^[a-zA-z]*$")) {
String actualtitle = driver.getTitle();
String expectedtitle = registration.validateWelcomeUserPageTitle();
Assert.assertEquals(actualtitle, expectedtitle);
}
if (LastName.matches("^[0-9]")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}    
if (LastName.equals ("12^%#M")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (LastName.equals("")) {
Assert.assertTrue(registration.emptyLNtext().contains("Last name is required"));
}
if (LastName.equals("  ")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (Address.matches("^[a-zA-Z0-9]*$")) {
String actualtitle = driver.getTitle();
String expectedtitle = registration.validateWelcomeUserPageTitle();
Assert.assertEquals(actualtitle, expectedtitle);
}  
if (Address.equals ("3@42 B@ll@d Dr!ve")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (Address.equals("")) {
Assert.assertTrue(registration.emptyAddtext().contains("Address is required"));
}
if (Address.equals("  ")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (City.matches("^[a-zA-z]*$")) {
String actualtitle = driver.getTitle();
String expectedtitle = registration.validateWelcomeUserPageTitle();
Assert.assertEquals(actualtitle, expectedtitle);
}
if (City.matches("^[0-9]")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}    
if (City.equals ("12^%#M")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (City.equals("")) {
Assert.assertTrue(registration.emptyCitytext().contains("City is required"));
}
if (City.equals("  ")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (State.matches("^[a-zA-z]*$")) {
String actualtitle = driver.getTitle();
String expectedtitle = registration.validateWelcomeUserPageTitle();
Assert.assertEquals(actualtitle, expectedtitle);
}
if (State.matches("^[0-9]")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}    
if (State.equals ("12^%#M")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (State.equals("")) {
Assert.assertTrue(registration.emptyStatetext().contains("State is required"));
}
if (State.equals("  ")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (ZipCode.matches("^[a-zA-Z0-9]*$")) {
String actualtitle = driver.getTitle();
String expectedtitle = registration.validateWelcomeUserPageTitle();
Assert.assertEquals(actualtitle, expectedtitle);
}  
if (ZipCode.equals ("12^%#M")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (ZipCode.equals("")) {
Assert.assertTrue(registration.emptyZCtext().contains("Zip Code is required"));
}
if (ZipCode.equals("  ")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (Phone.matches("^[0-9]")) {
String actualtitle = driver.getTitle();
String expectedtitle = registration.validateWelcomeUserPageTitle();
Assert.assertEquals(actualtitle, expectedtitle);
}
if (Phone.equals ("12^%#M")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (Phone.equals("  ")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (SSN.matches("^[0-9]")) {
String actualtitle = driver.getTitle();
String expectedtitle = registration.validateWelcomeUserPageTitle();
Assert.assertEquals(actualtitle, expectedtitle);
}
if (SSN.equals ("12^%#M")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
}
if (SSN.equals("")) {
Assert.assertTrue(registration.emptySSNtext().contains("SSN is required"));
}
if (SSN.equals("  ")) {
String actualtitle = driver.getTitle();
   Assert.assertEquals(actualtitle, "Signing up is easy!");
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

@Test
public void validateFMLIlink() {
	CLogin.validateForgotLoginInfoLink();
}

}

