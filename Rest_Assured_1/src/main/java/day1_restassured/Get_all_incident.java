package day1_restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_all_incident {

	public static void main(String[] args) {
		RestAssured.baseURI="https://dev79032.service-now.com/api/now/table/incident";
		RestAssured.authentication=RestAssured.preemptive().basic("admin", "Tuna@123");
		Response response=(Response) RestAssured.given().contentType(ContentType.JSON);
		System.out.println(response.statusCode());
		System.out.println(response.contentType());
		response.prettyPrint();
		
	}

}
