Feature: Fill out basic contact form
Scenario: Valid contact information
	Given I am on the mycontact website
	When I fill in the required fields and click submit
	|sup | sup@sup.com | Wassup sup sup|
	Then I should be redirected to a thank you page
Scenario Outline: Valid contact information 2
	Given I am on the mycontact website
	When I enter "<name>", "<email>", and "<msg>"
	Then I should be redirected to a thank you page
	Examples:
	|	name 	| email			| msg			 |
	|	sup 	| sup@sup.com 	| Wassup sup sup |
	|	jon 	| jon@sup.com 	| 12345678901234 |
	|	don 	| don@sup.com 	| 09876543210987 |
	
