package com.StepDefinition;

//import org.testng.Assert;


import com.Actions.AccountInforamtionActions;
import com.Actions.AddressDetailsActions;
import com.Actions.LoginActions;
import com.util.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageDefination {
	LoginActions loginActions = new LoginActions();
	AccountInforamtionActions accountInforamtionActions = new AccountInforamtionActions();
	AddressDetailsActions addressDetailsActions = new AddressDetailsActions();

	@Given("user should be on login page {string}")
	public void user_should_be_on_login_page(String string) {
		HelperClass.openpage(string);
	}
	
	@When("user enter the mobile number and click on generate otp")
	public void user_enter_the_mobile_number_and_click_on_generate_otp() {
		loginActions.trueLogin();
	}

	@Then("OTP will generated Copy the OTP and Click on Login")
	public void otp_will_generated_copy_the_otp_and_click_on_login() {
		loginActions.ClickToLogin();
	}
	
	@Then("OTP will generated Copy the OTP and Click on Login button")
	public void otp_will_generated_copy_the_otp_and_click_on_login_button() {
		loginActions.falseLogin();
	}

	
	@Then("Validate the User Login success")
	public void validate_the_user_login_success() {
		Assert.assertEquals(loginActions.loginSuccess(), "Account Information");
	}
	
	@Then("Validate the User Login")
	public void validate_the_user_login() {
		loginActions.ClickToFalseLogin();
		Assert.assertEquals(loginActions.FalseLogin(), "Invalid OTP");
	}

	@Given("user should be Logged In")
	public void user_should_be_logged_in() {
		Assert.assertTrue(HelperClass.getDriver().getCurrentUrl().contains("https://www.buybooksindia.com/control") );
	}

	@When("user should enters the Account Information")
	public void user_should_enters_the_account_information() {
		accountInforamtionActions.addInformations();
	}

	@Then("user clicks in submit button")
	public void user_clicks_in_submit_button() {
		accountInforamtionActions.clickSubmit();
	}
	
	@Then("Validate the Account Infomation")
	public void validate_the_infomation() {
	    Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://www.buybooksindia.com/control/myaccount.php");
	}

	@When("User Navigates to Address Page")
	public void user_navigates_to_address_page() {
		addressDetailsActions.NavigateToAddress();
	}

	@When("Enters the Address details")
	public void enters_the_address_details() {
		addressDetailsActions.addAddress();
	}

	@Then("user submit the address")
	public void user_submit_the_address() {
		addressDetailsActions.clickSubmit();
	}
	
	
	@Then("Validate the Address Details")
	public void validate_the_address_details() {
		Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://www.buybooksindia.com/control/myaddress.php");
	}

}
