package com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchoolEduLocators {
	

    // WebElements representing various elements on the School Education page

	@FindBy(linkText = "School Education")
	public WebElement schoolEdu;
	
	@FindBy(linkText = "Shop by Class") 
	public WebElement shopclass;
	
	@FindBy(xpath = "//h4[contains(text(),'Class 6')]") 
	public WebElement class6;
	
	@FindBy(tagName = "select") 
	public WebElement sortOption;
	
	@FindBy(xpath = "//option[contains(text(),'Newest')]") 
	public WebElement newest;
	
	@FindBy(xpath = "//span[contains(text(),'CLASS 6')]") 
	public WebElement assertnew;
	
	@FindBy(xpath = "//h4[contains(text(),'Class 10')]") 
	public WebElement class10;
	
	@FindBy(xpath = "//option[contains(text(),'Price : Low to High')]") 
	public WebElement LowtoHigh;
		
	@FindBy(partialLinkText = "Shop by Boa") 
	public WebElement shopboard;
	
	@FindBy(xpath = "//h4[contains(text(),'CBSE (Central Board of Secondary Education)')]") 
	public WebElement cbse;
	
	@FindBy(xpath = "//option[contains(text(),'Discount : Low to High')]") 
	public WebElement DLowtoHigh;
	
	@FindBy(xpath = "//option[contains(text(),'Discount : High to Low')]") 
	public WebElement DHightoLow;
	

}
