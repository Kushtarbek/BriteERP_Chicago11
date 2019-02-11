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
});