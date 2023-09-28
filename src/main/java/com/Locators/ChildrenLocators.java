package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import com.util.HelperClass;

public class ChildrenLocators {
	
    // WebElements representing various elements on the Children & Young Adult page
	@FindBy(xpath = "//a[contains(text(),'Children & Young Adult ')]")
	public WebElement movetoChilderYoung;
	
	
	@FindBy(xpath = "//a[contains(text(),'Drawing & Colouring')]")
	public WebElement clickonDrawingColour;
	
	@FindBy(id = "sort")
	public WebElement clickonSort;
	
	@FindBy(xpath = "//option[contains(text(),'Newest')]")
	public WebElement clickonNewest;
	
	@FindBy(xpath = "//h2[contains(text(),'Hanukkah Coloring & Activity Book')]")
	public WebElement clickonNewBook;
	
	@FindBy(id = "cartadd")
	public WebElement addcartNewBook;
	
	@FindBy(xpath = "//a[contains(text(),'Essays & Letters')]")
	public WebElement clickonEssayLetter;
	
	@FindBy(xpath=("//option[contains(text(),'Price : High to Low')]"))
	public  WebElement clickonPriceHighLow;
	
	@FindBy(xpath=("//h2[contains(text(),'Letter Tracing Practice Workbook')]"))
	public  WebElement clickonEssayBook;

	@FindBy(id = "cartadd")
	public WebElement addtoCartEssayBook;
	
	@FindBy(xpath=("//a[contains(text(),'Poems & Rhymes')]"))
	public  WebElement clickonPoemRhymes;
	
	@FindBy(xpath = "//option[contains(text(),'Letter : A to Z')]")
	public  WebElement clickonAtoZ;
	
	@FindBy(xpath=("//h2[contains(text(),'365 Stories And Rhymes For Girls')]"))
	public  WebElement clickonAtoZBook;
	
	@FindBy(id="cartadd")
	public  WebElement addtoCartPoemRhymes;
	
	@FindBy(xpath=("//div[@id='shopping-cart-box-ontop']"))
	public  WebElement clickonMainCart;
	
	@FindBy(xpath = "//*[contains(text(),\"30%\")]")
	public WebElement validateMaincart;
		
    // Static method to locate and return the "Delete" element
	public static  WebElement DeleteItem(){
		 WebElement Delete = HelperClass.getDriver().findElement(RelativeLocator.with(By.tagName("div")).below(By.xpath("//*[text()=\"Action\"]")));
		return Delete;
	}
}
