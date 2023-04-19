Feature: test Guru99
1)Valid
2)Invalid
Background:
Given open an browser and navigate to the login page
@PostiveTesting
Scenario: testing the Guru99 functinality with valid data
When And Enter the username "user"
And Enter the password "user"
And click on submit
Then I should see the title as Welcome: Mercury Tours
@NegativeTesting
Scenario: testing the Guru99 functionality with invaild data
When And Enter the Username "asds"
And Enter the Password "gasf"
And click on submit
Then I should see the title as Welcome: Mercury Tours
