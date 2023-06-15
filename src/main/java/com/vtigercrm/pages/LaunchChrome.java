package com.vtigercrm.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:/SeleniumDrivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/automation-practice-form");
//	driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("karan");
//		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("wani");
//		driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("karan.wani@test.com");
//		driver.findElement(By.xpath("//*[@id='userNumber']")).sendKeys("9584116201");
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Select select = new Select (driver.findElement(By.xpath("//*[@id='products-orderby']"))); -- used to select from dropdown
		//select.selectByVisibleText("Price: Low to High");
		
		driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		Alert alert = driver.switchTo().alert(); // to switch on alert popup
		String alertmsg = alert.getText();
		
		if(alertmsg.equals("Please enter a 1valid user name")) {
			alert.accept();//click on OK button

		}
		
		System.out.println(alertmsg);
		//alert.dismiss();//it will cancel the popup
		
		
		
		
	}

}




//Systemgjrelgjl "cod
//Systemgjrelgjl "cod
