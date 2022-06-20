import io.restassured.RestAssured;

public class SampleAPI {

	public static void main(String[] args) {
	
		RestAssured.given().baseUri("https://reqres.in")
.when().log().all().get("/api/users/2").then().log().all().assertThat().statusCode(200);
	}
}
