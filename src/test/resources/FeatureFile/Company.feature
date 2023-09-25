Feature: Validating the Company Feature

#@Aboutus
Scenario: User Validates the About Us feature 
Given User Should be on HomePage "https://www.buybooksindia.com/"
When User Navigates to Company and Clicks on AboutUs
Then User Should Able to See Startup year in AboutUs

#@PublisherPartner
Scenario: User Should Fill the Details of Publisher Company
Given User Should be on HomePage "https://www.buybooksindia.com/"
When User Navigates to Company and Clicks on Publisher Partnership
Then User Should Able to Fill the Details
Then Click on Submit Button

#@ContactUs
Scenario: User Should Fill the Detials in ContactUs Page
Given User Should be on HomePage "https://www.buybooksindia.com/"
When User Navigates to Company and Clicks on ContacUs
Then User Should Able to Fill the Contact Details
Then It has to take the Conatct Number

#@PrivacyPolicy
Scenario: User Should Validate the Privacy Policy
Given User Should be on HomePage "https://www.buybooksindia.com/"
When User Navigates to Company and Clicks on Privacy Policy
Then User Should Read the Policy

#@Disclaimer
Scenario: User Should Validate the Disclaimer Page
Given User Should be on HomePage "https://www.buybooksindia.com/"
When User Navigates to Company and Clicks on Disclaimer 
Then User Should Validate the Disclaimer WebPage 