Feature: Ars Number

Background: Below are common steps for every scenario
	Given User Launch Chrome browser 
	When User opens URL "http://35.154.153.79/bridge_aws_multi/"
	And User enters Email as "shariq.abbas@authbridge.com" and Password as "Test@#123!" 
	And Click on Login 

@sanity
Scenario: Search ARS number and verify details
	And Enter ars number in search text field
	Then Click on search button
	And Click on ars number to view the details
	And close browser
	
 @regression
Scenario: Verify Docs Quality Role
	And Select Docs Quality role
	Then Click on Dashboard Module
	And Enter Ars number in search text field
	Then Click On Search button of the ars
	Then verify serach result No Cases found
	And close browser
	

