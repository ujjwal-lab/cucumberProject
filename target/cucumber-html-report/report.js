$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/testcase1.feature");
formatter.feature({
  "name": "Load ecommerce website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tagone"
    }
  ]
});
formatter.scenarioOutline({
  "name": "load website in chrome browser",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User loads website \"\u003cwebsite\u003e\" in browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User searche for product \"\u003csearchtext\u003e\" in search textarea",
  "keyword": "When "
});
formatter.step({
  "name": "verify search page loads",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "website",
        "searchtext"
      ]
    },
    {
      "cells": [
        "http://automationpractice.com/index.php",
        "t-shirt"
      ]
    }
  ]
});
formatter.scenario({
  "name": "load website in chrome browser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tagone"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User loads website \"http://automationpractice.com/index.php\" in browser",
  "keyword": "Given "
});
formatter.match({
  "location": "testCase1Step.user_loads_website_in_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searche for product \"t-shirt\" in search textarea",
  "keyword": "When "
});
formatter.match({
  "location": "testCase1Step.user_searche_for_product_in_search_textarea(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify search page loads",
  "keyword": "Then "
});
formatter.match({
  "location": "testCase1Step.verify_search_page_loads()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});