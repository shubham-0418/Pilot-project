package com.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Locators.AccountInformationLocators;
import com.util.HelperClass;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AccountInforamtionActions {
	AccountInformationLocators accountInformationLocators = null;
	String Firstname;
	String LastName;
	String Email;
	
	public AccountInforamtionActions() {
		accountInformationLocators = new AccountInformationLocators();
		PageFactory.initElements(HelperClass.getDriver(), accountInformationLocators);		
		

	}

	public void setFirstname(String string) {
		accountInformationLocators.FirstName.clear();
		accountInformationLocators.FirstName.sendKeys(string);
		
		
	}
	
	public void setLasrname(String string) {
		accountInformationLocators.LastName.clear();
		accountInformationLocators.LastName.sendKeys(string);
	}
	
	public void setEmail(String string) {
		JavascriptExecutor jss = (JavascriptExecutor)HelperClass.getDriver();
		jss.executeScript("window.scrollBy(0,200)", "");
		
		accountInformationLocators.Email.clear();
		accountInformationLocators.Email.sendKeys(string);
	}
	
	public void setGender() {
		accountInformationLocators.Gender().selectByVisibleText("Male");
	}
	
	public void clickSubmit() {
		accountInformationLocators.submit.click();
	}
	

	public void addInformations() {
		
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
		
		this.Firstname = prop.getProperty("Firstname");
		this.LastName = prop.getProperty("LastName");
		this.Email = prop.getProperty("Email");
		
		this.setFirstname(this.Firstname);
		this.setLasrname(this.LastName);
		this.setEmail(this.Email);
		this.setGender();
	}
	

	

}
