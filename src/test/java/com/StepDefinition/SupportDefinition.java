package com.StepDefinition;

import com.Actions.SupportActions;
import com.util.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SupportDefinition {
	
	SupportActions supportAction = new SupportActions();
	
    // Step 1: User should be on the homepage
	@Given("User Should be on HomePage{string}")
	public void user_should_be_on_home_page_https_www_buybooksindia_com(String string) {
		HelperClass.openpage(string);
	}

    // Step 2: User navigates to Support and clicks on Terms and Conditions
	@When("User Navigates to Support and Clicks on Terms and condition")
	public void user_navigates_to_support_and_clicks_on_terms_and_condition() {
		supportAction.clickonTermsCondn();
	}

    // Step 3: User should be able to see the Terms and Conditions
	@Then("User Should Able to See the Terms and condition")
	public void user_should_able_to_see_the_terms_and_condition() {
		Assert.assertTrue(supportAction.assertTermsCondn().contains("Terms and Conditions"));
	}

    // Step 4: User navigates to Support and clicks on How to Order
	@When("User Navigates to Support and Clicks on How to Order")
	public void user_navigates_to_support_and_clicks_on_how_to_order() {
		supportAction.clickonOrder();
	}

    // Step 5: User should be able to see the How to Order information
	@Then("User Should Able to See the How to Order")
	public void user_should_able_to_see_the_how_to_order() {
		Assert.assertTrue(supportAction.assertOrder().contains("Any queries?"));
	}

    // Step 6: User navigates to Support and clicks on Shipping and Delivery
	@When("User Navigates to Support and Clicks on ShippingandDelivery")
	public void user_navigates_to_support_and_clicks_on_shippingand_delivery() {
		supportAction.clickonShippingpolicy();
	}

    // Step 7: User should be able to see the Shipping and Delivery information
	@Then("User Should Able to See the ShippingandDelivery")
	public void user_should_able_to_see_the_shippingand_delivery() {
		String msg = supportAction.assertShipping();
		System.out.println(msg);
	}

    // Step 8: User navigates to Support and clicks on Return Policy
	@When("User Navigates to Support and Clicks on ReturnPolicy")
	public void user_navigates_to_support_and_clicks_on_return_policy() {
		supportAction.clickonReturnPolicy();
	}

    // Step 9: User should be able to see the Return Policy information
	@Then("User Should Able to See the ReturnPolicy")
	public void user_should_able_to_see_the_return_policy() {
		String str = supportAction.assertReturn();
		System.out.println(str);
	}
	
    // Additional Step: User should be able to see queries 
	@Then("User Should Able to See the Queries")
	public void user_should_able_to_see_the_queries() {
		Assert.assertTrue(supportAction.assertOrder().contains("Any queries?"));

	}
}
