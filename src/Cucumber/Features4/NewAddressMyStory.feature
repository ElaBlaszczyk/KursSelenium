Feature: New

  Scenario: New shipping address for the user
    Given User is logged in to My story shop
    When User signs up for our new alias
    And User signs up for our first name
    And User signs up for our last name
    And User signs up for company
    And User signs up for vat
    And User signs up for address1
    And User signs up for address2
    And User signs up for city
    And User signs up for post code
    And User signs up for United Kingdom
    And User signs up phone number
    And User saves information
    Then User zmienil haslo



