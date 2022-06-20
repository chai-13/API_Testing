import io.restassured.RestAssured;

public class SampleAPI2 {

	public static void main(String[] args) {
		RestAssured.given().baseUri("https://reqres.in").body("C:\\users\\{\r\n"
				+ "            \"id\": 9,\r\n"
				+ "            \"email\": \"chai.tanya@reqres.in\",\r\n"
				+ "            \"first_name\": \"Tanya\",\r\n"
				+ "            \"last_name\": \"Lawson\"\r\n"
				+ "        }\r\n"
				+ "")
		.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when().log().all().put("/api/users/2").then().log().all().assertThat().statusCode(200);

	}


	}
