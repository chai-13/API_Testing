package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Authors {
	public void getMethod()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.when().log().all().get("/api/v1/Authors").then().log().all().assertThat().statusCode(200);
	}

	public void deleteMethod() {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.when().log().all().delete("/api/v1/Authors").then().log().all().assertThat().statusCode(200);
	}
public void PostMethod() throws FileNotFoundException {
	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/Authors")
	.body(getFileContent("C:\\chaitanya\\javaspace\\API\\src\\test\\java\\ApiUtils\\authortxt"))
	.header("Accept","application/json").header("content-type","application/json")
	.when().log().all().post("/api/v1/Authors").then().log().all().assertThat().statusCode(200);
}

public static String getFileContent(String filepath) throws FileNotFoundException {
	File file = new File(filepath);
	Scanner sc =new Scanner(file);
	sc.useDelimiter("\\z");

	return sc.next();
}
public void PutMethod() throws FileNotFoundException
{
RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
.body(getFileContent("C:\\chaitanya\\javaspace\\API\\src\\test\\java\\Test\\authortxt1"))
.header("Accept","application/json").header("content-type","application/json")
.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
.when().log().all().put("/api/v1/Authors").then().log().all().assertThat().statusCode(200);

}



public void PatchMethod() throws FileNotFoundException
{
RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
.body(getFileContent("C:\\chaitanya\\javaspace\\API\\src\\test\\java\\Test\\authortxt2"))
.header("Accept","application/json").header("content-type","application/json")
.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
.when().log().all().patch("/api/v1/Authors").then().log().all().assertThat().statusCode(200);

}
}











