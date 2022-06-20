package ApiUtils;

import io.restassured.RestAssured;

public class CreateAPI {
	
public void getMethod()
{
	RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	.when().log().all().get("/booking/779").then().log().all().assertThat().statusCode(200);
}

public void deleteMethod() {
	
	RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	.when().log().all().delete("/booking/779").then().log().all().assertThat().statusCode(200);
}
}
