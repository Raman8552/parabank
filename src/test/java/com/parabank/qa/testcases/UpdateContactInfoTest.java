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
import com.parabank.qa.pages.UpdateContactInfo;
import com.parabank.qa.util.TestUtil;
import com.parabank.qa.util.UCIDataProviderData;

public class UpdateContactInfoTest extends TestBase{

	UpdateContactInfo UCI;
	TestUtil testUtil;
	CustomerLogin CLogin;
	HomePage homepage;
	
	
	public UpdateContactInfoTest() {
		super();
		}

	@BeforeMethod
	public void setUp() {
		initialization();
		CLogin = new CustomerLogin();
		CLogin.Login(prop.getProperty("username"), prop.getProperty("password"));
		CLogin.LoginButton();
		homepage = new HomePage();
		homepage.ClickUpdateContactInfo();
		UCI= new UpdateContactInfo();
		}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		}
	
	@Test
	public void UpdateContactInfoTitleTest() {
	String Title = UCI.validateUpdateContactInfoPageTitle() ;
		Assert.assertEquals(Title, "ParaBank | Update Profile");
	}
	
	@DataProvider
	public Iterator<Object[]> getExcelData() {
	ArrayList<Object[]> it=UCIDataProviderData.getData();
	return it.iterator();
	}

	@Test(priority =2, dataProvider = "getExcelData")
	public void validaeUCIFormTest(String FirstName, String LastName, String Address, String City, String State, String ZipCode, String Phone ){
		UCI.validateUCIData(FirstName, LastName, Address, City, State, ZipCode, Phone);
		UCI.validateUpdateProfileBtn();
		if (FirstName.matches("^[a-zA-z]*$")) {
			String actualtitle = driver.getTitle();
			Assert.assertEquals(actualtitle, "ParaBank | Update Profile");
			}
		if (LastName.matches("^[a-zA-z]*$")) {
			String actualtitle = driver.getTitle();
			Assert.assertEquals(actualtitle, "ParaBank | Update Profile");
			}
		if (Address.matches("^[a-zA-Z0-9]*$")) {
			String actualtitle = driver.getTitle();
			Assert.assertEquals(actualtitle, "ParaBank | Update Profile");
			}  
		if (City.matches("^[a-zA-z]*$")) {
			String actualtitle = driver.getTitle();
			Assert.assertEquals(actualtitle, "ParaBank | Update Profile");
			}
		if (State.matches("^[a-zA-z]*$")) {
			String actualtitle = driver.getTitle();
			Assert.assertEquals(actualtitle, "ParaBank | Update Profile");
			}
		if (ZipCode.matches("^[a-zA-Z0-9]*$")) {
			String actualtitle = driver.getTitle();
			Assert.assertEquals(actualtitle, "ParaBank | Update Profile");
			}  
		if (Phone.matches("^[0-9]")) {
			String actualtitle = driver.getTitle();
			   Assert.assertEquals(actualtitle, "ParaBank | Update Profile");
			} 
	
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

