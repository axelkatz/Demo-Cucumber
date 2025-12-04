Feature: Google

  Scenario: Access Google

    Given I open a browser to Google home page
    When I decline sharing my information
    Then The Google logo is displayed