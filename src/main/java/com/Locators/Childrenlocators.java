package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Childrenlocators {
	
	@FindBy(xpath=("//a[contains(text(),'Children & Young Adult ')]"))
	public static WebElement search;
	
	@FindBy(xpath=("//span[@class='page-heading-title search-title']"))
	public static WebElement clickondrawing;
	
	@FindBy(id=("id=\"sort\""))
	public static WebElement clickonnewest;
	
	@FindBy(xpath=("//span[@class='page-heading-title search-title']"))
	public static WebElement clickoneassy;
	
	@FindBy(xpath=("//h1[@class='page-heading']//child::span"))
	public static WebElement clickonpoem;
	

}
