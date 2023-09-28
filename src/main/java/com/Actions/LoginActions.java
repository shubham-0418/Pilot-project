package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Locators.LoginLocators;
import com.util.HelperClass;

public class LoginActions {
	LoginLocators loginLocators = null;


	 // Constructor initializes loginLocators and sets up PageFactory

	//Login the page

	public LoginActions() {
		this.loginLocators = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginLocators);		
	}

	
	 // Clicks the "Login" button
	public void clickLogin() {
		loginLocators.btnLogin.click();
	}
	

	// Enters a mobile number

	public void EnterNumber() {
		loginLocators.MobileNumber.sendKeys("8050511235");
	}
	

	// Clicks the "Generate OTP" button

	public void ClickGenerateOTP() {
		loginLocators.GenerateOTP.click();
	}
	
	// Sets the OTP by fetching it from the page
	public void setOtP() {
		loginLocators.OTP.sendKeys(loginLocators.GetOTP().getText());
	}
	
	// Clicks the "Login" button after entering the OTP
	public void ClickToLogin() {
		loginLocators.Login.click();
	}
	
	 // Returns a message indicating login success
	public String loginSuccess() {
		return loginLocators.LoginSuccess.getText();
	}
	

	 // Performs the complete login process

	
	//Login Page, Enter MobileNumber, Enter OTP

	public void Login() {
		this.clickLogin();
		this.EnterNumber();
		this.ClickGenerateOTP();
		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),\"your\")]")));
		this.setOtP();
	}
}
