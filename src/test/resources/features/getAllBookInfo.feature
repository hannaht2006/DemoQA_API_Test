Feature: Get all Books Info
@wip
  Scenario: Verify the number of Books

    When User sends GET request to receive all books information
    Then verifies that application returns 8 results