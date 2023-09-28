/*
 * 	
 * 
 */
package com.Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Locators.SchoolEduLocators;
import com.google.common.io.Files;
import com.util.HelperClass;

//Implementing action class for  SchoolEduAction
public class SchoolEduAction {
//	ExtentTest test;
	SchoolEduLocators schooledulocators = null;
	
	// Constructor initializes schooledulocators and sets up PageFactory
	public SchoolEduAction() {
		this.schooledulocators = new SchoolEduLocators();
		PageFactory.initElements(HelperClass.getDriver(), schooledulocators);
	}
	

	//Click on ShopbyClass

	public void moveToSchoolEdu() throws InterruptedException {
		Actions act = new Actions(HelperClass.getDriver());
		act.moveToElement(schooledulocators.schoolEdu).perform();
		HelperClass.explicitWait().until(ExpectedConditions.elementToBeClickable(schooledulocators.shopclass));
		schooledulocators.shopclass.click();
	}
	
	// Clicks on "Class 6" within the School Education section
	public void clickShopClass6() {
		schooledulocators.class6.click();
	}
	
	public void clickShopSort() {
		schooledulocators.sortOption.click();
	}
	

	// Clicks on "Newest" in the School Education section and retrieves the text

	public void clickonNewest() throws InterruptedException {

		schooledulocators.newest.click();
		Thread.sleep(1000);
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		test.log(Status.INFO, "Asserting the price of new books");
		schooledulocators.assertnew.getText();
	}
	
    // Returns the text after clicking on "Newest" in the School Education section
	public String clickonNewestTxt() {
		return schooledulocators.assertnew.getText();
	}
	
    // Clicks on "Class 10" within the School Education section
	public void clickShopClass10() {
		schooledulocators.class10.click();
	}
	

  
	//Check on Price Low to high
	public void clickonPriceLH() throws InterruptedException {
		schooledulocators.LowtoHigh.click();
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> price = HelperClass.getDriver().findElements(By.xpath("//span[@class='price product-price']"));
		Thread.sleep(1000);
		for(int i=0;i<price.size();i++) {
			String sortedPrice = price.get(i).getText();
			System.out.println(sortedPrice);
		}
	}
	

    // Moves the mouse pointer to the "School Education" element and clicks on "Shop Board"
	public void movesToSchoolEduBrd() throws InterruptedException {
		Actions act1 = new Actions(HelperClass.getDriver());
		act1.moveToElement(schooledulocators.schoolEdu).perform();
		HelperClass.explicitWait().until(ExpectedConditions.elementToBeClickable(schooledulocators.shopboard));
		schooledulocators.shopboard.click();
	}
	

	//Click on CBSE Books

	public void clickCBSE() {
		schooledulocators.cbse.click();
		schooledulocators.sortOption.click();
	}
	

    // Clicks on "Discount Low to High" and takes a screenshot

	public void clickonDiscLH() throws InterruptedException, IOException {
		schooledulocators.DLowtoHigh.click();
		Thread.sleep(1000);
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		File src = ((TakesScreenshot)HelperClass.getDriver()).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("src/test/resources/Screenshots/DiscLowtotHigh.png") );
		
	}
	
    // Clicks on "Discount High to Low" and retrieves the sorted discounts
	public void clickonDiscHL() {
		schooledulocators.DHightoLow.click();
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> dprice = HelperClass.getDriver().findElements(By.xpath("//div[@class='price-percent-reduction3']"));
		for(int i=0;i<dprice.size();i++) {
			String sortedDisc = dprice.get(i).getText();
			System.out.println(sortedDisc);
		}
	}
	
	
}
