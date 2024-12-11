Feature: Login


  @Positive
  Scenario: Successful Login
    Given User is on HomePage
    When User click on Login icon
#    Then User verifies Login form is displayed
  And User enters valid data
    And User clicks on Anmelden button
    And User clicks on User icon
    Then User verifies his name


    @Negative
    Scenario: Unsuccessful Login
      Given User is on HomePage
      When User click on Login icon
      And User enters wrong email and valid password
      And User clicks on Anmelden button
      Then User should see the Error message