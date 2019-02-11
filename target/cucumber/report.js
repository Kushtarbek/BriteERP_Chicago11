$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Brite.feature");
formatter.feature({
  "name": "Kanban Test2",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@brite"
    }
  ]
});
formatter.scenario({
  "name": "See listings as List",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@brite"
    }
  ]
});
formatter.step({
  "name": "user goes to Brite application",
  "keyword": "When "
});
formatter.match({
  "location": "Smoke_steps.user_goes_to_Brite_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Smoke_steps.user_should_see_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Purchases mod",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@brite"
    }
  ]
});
formatter.step({
  "name": "user clicks on purchases",
  "keyword": "When "
});
formatter.match({
  "location": "Smoke_steps.user_clicks_on_purchases()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Request for quotations link",
  "keyword": "Then "
});
formatter.match({
  "location": "Smoke_steps.user_clicks_on_Request_for_quotations_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The rest",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@brite"
    }
  ]
});
formatter.step({
  "name": "user clicks on Purchases order",
  "keyword": "When "
});
formatter.match({
  "location": "Smoke_steps.user_clicks_on_Purchases_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the title",
  "keyword": "Then "
});
formatter.match({
  "location": "Smoke_steps.user_verifies_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Vendors",
  "keyword": "Then "
});
formatter.match({
  "location": "Smoke_steps.user_clicks_on_Vendors()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the title",
  "keyword": "Then "
});
formatter.match({
  "location": "Smoke_steps.user_verifies_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Products",
  "keyword": "And "
});
formatter.match({
  "location": "Smoke_steps.user_clicks_on_Products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the title",
  "keyword": "And "
});
formatter.match({
  "location": "Smoke_steps.user_verifies_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Incoming Products",
  "keyword": "And "
});
formatter.match({
  "location": "Smoke_steps.user_clicks_on_Incoming_Products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the title",
  "keyword": "And "
});
formatter.match({
  "location": "Smoke_steps.user_verifies_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Vendors bills",
  "keyword": "And "
});
formatter.match({
  "location": "Smoke_steps.user_clicks_on_Vendors_bills()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see proper title",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonTitle_steps.user_should_see_proper_title()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Incoming Products - Odoo]\u003e but was:\u003c[Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs \u0026 more]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.cybertek.stepDef.AmazonTitle_steps.user_should_see_proper_title(AmazonTitle_steps.java:18)\r\n\tat ✽.user should see proper title(src/test/resources/features/Brite.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on Reporting",
  "keyword": "And "
});
formatter.match({
  "location": "Smoke_steps.user_clicks_on_Reporting()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see reports",
  "keyword": "And "
});
formatter.match({
  "location": "Smoke_steps.user_should_see_reports()"
});
formatter.result({
  "status": "skipped"
});
});