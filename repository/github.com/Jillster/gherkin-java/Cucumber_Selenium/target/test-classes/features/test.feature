Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is on Home Page
    When user enters username and Password
    Then success message is displayed
    
  Scenario: Successful LogOut
	 Given user is logged in
	 When User LogOut from the Application
	 Then Message displayed LogOut Successfully