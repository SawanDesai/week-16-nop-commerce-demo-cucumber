package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

public class RegisterSteps {


    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

        @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals("Register page not displayed","Register",new RegisterPage().getRegisterText());

    }


    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^verify the firstName error message$")
    public void verifyTheFirstNameErrorMessage() {
        Assert.assertEquals("first name is required.","First name is required.",
                new RegisterPage().getValidationErrorMessageForField("FirstName"));
    }

    @And("^Verify the lastName error message$")
    public void verifyTheLastNameErrorMessage() {
        Assert.assertEquals("Last name is required.","Last name is required.",
                new RegisterPage().getValidationErrorMessageForField("LastName"));
    }

    @And("^Verify the email error message$")
    public void verifyTheEmailErrorMessage() {
        Assert.assertEquals("Email is required.","email is required.",
                new RegisterPage().getValidationErrorMessageForField("Email"));
    }

    @And("^verify the password error message$")
    public void verifyThePasswordErrorMessage() {
        Assert.assertEquals("Password is required.","Password is required.",
                new RegisterPage().getValidationErrorMessageForField("Password"));
    }

    @And("^Verify the confirm passwrod error message$")
    public void verifyTheConfirmPasswrodErrorMessage() {
        Assert.assertEquals("Password is required.","confirmPassword is required.", new RegisterPage().getValidationErrorMessageForField("ConfirmPassword"));
    }

    @And("^I click on female radio button$")
    public void iClickOnMaleRadioButton() {
        new RegisterPage().selectGender("male");
    }

    @And("^I have entered fist name \"([^\"]*)\"$")
    public void iHaveEnteredFistName(String firstName){
        new RegisterPage().enterFirstName(firstName);
    }

    @And("^I have entered last name \"([^\"]*)\"$")
    public void iHaveEnteredLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("^I select date of birth \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iSelectDateOfBirth(String day, String month, String year)  {
      new RegisterPage().selectDateOfBirth(day,month,year);
    }

    @And("^I have entered email \"([^\"]*)\"$")
    public void iHaveEnteredEmail(String email)  {
        new RegisterPage().enterEmail(email);
         }

    @And("^I have entered password \"([^\"]*)\"$")
    public void iHaveEnteredPassword(String password)  {
        new RegisterPage().enterPassword(password);
    }

    @And("^I have entered confirmed password \"([^\"]*)\"$")
    public void iHaveEnteredConfirmedPassword(String confirmPassword)  {
        new RegisterPage().enterConfirmPassword(confirmPassword);
          }
          @Then("^I should see message your registration completed$")
    public void iShouldSeeMessageYourRegistrationCompleted() {
        Assert.assertEquals("Registration not successful","Your registraiton completed",new RegisterPage().getYourRegCompletedText());
    }
}
