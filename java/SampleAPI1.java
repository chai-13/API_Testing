import io.restassured.RestAssured;
public class SampleAPI1 {

	public static void main(String[] args) {
		RestAssured.given().baseUri("https://reqres.in")
		.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when().log().all().delete("/api/users/2").then().log().all().assertThat().statusCode(201);

	}

}
