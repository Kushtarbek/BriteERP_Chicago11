@brite
Feature: Kanban Test2

  Scenario: See listings as List
    When user goes to Brite application
    Then user should see login page

    Scenario: Purchases mod
      When user clicks on purchases
      Then user clicks on Request for quotations link


      Scenario: The rest
        When user clicks on Purchases order
        Then user verifies the title
        Then user clicks on Vendors
        Then user verifies the title
        And user clicks on Products
        And user verifies the title
        And user clicks on Incoming Products
        And user verifies the title
        And user clicks on Vendors bills
        And user should see proper title
        And user clicks on Reporting
        And user should see reports



