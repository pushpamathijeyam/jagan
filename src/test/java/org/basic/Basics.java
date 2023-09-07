package org.basic;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.body.PayLoad;

public class Basics {
	public static void main(String[] args) {

		// 1.Create the post:

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(PayLoad.addplace()).when().post("/maps/api/place/add/json").then().log().all().assertThat()
				.statusCode(200).extract().response().asString();

		System.out.println(response);
		JsonPath js = new JsonPath(response);
		String placeId = js.get("place_id");
		System.out.println(placeId);

		// 2.update the post:

		given().log().all().queryParam("key", "qaclick123").headers("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeId + "\",\r\n" + "\"address\":\"gundy,chennai\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "\r\n" + "")
				.when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));
		System.out.println("Get request");
		// 3.get the updated post:
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
				.when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract()
				.response().asString();
		JsonPath js1 = new JsonPath(getPlaceResponse);
		String actualresponse = js1.get("address");
		System.out.println(actualresponse);

		// 4.delete the post:

		String getDeleteResponse = given().log().all().queryParam("key", "qaclick123")
				.body("{\r\n" + "    \"place_id\":\"" + placeId + "\"\r\n" + "}\r\n" + "").when()
				.delete("maps/api/place/delete/json").then().log().all().assertThat().statusCode(200).extract()
				.response().asString();
		JsonPath js2 = new JsonPath(getDeleteResponse);
		String actres = js2.get("msg");
		System.out.println(actres);
		
		// 5.get operation after delete
		
		String response1 = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId).when()
				.post("/maps/api/place/get/json").then().log().all().assertThat().statusCode(404).extract().response()
				.asString();

		System.out.println(response1);
		JsonPath js3 = new JsonPath(response1);
		String message = js3.getString("msg");
		System.out.println(message);

	}

}
