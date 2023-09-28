package com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchLocators {

	@FindBy(xpath = "//input[@name=\"keyword\"]")
	public WebElement SearchBox;
	
	@FindBy(xpath = "//*[text()=\"Five Point Someone (Tamil)\"]")
	public WebElement Chetenbhagatboox;
	
	
	@FindBy(xpath = "//*[@id=\"find-books\"]")
	public WebElement btnSearch;
	
	@FindBy(xpath  = "//*[contains(text(),'2 States the Story of My Marriage')]")
	public WebElement TwoStateBook;
	
	@FindBy(xpath  = "//*[contains(text(),'WishList')]")
	public WebElement BtnWishList;
	
	@FindBy(xpath  = "//span[@id='wish-count']")
	public WebElement IconWishList;
}
