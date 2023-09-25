Feature: Login to "www.buybooksindia.com"

  Scenario: Browsing Drawing and Coloring Books
    Given user is  on homepage of www.buybooksindia.com
    And sort for newest
    Then select the book
    Then add to cart
    

Scenario: Browsing Essays and Letters
    Given user is  on homepage of www.buybooksindia.com
    And sort for Price:high to low
    Then select the book
    Then add to cart


 Scenario: Browsing Poems and  Rhymes
    Given user is  on homepage of www.buybooksindia.com
    And sort for Letter:A-Z
    Then select the book
    Then add to cart
