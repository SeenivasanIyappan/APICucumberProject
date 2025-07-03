Feature: Validating Place API's

@AddPlace @Regression
Scenario Outline: Verify if Place is being Succesfully added using AddPlaceAPI
	Given Add Place Payload with "<name>"  "<language>" "<address>"
	When user calls "AddPlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_Id created maps to "<name>" using "getPlaceAPI"
	
Examples:
	|name 	 | language |address		   |
	|AAhouse |  English |World cross center|
#	|BBhouse | Spanish  |Sea cross center  |

@GetPlace @Regression
Scenario: Verify if place can be retrieved using getPlaceAPI
	Given a valid place_id
	When user calls "getPlaceAPI" with "GET" http request
	Then the API call got success with status code 200
	And "name" in response body is "TempPlace"

@UpdatePlace @Regression
Scenario: Verify if Update Place functionality is working
  Given Add Place Payload with "TempPlace"  "English" "Old Address"
  When user calls "AddPlaceAPI" with "POST" http request
  Then the API call got success with status code 200
  And "status" in response body is "OK"
  And "scope" in response body is "APP"

  Given Update Place Payload with "70 Winter Walk, USA"
  When user calls "updatePlaceAPI" with "PUT" http request
  Then the API call got success with status code 200
  And "msg" in response body is "Address successfully updated"

@DeletePlace @Regression
Scenario: Verify if Delete Place functionality is working
	Given DeletePlace Payload
	When user calls "deletePlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"