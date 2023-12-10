Feature: Home page

  Scenario: 1. Opening the home page
    When Home page is opened
    And User clicks on "Accept all" button
    Then Wiggle Logo is displayed
    And Account Link is displayed

  Scenario Outline: 2. Change language selecting from suggested tiles
    When Home page is opened
    And User clicks on the language switcher
    And User selects <language>
    Then <abbreviation> is displayed
    Examples:
      | language         | abbreviation |
      | "United States"  | "EN-US USD"  |
      | "United Kingdom" | "EN GBP"     |
      | "Ireland"        | "EN EUR"     |

  Scenario: 3. Change language selecting from Region
    When Home page is opened
    And User clicks on the language switcher
    And User selects region Europa
    And User clicks on Cancel button in pop-up
    And User selects Andorra English
    Then Language is updated to EN EUR

  Scenario: 4. Block page is loaded
    When Home page is opened
    And User clicks on Blog link
    Then Blog image is displayed

  Scenario: 5. Navigating to Home page by clicking on logo
    When Home page is opened
    And User clicks on Blog link
    And User clicks on logo
    Then Home image is displayed
    And Account Link is displayed

  Scenario: 6. Navigating to Help page
    When Home page is opened
    And User clicks on Help link
    Then Help page is displayed
