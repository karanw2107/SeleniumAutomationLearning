package com.vtigercrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtigercrm.qa.baseclass.TestBase;

public class LoginPage extends TestBase {

	
	//Page Factory or Object Reporsitory
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id='login-button']")
	WebElement loginbutton;
	
	
	
	//initialization of page objects	 -- 	this is constructor
	public LoginPage() {		
		PageFactory.initElements(driver, this); //here 'this' means, it will initialize all the page factory objects for this class.
	}

	
	public String validateLoginPageTitle() {
				return driver.getTitle();	
				}
	
	public homePage login (String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		
		return new homePage();
	}
}
















