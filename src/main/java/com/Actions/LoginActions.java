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

	public LoginActions() {
		this.loginLocators = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginLocators);		
	}
	
	public void clickLogin() {
		loginLocators.btnLogin.click();
	}
	
	public void EnterNumber() {
		loginLocators.MobileNumber.sendKeys("8050511235");
	}
	
	public void ClickGenerateOTP() {
		loginLocators.GenerateOTP.click();
	}
	
	public void setOtP() {
		loginLocators.OTP.sendKeys(loginLocators.GetOTP().getText());
	}
	
	public void ClickToLogin() {
		loginLocators.Login.click();
	}
	
	public String loginSuccess() {
		return loginLocators.LoginSuccess.getText();
	}
	
	public void Login() {
		this.clickLogin();
		this.EnterNumber();
		this.ClickGenerateOTP();
		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),\"your\")]")));
		this.setOtP();
	}
}
