Feature: This is a generator for random films
  As the user, I want to access my most recently rented films

  Scenario: Successfully output random films with their accompanying data
    Given a user wants to see their most recently rented films
    When a user accesses their most recently rented films
    Then random films are listed with their title, description, release year, and age rating