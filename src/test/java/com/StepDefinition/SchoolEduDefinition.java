package com.StepDefinition;

import java.io.IOException;

import org.testng.Assert;

import com.Actions.SchoolEduAction;
import com.util.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SchoolEduDefinition {
	SchoolEduAction schoolEduAction = new SchoolEduAction();
	//CompanyAction companyAction = new CompanyAction();
	
	
	@Given("User should be on HomePage {string}")
	public void user_should_be_on_home_page(String string) {
		HelperClass.openpage(string);
	}

	@When("User Navigate to School Education and Click ShopBy Class")
	public void user_navigate_to_school_education_and_click_shop_by_class() throws InterruptedException {
	    schoolEduAction.moveToSchoolEdu();
	}

	@Then("User Click on Class6")
	public void user_click_on_class6() {
		schoolEduAction.clickShopClass6();
	   
	}

	@Then("User Click on Sort Option")
	public void user_click_on_sort_option() {
		schoolEduAction.clickShopSort();

	}

	@Then("User Selects Newest and assert text")
	public void user_selects_newest_and_assert_text() {
		schoolEduAction.clickonNewest();
		Assert.assertTrue(schoolEduAction.clickonNewestTxt().contains("CLASS 6"));

	}

	@When("User Navigates School Education and Click ShopBy Class")
	public void user_navigates_school_education_and_click_shop_by_class() throws InterruptedException {
	    schoolEduAction.moveToSchoolEdu();
	}

	@Then("User Click on Class10")
	public void user_click_on_class10() {
	   schoolEduAction.clickShopClass10();
	}

	@Then("User Clicks on Sort Option")
	public void user_clicks_on_sort_option() {
	    schoolEduAction.clickShopSort();
	}

	@Then("User Selects Price:Low-High and Print Price of Books")
	public void user_selects_price_low_high_and_print_price_of_books() {
	    schoolEduAction.clickonPriceLH();
	}

	@When("User Navigates School Education and Click ShopBy Board")
	public void user_navigates_school_education_and_click_shop_by_board() throws InterruptedException {
	    schoolEduAction.movesToSchoolEduBrd();
	}

	@Then("User Click on CBSE Option")
	public void user_click_on_cbse_option() {
	   schoolEduAction.clickCBSE();
	}

	@Then("User Selects Discount:Low-High and check the discount")
	public void user_selects_discount_low_high_and_check_the_discount() throws InterruptedException, IOException {
	    schoolEduAction.clickonDiscLH();
	}

	@Then("User Selects Discount:High-Low and check the discount")
	public void user_selects_discount_high_low_and_check_the_discount() {
	   schoolEduAction.clickonDiscHL();
	}
	
	

}
