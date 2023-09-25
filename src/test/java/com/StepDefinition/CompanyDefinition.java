package com.StepDefinition;

import com.Actions.CompanyAction;
import com.util.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CompanyDefinition {
	CompanyAction companyAction = new CompanyAction();
	
	@Given("User Should be on HomePage {string}")
	public void user_should_be_on_home_page(String s) {
	    HelperClass.openpage(s);
	}

	@When("User Navigates to Company and Clicks on AboutUs")
	public void user_navigates_to_company_and_clicks_on_about_us() {
	    companyAction.clickonAboutUs();
	}

	@Then("User Should Able to See Startup year in AboutUs")
	public void user_should_able_to_see_startup_year_in_about_us() {
	    Assert.assertTrue(companyAction.viewonAboutUs().contains("a startup founded in the year 2009"));
	}

	@When("User Navigates to Company and Clicks on Publisher Partnership")
	public void user_navigates_to_company_and_clicks_on_publisher_partnership() {
	    companyAction.clickonPublisherPartner();
	}

	@Then("User Should Able to Fill the Details")
	public void user_should_able_to_fill_the_details() {
	   companyAction.EnterPublisherDetails();
	}

	@Then("Click on Submit Button")
	public void click_on_submit_button() {
	    companyAction.ClickSubmit();
	}

	@When("User Navigates to Company and Clicks on ContacUs")
	public void user_navigates_to_company_and_clicks_on_contac_us() {
	    companyAction.clickonContactUs();
	}

	@Then("User Should Able to Fill the Contact Details")
	public void user_should_able_to_fill_the_contact_details() {
	   companyAction.EnterContactDeatils();
	}

	@Then("It has to take the Conatct Number")
	public void it_has_to_take_the_conatct_number() {
	    Assert.assertTrue(companyAction.ViewWhatsAppNum().contains("+91-8287084742"));
	}

	@When("User Navigates to Company and Clicks on Privacy Policy")
	public void user_navigates_to_company_and_clicks_on_privacy_policy() {
	   companyAction.clickonPrivacyPolicy();
	}

	@Then("User Should Read the Policy")
	public void user_should_read_the_policy() {
	    companyAction.readPrivacyPolicy();
	}

	@When("User Navigates to Company and Clicks on Disclaimer")
	public void user_navigates_to_company_and_clicks_on_disclaimer() {
	    companyAction.clickonDisclaimer();
	}

	@Then("User Should Validate the Disclaimer WebPage")
	public void user_should_validate_the_disclaimer_web_page() {
	    Assert.assertTrue(companyAction.validateDisclaimer().contains("Disclaimer"));
	}

}
