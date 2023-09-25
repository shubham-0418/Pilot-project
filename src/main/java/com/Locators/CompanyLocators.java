package com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyLocators {
	@FindBy(linkText = "About Us") public WebElement aboutus;
	
	@FindBy(xpath = "//div[@class='content-text']") public WebElement assertaboutus;
	
	@FindBy(linkText = "Publisher Partnership") public WebElement publisherpartner;
	
	@FindBy(xpath = "//input[@id='pcname']") public WebElement publisherTxtname;
	
	@FindBy(xpath = "//input[@id='pname']") public WebElement publisherTxtPersoncontact;
	
	@FindBy(css  = "#pcity") public WebElement publisherTxtcity;
	
	@FindBy(xpath  = "//input[@id='pemail']") public WebElement publisherTxtemail;
	
	@FindBy(xpath = "//input[@id='pmobile']") public WebElement publisherTxtmob;
	
	@FindBy(css = "#puphone") public WebElement publisherTxtphone;
	
	@FindBy(xpath = "//input[@id='psubject']") public WebElement publisherTxtsub;
	 
	@FindBy(id  = "pdescription") public WebElement publisherTxtcmt;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]") public WebElement publisherSubmit;
	
	@FindBy(linkText = "Contact Us") public WebElement contactus;
	
	@FindBy(css = "#uname") public WebElement contactTxtname;
	
	@FindBy(css = "#email") public WebElement contactTxtemail;
	
	@FindBy(xpath = "//input[@id='phone']") public WebElement contactTxtphone;
	
	@FindBy(xpath = "//textarea[@id='umessage']") public WebElement contactTxtmsg;
	
	@FindBy(partialLinkText = "+91-82870847") public WebElement contactTxtnum;
	
	@FindBy(linkText = "Privacy Policy") public WebElement privacyplcy;
	
	@FindBy(xpath = "//div[@class='content-text']") public WebElement privacyTxt;
	
	@FindBy(linkText = "Disclaimer") public WebElement disclaimer;
	
	@FindBy(xpath = "//strong[contains(text(),'Disclaimer')]") public WebElement viewDisclaimer;

}
