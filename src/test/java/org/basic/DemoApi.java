package org.basic;

import static io.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoApi {
	@Test
	private void test1() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getContentType());
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.getHeaders());
		System.out.println(response.getTime());
		int statuscode = response.statusCode();
		Assert.assertEquals(statuscode, 200);

	}

	@Test
	private void test2() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}

}
