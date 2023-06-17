package com.vtigercrm.qa.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtigercrm.pages.ContactsPage;
import com.vtigercrm.pages.LandOnHomePage;
import com.vtigercrm.pages.LoginPage;
import com.vtigercrm.qa.baseclass.TestBase;
import com.vtigercrm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{

	
	LoginPage loginPage;
	ContactsPage contactsPage;
	LandOnHomePage homePage;
	TestUtil testUtil;
	Actions action;
	String sheetName = "Contacts";
	
	
	public ContactsPageTest() {
		super();// this keywork is used to call the main class. In this case the main class is 'TestBase'.
	}
	
	@BeforeMethod
	public void setUp() {
		
		 initialization();
		 testUtil = new TestUtil();
		 contactsPage = new ContactsPage();
		 loginPage = new LoginPage();
		 homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		 contactsPage= homePage.clickOnContactsLink();
	}
	
/*	@Test(priority=1)
	public void verifyContactsPageLabel() {
		Assert.assertTrue(contactsPage.verifyContactsLabel(),"You may have some issue as I am not able to find the label 'Contacts' on this page.");
	}
	
	@Test(priority=2)
	public void selectCheckboxforUser() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'View')]")).click();
		Thread.sleep(2000);
		contactsPage.selectContacts();
	}*/
	
	
	@DataProvider
	public Object [][] getTestDatafromExcel(String sheetName) {
		Object [][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=3, dataProvider="getTestDatafromExcel")
	public void validateCreateNewContact(String firstname, String lastname, String Company) {
		homePage.clickOnAddNewContactLink();
		contactsPage.createNewContact(firstname,lastname,Company);
		
	}
	
	
	@AfterMethod
	public void tearDown()  throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}
