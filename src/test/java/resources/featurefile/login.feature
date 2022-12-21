Feature: Login Test
  As user I want to login into nop commerce website

  @smoke,@regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @sanity,@regression
  Scenario: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "primeeight@gmail.com"
    And I enter password "arg987"
    And I click on login button
    Then I am unable to login with invalid credentials

  @regression
  Scenario: Verify that user should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "primeeight@gmail.com"
    And I enter password "abc123"
    And I click on login button
    Then I should login successfully with valid credentials


  @regression
  Scenario: Verify that user should logout successfully
    Given I am on homepage
    When I click on login link
    And I enter email "primeeight@gmail.com"
    And I enter password "abc123"
    And I click on login button
    And I click on logout link
    Then I should logout successfully and i should see login link
