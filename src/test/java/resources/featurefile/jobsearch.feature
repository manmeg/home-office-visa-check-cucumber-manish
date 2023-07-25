@regression
Feature: Visa Confirmation Test
  As user I want to Visa check into Gov.uk  website

  Background: I am check visa uk page
    And I Click on accept button
    And I Click on start button

  @smoke
  Scenario:Australian Coming To UK For Tourism
    When I Select a Nationality of 'Australia'
    And I Click on Continue button
    And I Select reason 'Tourism or visiting family and friends'
    And I Click on Continue button
    Then I Should see the result 'You will not need a visa to come to the UK'

  @sanity
  Scenario: Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    When I Select a Nationality of 'Chile'
    And I Click on Continue button
    And I Select a reason 'Work, academic visit or business'
    And I Click on Continue button
    And I Select intended to stay for 'longer than 6 months'
    And I Click on Continue button
    And I Select have planning to work for 'Health and care professional'
    And I Click on Continue button
    Then I should see the result 'You need a visa to work in health and care'

  @regression
  Scenario: Colombian Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10Or 20Card
    When I Select a Nationality of 'Colombia'
    And I Click on Continue button
    And I Select a reason 'Join partner or family for a long stay'
    And I Click on Continue button
    Then I should see the results 'You may need a visa'