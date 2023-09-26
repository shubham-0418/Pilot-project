package com.StepDefinition;

import org.testng.Assert;

import com.Actions.LoginActions;
import com.util.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefination {
	LoginActions loginActions = new LoginActions();

	@Given("user should be on login page {string}")
	public void user_should_be_on_login_page(String string) {
		HelperClass.openpage(string);
	}

	@When("user enter the mobile number and click on generate otp")
	public void user_enter_the_mobile_number_and_click_on_generate_otp() {
		loginActions.Login();
	}

	@Then("OTP will generated Copy the OTP and Click on Login")
	public void otp_will_generated_copy_the_otp_and_click_on_login() {
		loginActions.ClickToLogin();
	}

	@Then("Validate the User Login success")
	public void validate_the_user_login_success() {
		Assert.assertEquals(loginActions.loginSuccess(), "Account Information");
	}

	@Given("user should be Logged In")
	public void user_should_be_logged_in() {
		
	}

	@When("user should enters the Account Information")
	public void user_should_enters_the_account_information() {
		
	}

	@Then("user clicks in submit button")
	public void user_clicks_in_submit_button() {
		
	}

	@When("user chick on Orders")
	public void user_chick_on_orders() {
		
	}

	@Then("user get the order details")
	public void user_get_the_order_details() {
		
	}

	@When("user click on Address")
	public void user_click_on_address() {
		
	}

	@When("Enters the Address details")
	public void enters_the_address_details() {
		
	}

	@Then("user submit the address")
	public void user_submit_the_address() {
		
	}
}
