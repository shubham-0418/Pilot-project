package com.Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Locators.ChildrenLocators;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.util.HelperClass;

import lombok.experimental.Helper;

public class ChildrenActions {
	ExtentReports report;
	ExtentTest test;
	 ChildrenLocators childrenLocators = null;
	 
	// Constructor initializes childrenLocators and sets up PageFactory
	 public ChildrenActions() {
		 this.childrenLocators = new ChildrenLocators();
		 PageFactory.initElements(HelperClass.getDriver(), childrenLocators);
	 }
	 
	// Moves the mouse pointer to the "Children Young" element
	 public void movetoChildrenYoungBar() throws InterruptedException {
		 Actions act = new Actions(HelperClass.getDriver());
			act.moveToElement(childrenLocators.movetoChilderYoung).perform();
	 }
	 
	// Clicks on the "Drawing Color" option
	 public void clickonDrawingColor() {
		 HelperClass.wait.until(ExpectedConditions.elementToBeClickable(childrenLocators.clickonDrawingColour));        
		 childrenLocators.clickonDrawingColour.click();
	 }
	 
	 // Clicks on the "Sort" option and then selects "Newest" within the dropdown
	 public void clickonSort() {
		 childrenLocators.clickonSort.click();
		 childrenLocators.clickonNewest.click();
	 } 
	 
	// Clicks on the "Newest Book" element
	 public void clicknewestBook() {
		 childrenLocators.clickonNewBook.click();
	 }
	 
	// Clicks on the "Add to Cart" button for a new book
	 public void clickonAddtocartChildren() {
		 childrenLocators.addcartNewBook.click();
	}
	 
	// Clicks on the "Essay Letters" option
	 public void clickonEssayLetters() {
		 childrenLocators.clickonEssayLetter.click();
	 }
	 
	// Sorts the books by price from high to low
	 public void sortPriceHL() {
		 childrenLocators.clickonSort.click();
		 childrenLocators.clickonPriceHighLow.click();
	 }
	 
	 // Clicks on a book with a price sorted from high to low
	 public void clickPriceHLBook() {
		 childrenLocators.clickonEssayBook.click();
	 }
	 
	 // Adds an essay book to the cart
	 public void addtoCartEssayLetter() {
		 childrenLocators.addtoCartEssayBook.click();
	 }
	 
	// Clicks on the "Poem Rhymes" option
	 public void clickonPoemRhymes() {
		 childrenLocators.clickonPoemRhymes.click();
	 }
	 
	// Clicks on the "Sort" option and selects "A to Z" within the dropdown
	 public void clickonSortLetterAZ() {
		 childrenLocators.clickonSort.click();
		 childrenLocators.clickonAtoZ.click();
	 }
	 
	// Clicks on a book sorted alphabetically
	 public void clickonLetterAZBook() {
		 childrenLocators.clickonAtoZBook.click();
	 }
	 
	 // Adds a poem or rhyme book to the cart
	 public void addtoCartPoemsRhymes() {
		 childrenLocators.addtoCartPoemRhymes.click();
		 
	 }
	 
	// Clicks on the main cart link
	 public void clickonMainCart() {
		 childrenLocators.clickonMainCart.click();
	 }
	 
	 // Validates the text in the main cart
	 public String validatingMainCart() {
		 return childrenLocators.validateMaincart.getText();
	 }
	 
	// Deletes an item from the cart
	 public void deletingItemincart() {
		 JavascriptExecutor js = (JavascriptExecutor)HelperClass.getDriver();
			js.executeScript("window.scrollBy(0,300)","");
		 childrenLocators.DeleteItem().click();
		 Alert al = HelperClass.getDriver().switchTo().alert();
		 al.accept();
	 }	 
}

