Feature: Test orangehrm
1)Valid
2)Vnvalid
Background:
Given open broeser and navigate to login page
@PositiveTesting
Scenario: testing orangehrm functionality with valid data
When Enter username "Admin"
And Enter password "admin123"
And Click on login
Then Redirect in homepage of orangehrm
@NegativeTesting
Scenario: testing orangehrm functionality with invalid data
When Enter Username "admin"
And Enter password "admiuhcsguy"
And Click on login
Then Redirect in homepage of orangehrm