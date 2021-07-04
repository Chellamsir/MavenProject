package steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.cucumber.java.en.Given

import org.testng.annotations.Test;

import io.cucumber.*;

@Test
public class IncidentManagement {
@Given("set an endpoint")
	 public void setEndpoint(){
		RestAssured.baseURI="https://dev79032.service-now.com/api/now/table/incident"
		}

@And("set an authentication")
public void SetAuthentication(){
	RestAssured.authentication=RestAssured.preemptive().basic("admin", "Tuna@123");
	}
}

@And("set an endpoint")
public void ContentTypeAsJSON(){
	RequestSpecification=RestAssured.given().contentType(ContentType.JSON);
	
	}

@when ("set the request post with file (*/)$")
public void SetRequest(String file){
	Response=RequestSpecification.body(./data/+file).post();	
	
	
@Then ("Confirm the response Code {int}")
	public void Checkstatuscode({int statuscode}){
		response.then().assertthat().StatusCode(statuscode);

}
