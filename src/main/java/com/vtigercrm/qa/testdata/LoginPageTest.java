package com.vtigercrm.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vtigercrm.qa.baseclass.TestBase;
import com.vtigercrm.pages.LoginPage;
import com.vtigercrm.pages.ContactsPage;



public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	ContactsPage contactsPage;
	
	
	public LoginPageTest() {
		super();// this keywork is used to call the main class. In this case the main class is 'TestBase'.
	}
	
	
	@BeforeMethod
	public void setUp() {
		
		 initialization();
		 loginPage = new LoginPage();
	}
	
	
	@Test(priority=1)
	public void loginPageTitletest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "SuiteCRM");
	
	}
	
	@Test(priority=2)
	public void loginTest() {
		contactsPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
