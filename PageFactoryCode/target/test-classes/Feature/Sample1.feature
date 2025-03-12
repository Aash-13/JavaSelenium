Feature:
@SmokeTest
Scenario: To Check Title of the application
Given User Opens the Browser
And User Navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
Then User verifies the title of the Webpage
And User Closes the Browser

@RegressionTest
Scenario Outline: To Check Page1 Login Funionality
Given User Opens the Browser
And User Navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
When User Enters '<Username>' UserName
And User Enters '<Password>' Password
Then User Clicks on Login Button
Then User verifies ProfileAccount
And User Clicks on One of the Menu Displayed
And User Closes the Browser
Examples:
|Username|Password|
|Admin|admin123|
|Admin|admin123|