import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class API1 {

	public static void main(String[] args) throws FileNotFoundException {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		.body(getFileContent("C:\\chaitanya\\javaspace\\API\\createBookingtxt"))
		.header("Accept","application/json").header("content-type","application/json")
		.when().log().all().post("/booking").then().log().all().assertThat().statusCode(200);

	}

public static String getFileContent(String filePath) throws FileNotFoundException 
{
File file = new File(filePath);
Scanner sc =new Scanner(file);
sc.useDelimiter("\\z");

return sc.next();

}
}
