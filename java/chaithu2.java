import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;
public class chaithu2 {

	public static void main(String[] args) throws FileNotFoundException {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\chaitanya\\javaspace\\API\\src\\test\\java\\createtxt"))
		.header("Accept","application/json").header("content-type","application/json")
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when().log().all().put("/api/v1/Activities").then().log().all().assertThat().statusCode(200);

	}

public static String getFileContent(String filePath) throws FileNotFoundException 
{
File file = new File(filePath);
Scanner sc =new Scanner(file);
sc.useDelimiter("\\z");

return sc.next();

	}

	

	}

