package com.vtigercrm.qa.util;

import com.vtigercrm.qa.baseclass.TestBase;

public class TestUtil extends TestBase{

	
	public static long PAGE_LOAD_TIMEOUT = 100;
	public static long IMPLICIT_WAIT = 100;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
		
	}
	
}
