Feature: Signup Page

  As a user,
  I want to sign up for the website
  So that I can access personalized features and content.

  Scenario: Successful signup
    Given I am on the signup page
    When User should click on signup button
    When I enter the following details:
      | Field              | Value               |
      | Name               | John Doe            |
      | Email              | john.doe@example.com |
      | Username           | johndoe123          |
      | Password           | Password123        |
      | Retype Password    | Password123        |
    And I check the Terms and Conditions checkbox
    And I click the Submit button
    Then I should see a confirmation message "Signup successful!"