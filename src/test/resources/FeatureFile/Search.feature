Feature:  Validating search bar
  

  Scenario Outline: Validates Search Bar 
    Given User should be on homepage "https://www.buybooksindia.com/"
  	When User clicks the search bar
    Then user Enters book "<Details>" and <Validate> the details

    Examples: 
      | Details  | Validate | 
      |  Sheet1  | 			 0  |
      |  Sheet1  |			 1  |
      |  Sheet1  |			 2  |
      