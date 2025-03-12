Feature:

Scenario: To Check Page1 Login Funionality
Given User Opens the Browser
And User Navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
When User Enters Login Credentials
|Testdata.xlsx|
Then User Clicks on Login Button
Then User verifies ProfileAccount
And User Clicks on One of the Menu Displayed
And User Closes the Browser
