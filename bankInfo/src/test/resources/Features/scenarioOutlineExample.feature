 @RegressionTest
 Feature: Login Functionality

  As a user
  I want to log into the application
  So that I can access my account and personalized features

	@positive
  Scenario Outline: Login with valid  credentials
    Given the user is on the login page
    When the user enters "<username>" and "<password>"
    And clicks the Login button in the login page
    Then the user should see successful login

    Examples:
      | username | password |              
      | test1    | admin12 |             
      | test2  	 | admin12 |           
      | test3    | admin12 |       
      | test4    |  admin12|