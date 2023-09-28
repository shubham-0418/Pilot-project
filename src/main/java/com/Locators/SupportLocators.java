package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;

import com.util.HelperClass;

public class SupportLocators {
	
    // WebElements representing various elements related to support and policies
	@FindBy(xpath = "//a[text()=\"Terms of Use\"]")
	public  WebElement termsofUse;

	@FindBy(partialLinkText = "How to Order")
	public  WebElement howtoOrders;

	@FindBy(xpath = "//a[contains(text(),'Shipping Policy')]")
	public  WebElement shippingPolicy; 
	
	@FindBy(xpath=("//a[contains(text(),'Return Policy')]"))
	public  WebElement returnPolicy;
	
	@FindBy(xpath = "//strong[contains(text(),'Terms and Conditions')]")
	public  WebElement termTxt;

	@FindBy(xpath="//*//*[contains(text(),'Any queries?')]")
	public  WebElement orderTxt;

	@FindBy(xpath="//*[contains(text(),'Shipping Policy')]")
	public  WebElement shippingTxt;

	@FindBy(xpath="//*[contains(text(),'Return Policy')]")
	public  WebElement returnTxt;

}
	


