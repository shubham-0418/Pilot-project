package com.StepDefinition;

import com.Actions.SearchActions;
import com.Actions.wishListActions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class wishListStepDefination {
	SearchActions searchActions = new SearchActions();
	wishListActions wishlistActions = new wishListActions();
	@When("user enter books name and click on book")
	public void user_enter_books_name_and_click_on_book() {
		searchActions.SearchAndEnter();
	}

	@Then("User add the book to wish list")
	public void user_add_the_book_to_wish_list() {
		wishlistActions.AddToWishList();
	}

	@Then("check whether book is added to wish list")
	public void check_whether_book_is_added_to_wish_list() {
		wishlistActions.GoToWishList();
		Assert.assertEquals(wishlistActions.AssertWishList(), "2 States the Story of My Marriage");
	}
}
