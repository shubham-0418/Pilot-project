Feature: Login Using Mobile number and otp

@login
Scenario: Login Using Valid OTP
    Given user should be on login page "https://www.buybooksindia.com/login.php"
    When user enter the mobile number and click on generate otp
    Then OTP will generated Copy the OTP and Click on Login
    And Validate the User Login success

#@AccountInformation   
#Scenario: Update Account Information
#		Given user should be Logged In
#		When user should enters the Account Information
#		Then user clicks in submit button
#
#@OrderList	
#Scenario: Order List
#	Given user should be Logged In
#	When user chick on Orders
#	Then user get the order details
#
#@AddressDetails	
#Scenario: Manage Address 
#	Given user should be Logged In
#	When user click on Address
#	And Enters the Address details
#	Then user submit the address