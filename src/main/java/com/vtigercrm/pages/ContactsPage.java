package com.vtigercrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtigercrm.qa.baseclass.TestBase;

public class ContactsPage extends TestBase {


	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactLabel;
	
	@FindBy(xpath="//input[contains(@name,'first_name')]")
	WebElement firstName;
	
	@FindBy(xpath="//input[contains(@name,'last_name')]")
	WebElement lastName;
	
	@FindBy(xpath="//div[contains(@name,'company')]")
	WebElement companyName;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveButton;
	
public ContactsPage() {		
		PageFactory.initElements(driver, this);
	}
	
public boolean verifyContactsLabel() {
	return contactLabel.isDisplayed();
}
	
public void selectContacts() {
	//public void selectContacts(String name)
	driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[2]/td[1]/div")).click();
}

public void createNewContact(String fname, String lname, String comp) {
	firstName.sendKeys(fname);
	lastName.sendKeys(lname);
	companyName.sendKeys(comp);
	saveButton.click();
}

}
