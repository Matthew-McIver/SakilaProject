Feature: This is a searcher for data on an individuals movie purchase history.
  As the user, I would be able to search up my own data on my movie purchase history and access my personal data associated with my movie purchasing account.

  Scenario: Successfully retrieving movie purchase history and personal data.
    Given a user wants to know their most recent movie purchase
    When a user searches for their most recent movie purchase
    Then the most recent film purchased will show up
