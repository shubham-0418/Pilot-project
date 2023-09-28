package com.Actions;

import org.openqa.selenium.support.PageFactory;

import com.Locators.SearchLocators;
import com.util.HelperClass;

public class wishListActions {
	SearchLocators searchLocators =null;

	public wishListActions() {
		searchLocators  = new SearchLocators();
		PageFactory.initElements(HelperClass.getDriver(),searchLocators);
	}
	
	public void AddToWishList() {
		searchLocators.BtnWishList.click();
	}
	
	public void GoToWishList() {
		searchLocators.IconWishList.click();
	}
	
	public String AssertWishList() {
		return searchLocators.TwoStateBook.getText();
	}
	
	
}
