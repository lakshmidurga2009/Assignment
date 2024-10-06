Feature: Verifying the Login Feature using Data Table


@Smoke
Scenario: 
Given User is stays on login Page
When  User Enters Credentials using Datatable
|admin|admin123|
|admin|admin1243|
And   Clicks on Login button 
Then  User Should be navigated to Home Page 