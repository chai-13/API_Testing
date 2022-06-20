import io.restassured.RestAssured;
public class Demo1 {

	public static void main(String[] args) {
RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body("{\r\n"
		+ "    \"firstname\" : \"Chaitanya\",\r\n"
		+ "    \"lastname\" : \"Lakamsani\",\r\n"
		+ "    \"totalprice\" : 111,\r\n"
		+ "    \"depositpaid\" : true,\r\n"
		+ "    \"bookingdates\" : {\r\n"
		+ "        \"checkin\" : \"2022-06-01\",\r\n"
		+ "        \"checkout\" : \"2022-06-07\"\r\n"
		+ "    },\r\n"
		+ "    \"additionalneeds\" : \"Breakfast,Lunch,Dinner\"\r\n"
		+ "}").headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
.when().log().all().put("/booking/779").then().log().all().assertThat().statusCode(200);
}
}
