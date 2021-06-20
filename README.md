# Search Automation Using Cucumber and BDD

This project is developed to automate search scenrios on Bunnings homepage. The project is written in Java and uses Cucumber(gherkin-BDD) alongwith an open source automation tool Selenium. This project will serve an example for implementing a UI test project with Selenium and Maven. Everything is set up and tests can be added straight away.

**This repo also has the test plan and test scenario added in TestPlan and Test scenarios folders respectively. **

**#Prerequisites**

=JDK8 installed

**#Used tools and frameworks**

1. Selenium-webdriver
2. Maven
3. TestNG
4. Cucumber

**#IDE**

Eclipse

Install testng in eclipse

**#Set Up**

Clone this github repo in your local directory. All the required dependencies are added in POM. No external dependencies required.

**#How to execute **

The test suite can be executed at two level

**IDE level**
Run the testng.xml file from the IDE and it will trigger the execution of the feature

**Command line.**
Naviagte to the project repo in your local and run below command. This same command can be used in the CICD tool

mvn clean test

**#Reporting**

The test generate two reports one in HTML and another in .Json format

Html report : target/cucumber-html-report/index.html

Json report : target/cucumber-reports/cucumber.json
