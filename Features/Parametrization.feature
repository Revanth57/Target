Feature: Login Action

 Scenario Outline: Successful Login with Valid Credentials
 Given User opens the application
 When user click on the signin link
 And user enters "<username>" and "<password>"
 Then message displayed Login Successfully
 
 Examples:
 |username |password    |
 |lalitha  |password123 |
 |admin    |password456 |