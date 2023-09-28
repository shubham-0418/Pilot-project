Feature: Children and Young Adults Section on webpage

Background:
  Given user is on homepage of "https://www.buybooksindia.com"


 Scenario: Browsing Drawing and Coloring Books
    #Given user is on homepage of "https://www.buybooksindia.com"
    When User moves to Children and young click on drawing and colouring
    Then User click sort option and select newest 
    And User selects a book from newest
    Then add to cart drawing
    

Scenario: Browsing Essays and Letters
    When User moves to Children and young click on Essay and letters
    Then User click sort option and select price high-low
    And User selects a book from select price high-low
    Then add to cart essay


 Scenario: Browsing Poems and  Rhymes
    #Given user is on homepage of "https://www.buybooksindia.com/" 
    When User moves to Children and young click on Poem and Rhymes
    Then User click sort option and select letters A-Z
    And User selects a book from select  letters A-Z
    Then add to cart poem
    
Scenario: Validating Cart and Deleting Item in Cart
#		Given user is on homepage of "https://www.buybooksindia.com/"
		When User Clicks on MyCart
		Then User Validates the Products present in cart
		Then User deletes the product
		
		 
		

    