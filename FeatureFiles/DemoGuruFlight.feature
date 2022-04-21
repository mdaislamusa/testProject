Feature: User able to login using valid username and password then able to search flight and book flight.

  Scenario: User login to website and book a flight using valid username and password and with necessary information.
    Given User can open browser
    And Go to the URL
    When Enter Username
    And Enter Password
    And LoginSuccess Message should be Visible
    And Click on Flight Button
    And Book a Flight
    Then Close the browser
