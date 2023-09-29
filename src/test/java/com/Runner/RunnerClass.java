package com.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerClass {
	@CucumberOptions(

			features = {"src\\test\\resources\\FeatureFile"},
			glue="com.StepDefinition",
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			tags= ""

			)
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
//		@Override
//	    @DataProvider(parallel = true)
//	    public Object[][] scenarios() {
//	        return super.scenarios();
//		}

	}
}

