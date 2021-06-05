#Author: ujjwal_ujjwal100@yahoo.com
@tagone
Feature: Load ecommerce website

  Scenario Outline: load website in chrome browser
    Given User loads website "<website>" in browser
    When User searche for product "<searchtext>" in search textarea
    Then verify search page loads

    Examples: 
      | website                                 | searchtext |
      | http://automationpractice.com/index.php | t-shirt    |
