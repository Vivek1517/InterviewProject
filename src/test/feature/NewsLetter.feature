Feature: Newsletter on automation practice app
  @NewsLetter
  Scenario Outline: Verify user is able to subscribe for newsletter by giving valid email id
    Given user is on the automation practice app
    When user provides valid email "<email>"
    And user clicks on next arrow
    Then user should see a sucessful message "<message>"
    Examples:
      | email           | message                                                           |
      | dehdj@xmail.com | Newsletter : You have successfully subscribed to this newsletter. |

  @NewsLetter1
    Scenario Outline: Verify user is not able to subscribe for newsletter by giving invalid email id
      Given user is on the automation practice app
      When user provides valid email "<email>"
      And user clicks on next arrow
      Then user should see a message "<error>"
      Examples:
        | email            | error                                                  |
        | asdashotmail.com | Newsletter : Invalid email address.                    |
        |                  | Newsletter : Invalid email address.                    |
        | dehdj@xmail.com  | Newsletter : This email address is already registered. |