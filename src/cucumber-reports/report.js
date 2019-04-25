$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/TestMeApp.feature");
formatter.feature({
  "name": "TestMe Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "admin user scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the URL of TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "TestMeLogin.the_URL_of_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the data for login",
  "keyword": "When "
});
formatter.match({
  "location": "TestMeLogin.user_enters_the_data_for_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TestMeLogin.user_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});