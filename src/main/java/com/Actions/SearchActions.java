package com.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Locators.SearchLocators;
import com.util.ExcelReader;
import com.util.HelperClass;

public class SearchActions {
	SearchLocators searchLocators =null;
	static String details,urls,BookName;
	

	static String excelFilePath = "C:\\Users\\shupatil\\Downloads\\Book-2.xls";
	static String sheetName = "Sheet1";
	public SearchActions() {
		searchLocators  = new SearchLocators();
		PageFactory.initElements(HelperClass.getDriver(),searchLocators);
	}
	
	public void clickSearch() {
		searchLocators.SearchBox.click();
	}
	
	public void searchUsingDataProvider(int rowNumber)throws InterruptedException, InvalidFormatException, IOException {
		ExcelReader excelReader = new ExcelReader();
		List<Map<String,String>> LoginData= excelReader.getData(excelFilePath, sheetName);

		details= LoginData.get(rowNumber).get("Details");
		urls= LoginData.get(rowNumber).get("URL");
		
		searchLocators.SearchBox.sendKeys(details,Keys.ENTER);
		Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), urls);
		
	}
	
	public void SearchAndEnter() {
		File file = new File("C:\\Users\\shupatil\\eclipse-workspace\\BuyBooksIndia\\src\\test\\resources\\PropertiesFile\\PublisherDetails.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file); 
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		this.BookName = prop.getProperty("Author");
		searchLocators.SearchBox.sendKeys(BookName,Keys.ENTER);
		searchLocators.TwoStateBook.click();
	}
}
