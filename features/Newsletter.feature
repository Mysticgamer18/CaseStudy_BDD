Feature: Newsletter Validation

Scenario: Signup for Newsletter
Given User lands on Home Page
Then User enters email-id in Newsletter textbox
When User Click on Sign Up Now button
Then A page with Newsletter signup sucessful should be displayed