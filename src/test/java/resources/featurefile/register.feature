Feature: Register
As a user I want to register into nop commerce website

  @smoke,@regression
   Scenario: Verify as a user I should Navigate to Register Page successfully
     Given I am on homepage
     When I click on register link
     Then I should navigate to register page successfully

    @sanity,@regression
    Scenario: Verify as a user I should verify that firstname lastName email  password and Confirm password fields are mandatory
      Given I am on homepage
      When I click on register link
      And  I click on register button
      Then verify the firstName error message
      And Verify the lastName error message
      And Verify the email error message
      And verify the password error message
      And Verify the confirm passwrod error message

    @regression
    Scenario: Verify that user should crate account successfully
      Given I am on homepage
      When I click on register link
      And I click on female radio button
      And I have entered fist name "krisha"
      And I have entered last name "Desai"
      And I select date of birth " 15","Jan","1999"
      And I have entered email "prime@gmail.com"
      And I have entered password "Prime123"
      And I have entered confirmed password "Prime123"
      And I click on register button
      Then  I should see message your registration completed


