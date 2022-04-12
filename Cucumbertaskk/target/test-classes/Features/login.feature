Feature: To validate the login functionaly of saucedemo application

Background: 
    Given the user must be in  saucedemo page
    
@sc1
 Scenario: To  validate cart functions
    When The user should login to application
    When The user must add the products in the cart
    Then To validate the product added to the cart is correct or incorrect
    
    @sc2
  Scenario: To validate the Sauce Labs Bolt product availablity
    When The user should login to application
    And To get all products
    Then To validate the "Sauce Labs Bolt T-Shirt" is availabale or unavailable
  @sc3
 Scenario: To validate the product price details
    When The user should login to application
    And To get all product price details and remove the dollor symbol in the price
    Then To validate the product price when user click the product price is same or different
    
    
   @sc4 
  Scenario: To validate the login with invalid username and password
    When The user login to application with invalid data
    Then To validate the invalid login error message