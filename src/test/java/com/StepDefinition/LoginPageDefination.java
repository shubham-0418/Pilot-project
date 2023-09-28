package com.StepDefinition;

import org.testng.Assert;

import com.Actions.LoginActions;
import com.util.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefination {
	LoginActions loginActions = new LoginActions();

    // Step 1: Navigate to the login page
	@Given("user should be on login page {string}")
	public void user_should_be_on_login_page(String string) {
		HelperClass.openpage(string);
	}

    // Step 2: Enter the mobile number and click on generate OTP
	@When("user enter the mobile number and click on generate otp")
	public void user_enter_the_mobile_number_and_click_on_generate_otp() {
		loginActions.Login();
	}

    // Step 3: OTP will be generated, copy the OTP, and click on Login
	@Then("OTP will generated Copy the OTP and Click on Login")
	public void otp_will_generated_copy_the_otp_and_click_on_login() {
		loginActions.ClickToLogin();
	}

    // Step 4: Validate the user login success
	@Then("Validate the User Login success")
	public void validate_the_user_login_success() {
		Assert.assertEquals(loginActions.loginSuccess(), "Account Information");
	}

    // Step 5: User should be logged in
	@Given("user should be Logged In")
	public void user_should_be_logged_in() {
		
	}

    // Step 6: User enters the Account Information
	@When("user should enters the Account Information")
	public void user_should_enters_the_account_information() {
		
	}

    // Step 7: User clicks on submit button
	@Then("user clicks in submit button")
	public void user_clicks_in_submit_button() {
		
	}

    // Step 8: User clicks on Orders
	@When("user chick on Orders")
	public void user_chick_on_orders() {
		
	}

    // Step 9: User gets the order details
	@Then("user get the order details")
	public void user_get_the_order_details() {
		
	}

    // Step 10: User clicks on Address
	@When("user click on Address")
	public void user_click_on_address() {
		
	}

	
	@When("Enters the Address details")
	public void enters_the_address_details() {
		
	}

    // Step 12: User submits the address
	@Then("user submit the address")
	public void user_submit_the_address() {
		
	}
}
