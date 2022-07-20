@tag
Feature: and_or_anotation

  @tag1
  Scenario: scenario1
    Given scenario1 method1
    When scenario1 method2
    Then scenario1 method3

  @tag4
  Scenario: scenario2
    Given scenario2 method1
    When scenario2 method2
    Then scenario2 method3

  @tag1 @tag2
  Scenario: scenario3
    Given scenario3 method1
    When scenario3 method2
    Then scenario3 method3

  @tag3
  Scenario: scenario4
    Given scenario4 method1
    When scenario4 method2
    Then scenario4 method3

  @tag2 @tag3
  Scenario: scenario5
    Given scenario5 method1
    When scenario5 method2
    Then scenario5 method3

  @tag1 @tag3
  Scenario: scenario6
    Given scenario6 method1
    When scenario6 method2
    Then scenario6 method3

  @tag1 @tag2 @tag3
  Scenario: scenario7
    Given scenario7 method1
    When scenario7 method2
    Then scenario7 method3