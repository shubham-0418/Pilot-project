package com.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class RunnerClass {
	@CucumberOptions(
			features = {"src/test/resources/FeatureFile/children.feature","src\\test\\resources\\FeatureFile\\Support.feature"},
			glue="com.StepDefinition",
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

	}
}

