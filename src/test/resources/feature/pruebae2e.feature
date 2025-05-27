Feature: E2E test
  I am a buyer, I add two products to the shopping cart and complete the purchase


  Scenario: E2E Test
    Given the "Guest customer" enters in the marketplace
    When add two products to the shopping cart and complete the purchase
    Then the customer will see the confirmation of their purchase "Your order has been placed!"

