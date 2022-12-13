@smoke
Feature: Validating wishlist feature
  Scenario: user should be able to add  products to wishlist
    When user click on wishlist button of product
    Then success message should be displayed


    Scenario: validate wishlist quantity
      When user click on wishlist button of product
      And user click on wishlistlink of products
      Then user will find the quantity of products more than zero
