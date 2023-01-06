
 @linked-in_Login
  Feature: Linked-in Login
    Scenario: user login with valid username and password
      Given user should be linkedin login page "https://www.linkedin.com/home"
      Then Verify linked in login page is displayed
      And user enter the valid username
      And User enter the valid password
      When user click the Signin Button
      Then user should be logged in