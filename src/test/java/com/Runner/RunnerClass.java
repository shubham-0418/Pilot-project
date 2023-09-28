package com.Runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerClass {
	@CucumberOptions(

			features = {"src/test/resources/FeatureFile/Login.feature","src/test/resources/FeatureFile/wishlist.feature","src/test/resources/FeatureFile/School_Education.feature","src/test/resources/FeatureFile/Company.feature","src/test/resources/FeatureFile/children.feature","src/test/resources/FeatureFile/Support.feature"},
			glue="com.StepDefinition",
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			tags= ""

			)
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
		}

	}
}

