package com.vtigercrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtigercrm.qa.baseclass.TestBase;

public class LandOnHomePage extends TestBase {

	
	@FindBy(xpath="//b[contains(text(),'self')]")
	WebElement loggedinusername;
	
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	public LandOnHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();		
	}
	
	public boolean verifyCorrectUsername() {
		return loggedinusername.isDisplayed();
		
	}
	
	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}
	
	
	
	
	
	
	
	
	
}
