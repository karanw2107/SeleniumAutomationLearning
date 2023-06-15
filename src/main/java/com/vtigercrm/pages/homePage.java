package com.vtigercrm.pages;

import com.vtigercrm.qa.baseclass.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homePage extends TestBase {

	@FindBy(xpath="//span[contains(text(), 'Will Westin')]")
	WebElement LoggedUser;
	
	@FindBy (xpath = "//*[@href='#/contacts']")
	WebElement ContactsPageLink;
	

	@FindBy (xpath = "//*[@href='#/opportunities']")
	WebElement opportunitiesPageLink;
	

	@FindBy (xpath = "//*[@href='#/leads']   ")
	WebElement LeadsPageLink;
	

	@FindBy (xpath = "//*[@href='#/accounts']")
	WebElement AccountsPageLink;
	

	@FindBy (xpath = "//*[@href='#/quotes']")
	WebElement QuotesPageLink;
	
	@FindBy (xpath = "//*[@href='#/calendar']")
	WebElement CalendarPageLink;
	

	//initialization of page objects	 -- 	this is constructor
	public homePage() {		
		PageFactory.initElements(driver, this); //here 'this' means, it will initialize all the page factory objects for this class.
	}

	
	public String verifyHomePageTitle() {
		return driver.getTitle();	
		}
	
	
	public ContactsPage clicnkOnContactsPage() {
		ContactsPageLink.click();
		return new ContactsPage();
	}

	public Opportunitypage clicnkOnOpportunitiesPage() {
		opportunitiesPageLink.click();
		return new Opportunitypage();
	}	
}
