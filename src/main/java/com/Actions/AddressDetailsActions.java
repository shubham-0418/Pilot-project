package com.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.Locators.AddressDetailsLocators;
import com.util.HelperClass;

public class AddressDetailsActions {
	private String Email,Address,City,PinCode,Landmark,Telephone;
	AddressDetailsLocators addressDetailsLocators = null;
	
	public AddressDetailsActions() {
		addressDetailsLocators  = new AddressDetailsLocators();
		PageFactory.initElements(HelperClass.getDriver(), addressDetailsLocators);	
	}

	public void setEmail(String email) {
		addressDetailsLocators.Email.sendKeys(email);
	}

	public void setAddress(String address) {
		addressDetailsLocators.Address.sendKeys(address);
	}

	public void setCountry() {
		addressDetailsLocators.country().selectByVisibleText("India");
	}
	
	public void setState() {
		addressDetailsLocators.State().selectByVisibleText("Maharashtra");
	}

	public void setCity(String city) {
		addressDetailsLocators.City.sendKeys(city);
	}

	public void setPinCode(String pinCode) {
		addressDetailsLocators.PinCode.sendKeys(pinCode);
		
	}

	public void setLandmark(String landmark) {
		addressDetailsLocators.LandMark.sendKeys(landmark);
		
	}

	public void setTelephone(String telephone) {
		addressDetailsLocators.TelePhone.sendKeys(telephone);
		
	}
	
	public void clickSubmit() {
		addressDetailsLocators.SubmitBTN.click();
	}
	
	public void NavigateToAddress() {
		addressDetailsLocators.AddressTab.click();
	}
	
	public void addAddress() {
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
		
			
		this.Address = prop.getProperty("Address");
		this.City = prop.getProperty("City");
		this.Email = prop.getProperty("Email");
		this.PinCode = prop.getProperty("PineCode");
		this.Landmark = prop.getProperty("LandMark");
		this.Telephone = prop.getProperty("Telephone");
		
		this.setAddress(this.Address);
		this.setPinCode(this.PinCode);
		this.setEmail(this.Email);
		this.setLandmark(this.Landmark);
		this.setTelephone(Telephone);
		this.setCity(City);
		this.setCountry();
		this.setState();
	}
	
}
