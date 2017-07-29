Feature: Login
  As a user, I should receive a notification on failed log in attempt

  Scenario: User is given a notification on failed log in attempt
    Given I'm not a registered user
    When I attempt to log into Digi Marketplace
    Then I'm given a notification of failed log in attempt