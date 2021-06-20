Feature: Log in feature for automation practice app
  Background:
    Given user is on the automation practice app
    When user clicks on sign in
    Then user should navigate to authentication page
  @login
  Scenario Outline: Verify user is able to log in using valid credentials
    When user enters emails address "<user name>", password "<pwd>" and clicks on sign in
    Then user should navigate to my account page
    Examples:
      | user name               | pwd      |
      | vicky_sturd@hotmail.com | Vivek123 |
@login
  Scenario Outline: Verify user is not able to log in using invalid credentials
  When user enters emails address "<user name>", password "<pwd>" and clicks on sign in
  Then user should see an error message "<error>"
    Examples:
      | user name               | pwd      | error                      |
      | vicky_sturd@hotmail.com |          | Password is required.      |
      | vicky_sturd@hotmail.com | vivek123 | Authentication failed.     |
      |                         | Vivek123 | An email address required. |
      |                         |          |An email address required.  |
      | vicky_sturdhotmail.com  |Vivek123  | Invalid email address.     |