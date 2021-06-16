#Author: ujjwal_ujjwal100@yahoo.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: To search a car based on make, model and location

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to search a car of make "<make>"
    When I provide for the "<model>" in step
    And location "<location>"
    Then I verify the search results

    Examples: 
      | make   | model   | location |
      | Nissan | QASHQAI | Victoria |
      | Nissan | QASHQAI | Sydney   |
