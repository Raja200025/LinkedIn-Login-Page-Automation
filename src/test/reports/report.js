$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LinkedInLogin.feature");
formatter.feature({
  "line": 3,
  "name": "Linked-in Login",
  "description": "",
  "id": "linked-in-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@linked-in_Login"
    }
  ]
});
formatter.before({
  "duration": 3046383600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "user login with valid username and password",
  "description": "",
  "id": "linked-in-login;user-login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user should be linkedin login page \"https://www.linkedin.com/home\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify linked in login page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enter the valid username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter the valid password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click the Signin Button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user should be logged in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.linkedin.com/home",
      "offset": 36
    }
  ],
  "location": "Linked_in_LoginSteps.userShouldBeLinkedinLoginPage(String)"
});
formatter.result({
  "duration": 2953962700,
  "status": "passed"
});
formatter.match({
  "location": "Linked_in_LoginSteps.verifyLinkedInLoginPageIsDisplayed()"
});
formatter.result({
  "duration": 116984600,
  "status": "passed"
});
formatter.match({
  "location": "Linked_in_LoginSteps.userEnterTheValidUsername()"
});
formatter.result({
  "duration": 252966400,
  "status": "passed"
});
formatter.match({
  "location": "Linked_in_LoginSteps.userEnterTheValidPassword()"
});
formatter.result({
  "duration": 211098000,
  "status": "passed"
});
formatter.match({
  "location": "Linked_in_LoginSteps.userClickTheSigninButton()"
});
formatter.result({
  "duration": 6204996300,
  "status": "passed"
});
formatter.match({
  "location": "Linked_in_LoginSteps.userShouldBeLoggedIn()"
});
formatter.result({
  "duration": 59993400,
  "status": "passed"
});
formatter.after({
  "duration": 1471286000,
  "status": "passed"
});
});