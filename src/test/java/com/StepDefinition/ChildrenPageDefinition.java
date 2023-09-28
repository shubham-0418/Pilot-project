package com.StepDefinition;

import com.Actions.ChildrenActions;
import com.util.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ChildrenPageDefinition {
	
	ChildrenActions childrenActions = new ChildrenActions();
	
	// Step definitions for Cucumber scenarios

    // Step 1: Navigate to the homepage
	@Given("user is on homepage of {string}")
	public void user_is_on_homepage_of(String string) {
	    HelperClass.openpage(string);
	}

    // Step 2: Move to Children and Young, then click on Drawing and Colouring
	@When("User moves to Children and young click on drawing and colouring")
	public void user_moves_to_children_and_young_click_on_drawing_and_colouring() throws InterruptedException {
	    childrenActions.movetoChildrenYoungBar();
	    childrenActions.clickonDrawingColor();
	}

    // Step 3: Click on the sort option and select "Newest"
	@Then("User click sort option and select newest")
	public void user_click_sort_option_and_select_newest() {
	    childrenActions.clickonSort();
	}

	// Step 4: Select a book from the "Newest" section
	@Then("User selects a book from newest")
	public void user_selects_a_book_from_newest() {
	   childrenActions.clicknewestBook();
	}

    // Step 5: Add the selected drawing book to the cart
	@Then("add to cart drawing")
	public void add_to_cart_drawing() {
	    childrenActions.clickonAddtocartChildren();
	}

    // Step 6: Move to Essay and Letters, click on Essay and Letters
	@When("User moves to Children and young click on Essay and letters")
	public void user_moves_to_children_and_young_click_on_essay_and_letters() throws InterruptedException {
	    childrenActions.movetoChildrenYoungBar();
	    childrenActions.clickonEssayLetters();
	}

    // Step 7: Click on the sort option and select "Price High-Low"
	@Then("User click sort option and select price high-low")
	public void user_click_sort_option_and_select_price_high_low() {
	    childrenActions.sortPriceHL();
	}

    // Step 8: Select a book from the sorted list
	@Then("User selects a book from select price high-low")
	public void user_selects_a_book_from_select_price_high_low() {
	    childrenActions.clickPriceHLBook();
	}

    // Step 9: Add the selected essay book to the cart
	@Then("add to cart essay")
	public void add_to_cart_essay() {
	    childrenActions.addtoCartEssayLetter();
	}

    // Step 10: Move to Poem and Rhymes, click on Poem and Rhymes
	@When("User moves to Children and young click on Poem and Rhymes")
	public void user_moves_to_children_and_young_click_on_poem_and_rhymes() throws InterruptedException {
	   childrenActions.movetoChildrenYoungBar();
	   childrenActions.clickonPoemRhymes();
	}

    // Step 11: Click on the sort option and select "Letters A-Z"
	@Then("User click sort option and select letters A-Z")
	public void user_click_sort_option_and_select_letters_a_z() {
	    childrenActions.clickonSortLetterAZ();
	}

    // Step 12: Select a book from the sorted list
	@Then("User selects a book from select  letters A-Z")
	public void user_selects_a_book_from_select_letters_a_z() {
	    childrenActions.clickonLetterAZBook();
	}

    // Step 13: Add the selected poem book to the cart
	@Then("add to cart poem")
	public void add_to_cart_poem() {
	    childrenActions.addtoCartPoemsRhymes();
	}

    // Step 14: Click on MyCart and validate the products in the cart
	@When("User Clicks on MyCart")
	public void user_clicks_on_my_cart() {
	    childrenActions.clickonMainCart();
	}

	@Then("User Validates the Products present in cart")
	public void user_validates_the_products_present_in_cart() {
	    Assert.assertTrue(childrenActions.validatingMainCart().contains("30"));
	}

    // Step 15: Delete a product from the cart
	@Then("User deletes the product")
	public void user_deletes_the_product() {
	    childrenActions.deletingItemincart();
	}
}