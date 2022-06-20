import io.restassured.RestAssured;
public class Demo3 {

	public static void main(String[] args) {
 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when().log().all().delete("/api/v1/Activities/").then().log().all().assertThat().statusCode(201);
		}
}
