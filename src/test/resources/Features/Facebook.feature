Feature: Validation of Login page in Facebook Web Application

Background:
Given User is on Login page
Then User verifies login page is displayed

Scenario: TC_01 Validation of login page with valid credentials
When User enters valid username and password
|username|password|
|raj@gmail.com|raj@123|
|abi@gmail.com|abi@123|
|arul@gmail.com|arul@123|
And User clicks on Login button
Then User verifies home page is displayed

Scenario Outline: TC_02 Validation of login page with invalid credentials
When User enters invalid "<username>" and "<password>"
And User clicks on Login button
Then User verifies error message is displayed

Examples:
|username|password|
|java@gmail.com|java@123|
|python@gmail.com|python@123|
|selenium@gmail.com|selenium@123|

Scenario: TC_03 Validation of login page with invalid credential
When User enters invalid username and password
And User clicks on Login button
Then User verifies error message is displayed
