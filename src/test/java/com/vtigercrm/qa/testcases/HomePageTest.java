package com.vtigercrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vtigercrm.pages.ContactsPage;
import com.vtigercrm.pages.LandOnHomePage;
import com.vtigercrm.pages.LoginPage;
import com.vtigercrm.qa.baseclass.TestBase;
import com.vtigercrm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	LandOnHomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		 initialization();
		 testUtil = new TestUtil();
		 contactsPage = new ContactsPage() ;
		 loginPage = new LoginPage();
		 homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test (priority= 1)
	public void verifyHomePageTitle() {
		String pageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(pageTitle, "Cogmento CRM","Home Page title not matching");
	}
	
	@Test(priority= 2)
	public void checkLoggedinUser() {
		Assert.assertTrue(homePage.verifyCorrectUsername());
	}
	
	@Test(priority=3)
	public void goToContactsPage() {
		//testUtil.switchToFrame();
		contactsPage = homePage.clickOnContactsLink();
		//return new ContactsPage();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	
}
