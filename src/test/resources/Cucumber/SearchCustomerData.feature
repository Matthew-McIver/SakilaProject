Feature: This is a searcher for data on an individual customer data.
  As the user, I would be able to search up my data as a customer.

  Scenario: Successfully retrieve specific customer data with the first and last name.
    Given a user wants to know their customer data at Blockbuster.
    When a user searches for specific customer data with their first and last name.
    Then the customer ID, first name, last name, and email address of the user is shown.
