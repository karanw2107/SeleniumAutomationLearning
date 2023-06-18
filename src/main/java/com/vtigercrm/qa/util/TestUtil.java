package com.vtigercrm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.vtigercrm.qa.baseclass.TestBase;

public class TestUtil extends TestBase{

	
	public static long PAGE_LOAD_TIMEOUT = 100;
	public static long IMPLICIT_WAIT = 100;
	
	
	public static String TESTDATA_SHEET_PATH = "C:/Users/HP/eclipse-workspace/AID_Selenium_POM"
			+ "/src/main/java/com/vtigercrm/qa/testdata/Book1.xlsx";
	
	static Workbook book;
	static Sheet sheet;

	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
		
	}
	
	public static Object[][] getTestData(String sheetName){
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for (int i = 0; i<sheet.getLastRowNum(); i++) {//this is for rows
				for (int k=0; k <sheet.getRow(0).getLastCellNum(); k++) {//this is for columns
					data[i][k] = sheet.getRow(i+1).getCell(k).toString();//here i+1 is used because, out data is staring from 2nd row.
				}
			}
			return data;
	}
	
}
