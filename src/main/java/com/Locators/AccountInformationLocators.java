package com.Locators;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import com.util.HelperClass;

public class AccountInformationLocators {
	static Select select;

	@FindBy(xpath = "//input[@name=\"first_name\"]")
	public WebElement FirstName;
	
	@FindBy(xpath = "//input[@name=\"last_name\"]")
	public WebElement LastName;

	
	@FindBy(xpath = "//*[@id=\"email_id\"]")
	public WebElement Email;
	
	
	
	
	public static  Select Gender() {
		 select = new Select(HelperClass.getDriver().findElement(By.name("gender"))) ;
		return select;
	}
	
	@FindBy(xpath = "//*[@id=\"changePassword_0\"]")
	public WebElement submit;
	
}
