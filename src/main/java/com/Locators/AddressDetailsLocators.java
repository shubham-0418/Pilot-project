package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.util.HelperClass;

public class AddressDetailsLocators {
	static Select select;
	
	@FindBy(linkText = "Address")
	public WebElement AddressTab;
	
	@FindBy(xpath  = "//*[@name=\"u_email\"]")
	public WebElement Email;
	
	@FindBy(xpath = "//*[@name=\"u_address\"]")
	public WebElement Address;
	
	@FindBy(xpath = "//*[@name=\"u_city\"]")
	public WebElement City;
	
	@FindBy(xpath = "//*[@name=\"u_pincode\"]")
	public WebElement PinCode;
	
	@FindBy(xpath = "//*[@name=\"u_landmark\"]")
	public WebElement LandMark;
	
	@FindBy(xpath = "//*[@name=\"u_phone\"]")
	public WebElement TelePhone;
	
	public static  Select country() {
		 select = new Select(HelperClass.getDriver().findElement(By.name("u_country"))) ;
		return select;
	}
	
	public static  Select State() {
		 select = new Select(HelperClass.getDriver().findElement(By.name("u_state"))) ;
		return select;
	}
	
	
	@FindBy(xpath = "//*[@id=\"changePassword_0\"]")
	public WebElement SubmitBTN;
	
}
