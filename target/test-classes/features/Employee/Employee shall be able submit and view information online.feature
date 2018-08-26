Feature: Employee shall be able submit and view information online 
	Description: The purpose of this feature is to submit a form for identification
Background: User is on Home Page 
	Given User  is on home page 
Scenario: Employee should be able to submit a form 
	When click on FormsPage 
	Then  FormsPage gets opened 
	Then User clicks I9FormLink 
	Then  user can fill the form with name "sample_nm",alias_Name "aliasNm",date_of_birth "20071989" ,current_addr "1234"and status "Visa" 
	And user should be able to enter alienno "a1234" 
	Then click on submit button 
#	Then close the browser 
#	
Scenario: Employee should be able to edit the form 
	When click on FormsPage 
	Then  FormsPage gets opened 
	Then User clicks FindI9FormPageLink 
	Then User enters formid "1234" 
	And clicks on submit button 
	Then form details get displayed 
	Then close the browser