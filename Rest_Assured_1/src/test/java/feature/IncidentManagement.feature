Feature: Incident Management

Scenario : Creating an incident

Background:
Given set an Endpoint
And set an authentication
And set an ContentType as JSON
When create a POST request
Then Confirm the response Code
And confirm the Type as JSON