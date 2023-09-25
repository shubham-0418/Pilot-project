Feature: Navigate to School Education 

#@ShopByClassNew
Scenario: User able to sort books for class6
Given User should be on HomePage "https://www.buybooksindia.com/"
When User Navigate to School Education and Click ShopBy Class
Then User Click on Class6 
And  User Click on Sort Option 
Then User Selects Newest and assert text

#@ShopByClassPrice
Scenario: User able to sort books and print price of books for class10
Given User should be on HomePage "https://www.buybooksindia.com/"
When User Navigates School Education and Click ShopBy Class
Then User Click on Class10
And User Clicks on Sort Option
Then User Selects Price:Low-High and Print Price of Books

#@ShopByBoardDLH
Scenario: User able to sort books based on discount for CBSE Board
Given User should be on HomePage "https://www.buybooksindia.com/"
When User Navigates School Education and Click ShopBy Board 
Then User Click on CBSE Option
And User Clicks on Sort Option
Then User Selects Discount:Low-High and check the discount

#@ShopByBoardDHL
Scenario: User able to sort books based on discount for CBSE Board
Given User should be on HomePage "https://www.buybooksindia.com/"
When User Navigates School Education and Click ShopBy Board 
Then User Click on CBSE Option
And User Clicks on Sort Option
Then User Selects Discount:High-Low and check the discount





