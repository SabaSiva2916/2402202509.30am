package regres;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import pojo.Reqres;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class RegresExecution {

	public static void main(String[] args) {

		// How to get cookies
		// google.com

		Response response = RestAssured.given().when().get("https://www.google.com/");
		// TO All get the cookies in single instance
		Map<String, String> cookies = response.getCookies();
		System.out.println(cookies);

		// To get single cookie
		String cookie = response.getCookie("AEC");
		System.out.println(cookie);

		// To get the headers
		Headers headers = response.getHeaders();

		for (Header header : headers) {
			System.out.println(header);
		}
	}

}
