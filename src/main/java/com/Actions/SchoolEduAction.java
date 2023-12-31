/*
 * 	
 * 
 */
package com.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
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
	static SimpleDateFormat date = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
    static String timeStamp = date.format(new Date());
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
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(schooledulocators.shopclass));
		schooledulocators.shopclass.click();
	}
	
	// Clicks on "Class 6" within the School Education section
	public void clickShopClass6() {
		schooledulocators.class6.click();
	}
	
	//Clicks on the sort option
	public void clickShopSort() {
		schooledulocators.sortOption.click();
	}
	
	// Clicks on "Newest" in the School Education section and retrieves the text
	public void clickonNewest() throws InterruptedException {
		
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		schooledulocators.newest.click();
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
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> price = HelperClass.getDriver().findElements(By.xpath("//span[@class='price product-price']"));
		Thread.sleep(1000);
		for(int i=0;i<price.size();i++) {
			String sortedPrice = price.get(i).getText();
			//System.out.println(sortedPrice);
		}
	}
	
    // Moves the mouse pointer to the "School Education" element and clicks on "Shop Board"
	public void movesToSchoolEduBrd() throws InterruptedException {
		Actions act1 = new Actions(HelperClass.getDriver());
		act1.moveToElement(schooledulocators.schoolEdu).perform();
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(schooledulocators.shopboard));
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
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		File src = ((TakesScreenshot)HelperClass.getDriver()).getScreenshotAs(OutputType.FILE);
		String FileSource = "src/test/resources/Screenshots/"+timeStamp+"DiscLowtotHigh.png";
		System.out.println(FileSource);
		Files.copy(src,new File(FileSource) );	
	}
	
    // Clicks on "Discount High to Low" and retrieves the sorted discounts
	public void clickonDiscHL() {
		schooledulocators.DHightoLow.click();
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		List<WebElement> dprice = HelperClass.getDriver().findElements(By.xpath("//div[@class='price-percent-reduction3']"));
		for(int i=0;i<dprice.size();i++) {
			String sortedDisc = dprice.get(i).getText();
			//System.out.println(sortedDisc);
		}
	}
	
}
