package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Locators.LoginLocators;
import com.util.HelperClass;

//Public class representing actions related to user login functionality
public class LoginActions {
	LoginLocators loginLocators = null;
	// Static mobile number used for login
	static String MobileNumber = "8050511235";
	static String OTP;

	// Constructor for LoginActions class, initializes LoginLocators using PageFactory
	public LoginActions() {
		this.loginLocators = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginLocators);		
	}
	
	// Method to click on the login button
	public void clickLogin() {
		loginLocators.btnLogin.click();
	}
	
	// enter mobile number in the login form
	public void EnterNumber() {
		loginLocators.MobileNumber.sendKeys(MobileNumber);
	}
	
	// click on the 'Generate OTP' button
	public void ClickGenerateOTP() {
		loginLocators.GenerateOTP.click();
	}
	
	public String getOtp() {
		return loginLocators.GetOTP().getText();
	}
	public void setOtP(String otp) {
		loginLocators.OTP.sendKeys(otp);
	}
	
	public void ClickToLogin() {
		loginLocators.Login.click();
	}
	
	public String loginSuccess() {
		return loginLocators.LoginSuccess.getText();
	}
	
	public String FalseLogin() {
		return loginLocators.FalseLogin.getText();
	}
	
	public void Login() {
		this.clickLogin();
		this.EnterNumber();
		this.ClickGenerateOTP();
		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),\"your\")]")));

	}
	
	public void trueLogin() {
		this.Login();
		 OTP = this.getOtp();
		 this.setOtP(OTP);
	}
	
	public void falseLogin() {
		this.Login();
		this.setOtP("000000");
	}
	
	public void ClickToFalseLogin() {
		loginLocators.Login.click();
		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Invalid OTP\"]")));
		
	}
	
}
