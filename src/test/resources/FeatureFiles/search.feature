#Author: your.email@your.domain.com
@search
Feature: To test Bunning Search Feature

  @tag1
  Scenario Outline: Verify when user starts typing any search keyword then a drop-down area appears.
    Given user on Bunning "<homepage>"
    When user enter any "<text>" in search area
    Then a suggestive drop-down area appears
    And user should be able to close the drop down

    Examples: 
      | homepage                     | text   |
      | https://www.bunnings.com.au/ | wheels |

  @tag2
  Scenario Outline: Verify when user starts typing any search keyword then a drop-down area appears.
    Given user on Bunning "<homepage>"
    When user enter any "<text>" in search area
    And clicks on search icon
    Then search result page should "<text>"

    Examples: 
      | homepage                     | text   |
      | https://www.bunnings.com.au/ | wheels |
