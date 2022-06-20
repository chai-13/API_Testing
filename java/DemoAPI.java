import io.restassured.RestAssured;
public class DemoAPI {
public static void main(String[] args)
{
RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
.when().log().all().get("/booking/779").then().log().all().assertThat().statusCode(200);
}
}
