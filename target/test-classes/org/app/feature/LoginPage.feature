Feature: Login Page Scenarios
  Scenario: Validate the correct username and password
    Given Login to the application
    When Enter the username "aiite"
    And Enter the password "789456"
    And Click the login button
    Then Validate the homepage
   

 