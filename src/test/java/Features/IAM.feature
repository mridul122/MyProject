Feature: To verify the AD and user sync adapter

  @IAM
  Scenario Outline: To verify the AD and user sync adapter

    Given The rest connectivity is proper
    When When we pass the "<title>","<fname>","<lname>","<uid>","<role>"
    Then Then the we should validate

    Examples:
      | title | fname | lname | uid      | role |
      | Mrs   | Liton   | Jones | 30052022 | CofC  |


  @IAM-Bulk
  Scenario Outline: To verify the AD and user sync adapter for multiple users

    Given The rest connectivity is proper
    When Provide the "<numberofiterations>"
    Then Then the we should validate

    Examples:
      | numberofiterations |
      |   2                  |


  @IAM-Login
  Scenario Outline: To verify the login functionality of ID fed gateway

    Given The rest connectivity is proper
    When we provide the "<username>" and password
    Then Then the we should validate

    Examples:
      | username |
      | 30052017 |

  @IAM-BulkUpdate
  Scenario Outline: To verify the user update for multiple users
      Given The rest connectivity is proper
      When we provide the "<noofiterations>"
      Then Then the we should validate

      Examples:
      |noofiterations|
      |8             |


  @IAM-BulkUpdate1
  Scenario Outline:  verify the user update for multiple users
    Given  rest connectivity is proper
    When  provide the "<noofiterations>"
    Then  the we should validate

    Examples:
      |noofiterations|
      |8             |