package com.vtigercrm.qa.config;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;


public class ReadProperties {

	public static void main(String[] args) throws IOException {


		//how to read the properties class.
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream ("C:/Users/HP/eclipse-workspace/AID_Selenium_POM/src/main"
				+ "/java/com/vtigercrm/qa/config/config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));

	}

}
