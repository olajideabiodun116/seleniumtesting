@sauceDemoRemoveItem

Feature: Sauce Demo Order and Remove Items

  Scenario: Verify user can order and remove items from the Sauce Demo shopping cart successfully

    Given user is on the home page
    When user enters username
    And user enters password
    And user click the login button to proceed
    Then user should see inventory page
    And user should navigate to sorts icon
    And user clicks low to high
    And user adds sauce labs bike light
    And user adds sauce labs fleece jacket to the shopping cart
    And user removes sauce labs fleece jacket from the cart
    And user navigate to the menu bar
    And user clicks on all items
    And user navigates to the shopping cart
    And user proceeds to checkout
    And user enters checkout valid information
    And user click on continue
    And user verify tax is $0.80
    And user clicks finish to complete the order
    Then user should see a confirmation message