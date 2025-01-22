Feature: Moving forward

Scenario: Facing North

Given The rover has position (x=4, y=2) and facing North  
When  Rove moves forward  
Then The rover has position (x=4, y=3) and facing North


Scenario: Facing South

Given The rover has position (x=4, y=2) and facing South  
When  Rove moves forward  
Then The rover has position (x=4, y=1) and facing South


Scenario: Facing East

Given The rover has position (x=4, y=2) and facing East  
When  Rove moves forward  
Then The rover has position (x=5, y=2) and facing East


Scenario: Facing West

Given The rover has position (x=4, y=2) and facing West  
When  Rove moves forward  
Then The rover has position (x=3, y=2) and facing West

