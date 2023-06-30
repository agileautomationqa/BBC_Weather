@test
Feature: Check BBC weather for Bournemouth
  Scenario: Enter city name and verify tomorrows highest temperature is greater than lowest temperature
    Given I am one BBC weather page
    When I enter city name "Bournemouth" in search bar
    Then I should see weather result for "Bournemouth" city
    And hightest temp is greater than lowest temp
