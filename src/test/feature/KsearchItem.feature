@smoke
Feature: Automation Practice Search feature

  Background:
    Given user is on the automation practice app

  #happypath
  @smoke1
  Scenario Outline: Verify user can search for items
    When user enter an item in search box"<product name>"
    And user select search button
    Then user should navigate to dresses page
    Examples:
      | product name |
      | dresses      |

  #unhappy path
  @smoke2
  Scenario Outline: Verify I can search invalid items
    When user enter an invalid item in search box "<product name>"
    And user select search button
    Then user should should see error message "<error>"
    Examples:
      | product name | error                                           |
      | jackets      | No results were found for your search "jackets" |
      | jeans        | No results were found for your search "jeans"   |
      | blazer       | No results were found for your search "blazer"  |





