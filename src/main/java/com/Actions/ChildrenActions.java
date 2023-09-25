package com.Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.Locators.Childrenlocators;
import com.util.HelperClass;

public class ChildrenActions {
	Childrenlocators childrenlocators = null;
	WebDriver driver;
	String bookName;
	
	public ChildrenActions () {
		this.childrenlocators=new Childrenlocators();
		PageFactory.initElements(HelperClass.getDriver(), childrenlocators);		
	}
	public void search() {
		childrenlocators.search.click();
	}
	
	public void searchbook(String str) {
		childrenlocators.search.sendKeys("CHILDREN AND YOUNG ADULT BOOKS",Keys.ENTER);
	}
	public void clickonBook() {
		childrenlocators.clickondrawing.click();
	}
	
	public void clickonBooks() {
		childrenlocators.clickoneassy.click();
	}

	public void clickonBoooks() {
		childrenlocators.clickonpoem.click();
	}
	
}

