Feature: Shout Feature
Scenario: Sean shouts
Given Sean is 10 meaters away from Lucia
When Sean shouts "Free Coffee"
Then Lucia "Listens" to the message

Scenario: Sean shouts away from Lucia
    Given Sean is 200 meaters away from Lucia
    When Sean shouts "Free Coffee"
    Then Lucia "cannot Listens" to the message