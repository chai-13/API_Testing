package ApiUtils;

import io.restassured.RestAssured;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class CreateAPI1 {
	
	public void PostMethod() throws FileNotFoundException {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		.body(getFileContent("C:\\chaitanya\\javaspace\\API\\createBookingtxt"))
		.header("Accept","application/json").header("content-type","application/json")
		.when().log().all().post("/booking").then().log().all().assertThat().statusCode(200);
	}

	public static String getFileContent(String filepath) throws FileNotFoundException {
		File file = new File(filepath);
		Scanner sc =new Scanner(file);
		sc.useDelimiter("\\z");

		return sc.next();
	}
public void PutMethod() throws FileNotFoundException
{
	RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	.body(getFileContent("C:\\chaitanya\\javaspace\\API\\src\\test\\java\\ApiUtils\\createTXT2"))
	.header("Accept","application/json").header("content-type","application/json")
	.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	.when().log().all().put("/booking/").then().log().all().assertThat().statusCode(200);

}



public void PatchMethod() throws FileNotFoundException
{
	RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	.body(getFileContent("C:\\chaitanya\\javaspace\\API\\src\\test\\java\\ApiUtils\\createTXT3"))
	.header("Accept","application/json").header("content-type","application/json")
	.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	.when().log().all().patch("/booking/").then().log().all().assertThat().statusCode(200);

}
}









