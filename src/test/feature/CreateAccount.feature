Feature: Create an account feature on automation practice app

Background:
  Given user is on the automation practice app
  When user clicks on sign in
  Then user should navigate to authentication page
@smoke
  Scenario Outline: verify user is able to create an account using valid credentials
    When user enters a valid email address "<email>" and clicks on create account page
    Then user should navigate to create an account page
    When user selects title as "<title>", enters first name "<first name>", last name "<last name>" and "<pwd>"
    And user selects DOB, date "<date>", month "<month>" and "<year>" and select signup for news letter and recive special offers
    And user enters address "<street address>", city "<city>", selects "<state>", enters post code "<post code>"
    And user selects country "<country>"
    And user enter "<mobile number>"
    And user clicks on register
    Then user should be able to register sucessfully

    Examples:
      | email          | title | first name| last name|pwd     | date | month | year | street address     | city     | state  | post code | country       | mobile number |
      | sddf@gmail.com | Mr    | Vivek     |  Sal     |fpffp12 | 6    | 7     | 1979 | 2816  Seneca Drive | portland | 37     | 97205     | United States | 07957653672   |

  @regression
  Scenario Outline: verify user is not able to create an account by leaving mandatory fields blank
    When user enters a valid email address "<email>" and clicks on create account page
    Then user should navigate to create an account page
    When user selects title as "<title>", enters first name "<first name>", last name "<last name>" and "<pwd>"
    And user selects DOB, date "<date>", month "<month>" and "<year>" and select signup for news letter and recive special offers
    And user enters address "<street address>", city "<city>", selects "<state>", enters post code "<post code>"
    And user selects country "<country>"
    And user enter "<mobile number>"
    And user clicks on register
    Then user should see a validation message "<error message>"

    Examples:
      | email         | title | first name | last name | pwd    | date | month | year | street address     | city     | state | post code | country       | mobile number | error message          |
      | sdd@gmail.com | Mr    | Vivek      | Sal       |        | 6    | 7     | 1979 | 2816  Seneca Drive | portland | 37    | 97205     | United States | 07957653672   | passwd is required.    |
      | sdd@gmail.com | Mr    |            | Sal       | dfdgfd | 6    | 7     | 1979 | 2816  Seneca Drive | portland | 37    | 97205     | United States | 07957653672   | firstname is required. |