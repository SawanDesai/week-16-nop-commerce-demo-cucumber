$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/register.feature");
formatter.feature({
  "line": 1,
  "name": "Register",
  "description": "As a user I want to register into nop commerce website",
  "id": "register",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8310519600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#    @Register"
    },
    {
      "line": 5,
      "value": "#    Scenario: User should create account successfully"
    },
    {
      "line": 6,
      "value": "#    Given I am on homepage"
    },
    {
      "line": 7,
      "value": "#    When I click on register link"
    },
    {
      "line": 8,
      "value": "#    And I enters following users details"
    },
    {
      "line": 9,
      "value": "#      | Jay  | Vaghani    | jay@gmail.com  | 07878451263 | Harrow |"
    },
    {
      "line": 10,
      "value": "#      | Amit | Kathrotiya | amit@gmail.com | 07878451285 | Luton  |"
    },
    {
      "line": 11,
      "value": "#      | Aum  | Vaghani    | aum@gmail.com  | 07878454585 | Harrow |"
    },
    {
      "line": 12,
      "value": "#    Then registration successful"
    }
  ],
  "line": 15,
  "name": "Verify as a user I should Navigate to Register Page successfully",
  "description": "",
  "id": "register;verify-as-a-user-i-should-navigate-to-register-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I should navigate to register page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 394410400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 928596400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iShouldNavigateToRegisterPageSuccessfully()"
});
formatter.result({
  "duration": 136642100,
  "status": "passed"
});
formatter.after({
  "duration": 3128937000,
  "status": "passed"
});
});