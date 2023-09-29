Feature: Validating the wishlist

@MyWishlist
Scenario: User validates the My wishlist
		Given User should be on homepage "https://www.buybooksindia.com/"
    When User clicks the search bar
    And user enter books name and click on book
    Then User add the book to wish list 
    And check whether book is added to wish list 