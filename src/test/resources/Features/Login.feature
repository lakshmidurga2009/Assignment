Feature: Verifying the Login Feature

#Scenario: 
#Given User is stays on login Page
#When  User Enters Admin and admin123
#And   Clicks on Login button 
#Then  User Should be navigated to Home Page 


@Regression
Scenario Outline: Test the valid login
Given  User is stays on login Page
When  User Enters <uname> and <pwd>
And  Clicks on Login button 
Then User Should be navigated to Home Page 


Examples:
 	|uname|pwd|
 	|admin|admin123|


 