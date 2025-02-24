package serilization;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import authpojo.OrderBook;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AuthenticationExamples {

	@Test(description = "Basis Authentication", enabled = false)
	private void tc01() {

		// RestAssured ->c
		// given()--> body,path param,Query parm, headers, auth
		// when() --> request type
		// then() --> Assertion

		Response response = RestAssured.given().auth().basic("postman", "password").when()
				.get("https://postman-echo.com/basic-auth");

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);

		// To validate the response body
		// Get the response as jsonPath
		JsonPath jsonPath = response.jsonPath();
		String string = jsonPath.getString("authenticated");
		System.out.println(string);

		Assert.assertEquals(string, "true");
	}

	@Test(description = "Preemitive Authentication", enabled = false) // Preemitive Authentication
	private void tc02() {
		Response response = RestAssured.given().auth().preemptive().basic("postman", "password").when()
				.get("https://postman-echo.com/basic-auth");
		// To do validation
		JsonPath jsonPath = response.jsonPath();

		Assert.assertEquals(jsonPath.getString("authenticated"), "true");
	}

	@Test(description = "Digest Authentication", enabled = false) // diget authentication
	private void tc03() {
		Response response = RestAssured.given().auth().digest("postman", "password").when()
				.get("https://postman-echo.com/basic-auth");
		// To do validation
		JsonPath jsonPath = response.jsonPath();

		Assert.assertEquals(jsonPath.getString("authenticated"), "true");
	}

	@Test(description = "Bearer Token")
	private void tc04() {

		OrderBook book = new OrderBook(1, "Ramesh");

		Response post = RestAssured.given()
				.header("Authorization", "Bearer 4be55ec5610421b63026a099c9375bca3bb777737a0862976ba3d0c0bdac8cf5")
				.body(book.toString()).when().post("https://simple-books-api.glitch.me/orders");

		int statusCode = post.getStatusCode();
		System.out.println(statusCode);

		String asPrettyString = post.getBody().asPrettyString();
		System.out.println(asPrettyString);

	}

	@Test(description = "API Key")
	private void tc05() {
		Response response = RestAssured.given().queryParam("lat", "44.34").queryParam("lon", "10.99")
				.queryParam("appid", "8a978bd9ee26aac8eeb40a80beafc2d4").when()
				.get("https://api.openweathermap.org/data/2.5/forecast");

		int statusCode = response.getStatusCode();

		System.out.println(statusCode);
		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);

	}
}
