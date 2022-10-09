Feature: Placing an order

  As an invalid customer I want to place knee sock order, and should see payment process

  Scenario: Ordering knee sock product
    Given I am in A101 home page
    When  I want to buy kneeSock product
    And   Product color should be Black
    Then  I should be able see product in basket
    And   I should see payment page visible

