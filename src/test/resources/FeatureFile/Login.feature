Feature: Login Using Mobile number and otp

@InvalidLogin
Scenario: False Login
    Given user should be on login page "https://www.buybooksindia.com/login.php"
    When user enter the mobile number and click on generate otp
    Then OTP will generated Copy the OTP and Click on Login button
    And Validate the User Login 
    
@ValidLogin
Scenario: User Login
    Given user should be on login page "https://www.buybooksindia.com/login.php"
    When user enter the mobile number and click on generate otp
    Then OTP will generated Copy the OTP and Click on Login
    And Validate the User Login success

@UpdateAccountInfo
Scenario: Update Account Information
		Given user should be Logged In
		When user should enters the Account Information
		Then user clicks in submit button
		And Validate the Account Infomation
	
@Address
Scenario: Manage Address 
	Given user should be Logged In
	When User Navigates to Address Page
	And Enters the Address details
	Then user submit the address
	And Validate the Address Details