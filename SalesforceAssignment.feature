Feature: Login to SalesForce Application




Scenario Outline: Launch Browser and Load URL
And Enter the Username as <username>
And Enter the Password as <password>
When Click on Login
And Click on toggle menu button from the left corner
And Click view All
And click Sales from App Launcher
And Click on KeyAll
And Click on New button
And Enter Opportunity name as <OPPName>
And Choose close date as Today
And Select Stage as Need Analysis
And click Save
Then VerifyOppurtunity Name


Examples:
|username|password|OPPName|
|'venky@testleaf.sandbox'|'Mine@1234'|'Report Automation By Venkatesh'|
