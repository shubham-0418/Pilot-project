package com.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.Locators.CompanyLocators;
import com.util.HelperClass;

public class CompanyAction {
	CompanyLocators companyLocators = null;
	String publisherName,publisherCity,publisherEmail,publisherContact,publisherMobile,publisherPhone,publisherSubject,publisherComment;
	
	 // Constructor initializes companyLocators and sets up PageFactory
	public CompanyAction() {
		this.companyLocators = new CompanyLocators();
		PageFactory.initElements(HelperClass.getDriver(), companyLocators);
	}
	
	// Clicks on the "About Us" link
	public void clickonAboutUs() {
		companyLocators.aboutus.click();
	}
	
	// Returns text from the "About Us" section
	public String viewonAboutUs() {
		return companyLocators.assertaboutus.getText();
	}
	
	// Clicks on the "Publisher Partner" link
	public void clickonPublisherPartner() {
		companyLocators.publisherpartner.click();
	}
	
	// Sets the publisher's name
	public void setPublisherName(String publisherName) {
		companyLocators.publisherTxtname.sendKeys(publisherName);
	}
	
	public void setPublisherContact(String publisherContact) {
		companyLocators.publisherTxtPersoncontact.sendKeys(publisherContact);
	}
	
	 // Sets the contact person's name
	public void setCityName(String publisherCity) {
		companyLocators.publisherTxtcity.sendKeys(publisherCity);
	}
	
	// Sets the city name
	public void setEmail(String publisherEmail) {
		companyLocators.publisherTxtemail.sendKeys(publisherEmail);
	}
	
	 // Sets the publisher's email
	public void setMobile(String publisherMobile) {
		companyLocators.publisherTxtmob.sendKeys(publisherMobile);
	}
	
	// Sets the publisher's mobile number
	public void setPhone(String publisherPhone) {
		companyLocators.publisherTxtphone.sendKeys(publisherPhone);
	}
	
	// Sets the subject for the publisher
	public void setSubject(String publisherSubject) {
		companyLocators.publisherTxtsub.sendKeys(publisherSubject);
	}
	
	// Sets comments for the publisher
	public void setComment(String publisherComment) {
		companyLocators.publisherTxtcmt.sendKeys(publisherComment);
	}
	
	// Clicks the "Submit" button for publisher details
	public void ClickSubmit() {
		companyLocators.publisherSubmit.click();
	}
	
	// Reads publisher details from a properties file and submits them
	public void EnterPublisherDetails() {
		File file = new File("C:\\Users\\sangadi\\eclipse-workspace\\BuyBooksIndia\\src\\test\\resources\\PropertiesFile\\PublisherDetails.properties");
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
		 publisherName = prop.getProperty("NameofPublisher");
		 publisherContact = prop.getProperty("PersonName");
		 publisherCity = prop.getProperty("city");
		 publisherEmail = prop.getProperty("Email");
		 publisherMobile = prop.getProperty("mobile");
		 publisherPhone = prop.getProperty("phone");
		 publisherSubject = prop.getProperty("subject");
		 publisherComment = prop.getProperty("comment");
		 
		 this.setPublisherName(publisherName);
		 this.setPublisherContact(publisherContact);
		 this.setCityName(publisherCity);
		 this.setEmail(publisherEmail);
		 this.setMobile(publisherMobile);
		 this.setPhone(publisherPhone);
		 this.setSubject(publisherSubject);
		 this.setComment(publisherComment);
		 this.ClickSubmit();
	}
	
	public void clickonContactUs() {
		companyLocators.contactus.click();
	}
	
	public void setConatctName(String conatctName) {
		companyLocators.contactTxtname.sendKeys(conatctName);
	}
	
	public void setContactEmail(String contactEmail) {
		companyLocators.contactTxtemail.sendKeys(contactEmail);
	}
	
	public void setContactNum(String contactPhone) {
		companyLocators.contactTxtphone.sendKeys(contactPhone);
	}
	
	public void setContactMsg(String contactMsg) {
		companyLocators.contactTxtmsg.sendKeys(contactMsg);
	}
	
	public void EnterContactDeatils() {
		File file1 = new File("C:\\Users\\sangadi\\eclipse-workspace\\BuyBooksIndia\\src\\test\\resources\\PropertiesFile\\ContactUsDetails.properties");
		FileInputStream fileInput1 = null;
		try {
			fileInput1 = new FileInputStream(file1); 
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		Properties prop1 = new Properties();
		try {
			prop1.load(fileInput1);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		String contactName = prop1.getProperty("Name");
		String contactEmail = prop1.getProperty("Email");
		String contactPhone = prop1.getProperty("Phone");
		String contactMsg = prop1.getProperty("Message");
		
		this.setConatctName(contactName);
		this.setContactEmail(contactEmail);
		this.setContactNum(contactPhone);
		this.setContactMsg(contactMsg);
	}
	
	public String ViewWhatsAppNum() {
		return companyLocators.contactTxtnum.getText();
	}
	
	
	public void clickonPrivacyPolicy() {
		companyLocators.privacyplcy.click();
	}
	public void readPrivacyPolicy() {
		String policyTxt = companyLocators.privacyTxt.getText();
		try {
			PrintStream ps = new PrintStream(new File("C:\\Users\\sangadi\\Desktop\\BuyBooksIndia\\TextFile\\PrivacyPolicy.txt"));
			System.setOut(ps);
			ps.println(policyTxt);
		}
		catch(IOException e){
			e.getStackTrace();
		}
	}
	
	// Clicks on the "Disclaimer" link
	public void clickonDisclaimer() {
		companyLocators.disclaimer.click();
	}
	
	 // Validates the text in the disclaimer section
	public String validateDisclaimer() {
		return companyLocators.viewDisclaimer.getText();
	}

}

