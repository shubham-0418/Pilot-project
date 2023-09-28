package com.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.google.common.io.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.Locators.SchoolEduLocators;
import com.util.HelperClass;


public class SchoolEduAction {
	SchoolEduLocators schooledulocators = null;
	
	// Constructor initializes schooledulocators and sets up PageFactory
	public SchoolEduAction() {
		this.schooledulocators = new SchoolEduLocators();
		PageFactory.initElements(HelperClass.getDriver(), schooledulocators);
	}
	
	// Moves the mouse pointer to the "School Education" element and clicks on "Shop Class"
	public void moveToSchoolEdu() throws InterruptedException {
		Actions act = new Actions(HelperClass.getDriver());
		act.moveToElement(schooledulocators.schoolEdu).perform();
		Thread.sleep(1000);
		schooledulocators.shopclass.click();
	}
	
	// Clicks on "Class 6" within the School Education section
	public void clickShopClass6() {
		schooledulocators.class6.click();
//		schooledulocators.sortOption.click();
	}
	
	public void clickShopSort() {
		schooledulocators.sortOption.click();
	}
	
	// Clicks on "Newest" in the School Education section and retrieves the text
	public void clickonNewest() {
		schooledulocators.newest.click();
		schooledulocators.assertnew.getText();
	}
	
    // Returns the text after clicking on "Newest" in the School Education section
	public String clickonNewestTxt() {
		return schooledulocators.assertnew.getText();
	}
	
    // Clicks on "Class 10" within the School Education section
	public void clickShopClass10() {
		schooledulocators.class10.click();
//		schooledulocators.sortOption.click();
	}
	
    // Clicks on "Price Low to High" and retrieves the sorted prices
	public void clickonPriceLH() {
		schooledulocators.LowtoHigh.click();
		List<WebElement> price = HelperClass.getDriver().findElements(By.xpath("//span[@class='price product-price']"));
		for(int i=0;i<price.size();i++) {
			String sortedPrice = price.get(i).getText();
			System.out.println(sortedPrice);
		}
	}
	
    // Moves the mouse pointer to the "School Education" element and clicks on "Shop Board"
	public void movesToSchoolEduBrd() throws InterruptedException {
		Actions act1 = new Actions(HelperClass.getDriver());
		act1.moveToElement(schooledulocators.schoolEdu).perform();
		Thread.sleep(1000);
		schooledulocators.shopboard.click();
	}
	
    // Clicks on "CBSE" within the School Education Board section and clicks the "Sort" option
	public void clickCBSE() {
		schooledulocators.cbse.click();
		schooledulocators.sortOption.click();
	}
	
    // Clicks on "Discount Low to High" and takes a screenshot
	public void clickonDiscLH() throws InterruptedException, IOException {
		schooledulocators.DLowtoHigh.click();
		Thread.sleep(1000);
		File src = ((TakesScreenshot)HelperClass.getDriver()).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("C:\\Users\\sangadi\\Desktop\\BuyBooksIndia\\Screenshot\\DiscLowtotHigh.png") );
	}
	
    // Clicks on "Discount High to Low" and retrieves the sorted discounts
	public void clickonDiscHL() {
		schooledulocators.DHightoLow.click();
		List<WebElement> dprice = HelperClass.getDriver().findElements(By.xpath("//div[@class='price-percent-reduction3']"));
		for(int i=0;i<dprice.size();i++) {
			String sortedDisc = dprice.get(i).getText();
			System.out.println(sortedDisc);
		}
	}
	
	
}
