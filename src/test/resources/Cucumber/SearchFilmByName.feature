Feature: Look for films by name
  As a customer, I would like to search for films by their name

  Scenario: A customer searches for a film by name and gets the data for that film
    Given the customer wants to find a certain film
    When the customer searches for that film by name
    Then the database will return that film