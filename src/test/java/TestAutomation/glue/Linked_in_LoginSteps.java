package TestAutomation.glue;

import TestAutomation.pages.Linked_in_LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class Linked_in_LoginSteps {
    @Given("^user should be linkedin login page \"([^\"]*)\"$")
    public void userShouldBeLinkedinLoginPage(String arg0) throws Throwable {
        Linked_in_LoginPage.load();
    }

    @Then("^Verify linked in login page is displayed$")
    public void verifyLinkedInLoginPageIsDisplayed() {
        Linked_in_LoginPage.loginPageIsDisplayed();
    }

    @And("^user enter the valid username$")
    public void userEnterTheValidUsername() throws IOException {
        Linked_in_LoginPage.EnterUsername();

    }

    @And("^User enter the valid password$")
    public void userEnterTheValidPassword() throws IOException {
        Linked_in_LoginPage.EnterPassword();

    }

    @When("^user click the Signin Button$")
    public void userClickTheSigninButton() {
        Linked_in_LoginPage.Click_Sign_in_button();
    }

    @Then("^user should be logged in$")
    public void userShouldBeLoggedIn() {

        Linked_in_LoginPage.loggedin();

    }


}
