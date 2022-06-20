package Test;
import java.io.FileNotFoundException;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI1;

public class VerifyPutMethod {
	
	public void TestMethod() throws FileNotFoundException {
		CreateAPI1 obj2=new CreateAPI1();
		obj2.PutMethod();
	}
}
