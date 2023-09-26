Feature: Validating the Support section on  "www.buybooksindia.com"


@TermsandCondition

Scenario: User Validates the Terms and condition feature
Given User Should be on HomePage"https://www.buybooksindia.com/"
When User Navigates to Support and Clicks on Terms and condition
Then User Should Able to See the Terms and condition

@HowToOrder

Scenario:  User Validates How to Order feature
Given User Should be on HomePage"https://www.buybooksindia.com/"
When User Navigates to Support and Clicks on How to Order
Then User Should Able to See the Queries

@ShippingandDelivery

Scenario:  User Validates ShippingandDelivery feature
Given User Should be on HomePage"https://www.buybooksindia.com/"
When User Navigates to Support and Clicks on ShippingandDelivery
Then User Should Able to See the ShippingandDelivery


@ReturnPolicy

Scenario:  User Validates ReturnPolicy feature
Given User Should be on HomePage"https://www.buybooksindia.com/"
When User Navigates to Support and Clicks on ReturnPolicy
Then User Should Able to See the ReturnPolicy

 

 
 