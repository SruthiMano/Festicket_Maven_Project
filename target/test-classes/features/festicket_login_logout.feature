Feature: Login to festicket as registered user 

@login 
Scenario Outline: To validate the login as registered user 
	Given we are in the festicket login page 
	When I click on login button 
	And enter the user name "<user_id>"
	And enter the password "<password>"
	And click on login button 
	Then we should reach the homepage successfully
	
Examples:
|user_id                  |password|
|sruthimanoharan91@gmail.com|Sachin20@|

	
@logout
Scenario Outline: To validate the logut is working fine
	Given We are Logged in with user name "<user_id>" and password "<password>"
	When I click on logout button 
	Then we should log out successfully 
	
	Examples: 
		|user_id                  |password|
		|sruthimanoharan91@gmail.com|Sachin20@|
