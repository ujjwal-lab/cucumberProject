@tagtwo
Feature: Load ecommerce website

  Scenario: load website in chrome browser
    Given loads website "http://automationpractice.com/index.php" in browser
    When User searches "tshirt" in search textarea
    Then verify the page
