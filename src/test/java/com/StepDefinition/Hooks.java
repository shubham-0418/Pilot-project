package com.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.util.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
	}
	
	@After
	public void takeScreenshot(Scenario scenario) throws IOException{
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) HelperClass.getDriver();
			byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr,"image/png","Screenshot");

		}else {
			TakesScreenshot ts = (TakesScreenshot) HelperClass.getDriver();
			byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr,"image/png","Screenshot");
		}
	}
	
	@After
	public static void teardown() {
		HelperClass.teardown();
	}

}
