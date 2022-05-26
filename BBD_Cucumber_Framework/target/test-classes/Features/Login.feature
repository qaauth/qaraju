Feature: Login 

@sanity
Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "http://35.154.153.79/bridge_aws_multi/"
	And User enters Email as "shariq.abbas@authbridge.com" and Password as "Test@#123!" 
	And Click on Login 
	Then Page Title should be "AuthBridge Research Services: Users"
	When User click on Log out link 
	And close browser
	
	