Feature: feature to test login functionality
@login
Scenario Outline: Checking login functionality with vaild credential
Given User should lunch the URL
Then User verifies the Title of the Explorer page
Then User should click on Like Button
Then User should open Login Page
#Then User should provide <UserName> & <Password>
And User click on login button
Then User navigates to login page
And User verfies post Details is updated 
Examples:
|UserName|Password|
|				 |				|