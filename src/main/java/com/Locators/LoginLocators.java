package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;

import com.util.HelperClass;

public class LoginLocators {

	//Locator for login button
	@FindBy(xpath = "//a[text()=\" Login\"]")
	public WebElement btnLogin;
	
	//Locator for MobileNumber
	@FindBy(xpath = "//*[@id=\"reg_phone\"]")
	public WebElement MobileNumber;
	
	//Locator for OTP
	@FindBy(xpath = "//*[@id=\"otp\"]")
	public WebElement GenerateOTP;
	
	public static WebElement GetOTP(){
		 WebElement GetOTP1 = HelperClass.getDriver().findElement(RelativeLocator.with(By.tagName("div")).below(By.xpath("//*[contains(text(),\"Fill in the Details\")]")));
		return GetOTP1;
	}
	
	
	@FindBy(xpath = "//*[@id=\"login\"]")
	public WebElement Login;
	
	@FindBy(xpath = "//*[@id=\"reg_fname\"]")
	public WebElement OTP;
	
	@FindBy(xpath = "//strong[text()=\"Account Information\"]")
	public WebElement LoginSuccess;
}
