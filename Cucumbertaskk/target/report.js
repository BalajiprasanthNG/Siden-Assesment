$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate the login functionaly of saucedemo application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user must be in  saucedemo page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.the_user_must_be_in_saucedemo_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To  validate cart functions",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sc1"
    }
  ]
});
formatter.step({
  "name": "The user should login to application",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.the_user_should_login_to_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user must add the products in the cart",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.the_user_must_add_the_products_in_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To validate the product added to the cart is correct or incorrect",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.to_validate_the_product_added_to_the_cart_is_correct_or_incorrect()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});