package com.StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.Actions.SearchActions;
import com.util.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDefination {
	SearchActions searchActions = new SearchActions();

	@Given("User should be on homepage {string}")
	public void user_should_be_on_homepage(String string) {
		HelperClass.openpage(string);
	}

	@When("User clicks the search bar")
	public void user_clicks_the_search_bar() {
		searchActions.clickSearch();
	}

	@Then("user Enters book {string} and {int} the details")
	public void user_enters_book_author_and_the_details(String details,Integer rowNumber)throws InterruptedException, InvalidFormatException, IOException {
		searchActions.searchUsingDataProvider(rowNumber);
	
	}

	
}
