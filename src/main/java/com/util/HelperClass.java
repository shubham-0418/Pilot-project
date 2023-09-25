package com.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HelperClass {
private static HelperClass helperClass;
	
	private static WebDriver driver;
	private static WebDriverWait wait;
	//public final static int TIMEOUT =10;
	
	HelperClass(){
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if(helperClass==null) {
			helperClass=new HelperClass();
		}
	}

	public static void tearDown() {
		if(driver!=null){
//			driver.close();
//			driver.quit();
		}

		helperClass=null;
	}
	}



