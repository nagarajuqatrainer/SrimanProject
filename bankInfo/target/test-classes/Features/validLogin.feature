@SmokeTest
Feature: Login Functionality
  
  As a registered user
  I want to log into the application
  So that I can access my personalized dashboard

	@negitive
  Scenario: Successful login with valid credentials
    Given user should navigate to the login page
    When user should enters a valid "qatrainer" and "admin123"
    And clicks the Login button
    And clicks the Logout button
    And a welcome message should be displayed

    