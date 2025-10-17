@sauceDemoShopping

Feature: Sauce Demo Shopping Cart Automation

  Scenario: Automate the process of ordering a backpack from the Sauce Demo website

    Given user is on the login page
    When user enters username and password
    And user click the login button
    Then user should see products page
    And user should click sauce labs backpack
    And user clicks add to cart
    Then user proceed to the cart icon
    And user navigate to checkout
    And user should fill up the information
    Then user clicks on continue
    And user clicks on finish
    Then user should see a success message