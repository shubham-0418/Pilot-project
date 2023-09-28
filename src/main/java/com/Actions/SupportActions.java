package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Locators.SupportLocators;
import com.util.HelperClass;

public class SupportActions {
	SupportLocators supportLocators = null;
	
   // Constructor initializes supportLocators and sets up PageFactory
	public SupportActions() {
		this.supportLocators = new SupportLocators();
		PageFactory.initElements(HelperClass.getDriver(), supportLocators);
	}
	
    // Scrolls down the page and clicks on "Terms of Use"
	public void clickonTermsCondn() {
		JavascriptExecutor jss = (JavascriptExecutor)HelperClass.getDriver();
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		jss.executeScript("window.scrollBy(0,20000)", "");
		supportLocators.termsofUse.click();
	}
	
    // Clicks on the "How to Orders" link
	public void clickonOrder() {
		supportLocators.howtoOrders.click();
	}
	
    // Clicks on the "Shipping Policy" link after waiting for visibility
	public void clickonShippingpolicy() {
		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOf(supportLocators.shippingPolicy));
		supportLocators.shippingPolicy.click();
	}
	
    // Clicks on the "Return Policy" link
	public void clickonReturnPolicy() {
		supportLocators.returnPolicy.click();
	}
	
    // Returns the text from the "Terms and Condition" page
	public String assertTermsCondn() {
		return supportLocators.termTxt.getText();
	}
	
    // Returns the text from the "How to Orders" page
	public String assertOrder() {
		return supportLocators.orderTxt.getText();
	}
	
    // Returns the text from the "Shipping Policy" page
	public String assertShipping() {
		return supportLocators.shippingTxt.getText();
	}
	
    // Returns the text from the "Return Policy" page
	public String assertReturn() {
		return supportLocators.returnTxt.getText();
	}

}
