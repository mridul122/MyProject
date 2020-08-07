 Feature: Login
  To test the login functionality

  @SmokeTest
  Scenario: To test the login functionality
    Given The application is open
    When The user populates the credentials
    Then The user should be navigated to the home page



  @SanityTest
    Scenario: To test the product feature
      Given The login is done
      When The user searches a product
      Then The product should be displayed
