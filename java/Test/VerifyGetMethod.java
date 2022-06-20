package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI;
import ApiUtils.CreateAPI1;
import org.testng.annotations.Test;
public class VerifyGetMethod extends CreateAPI {
	@Test
	public void TestGetMethod() {
		CreateAPI obj=new CreateAPI();
		obj.getMethod();
	}
@Test
public void TestCreateMethod() throws FileNotFoundException {
	CreateAPI1 obj2=new CreateAPI1();
	obj2.PostMethod();
}
}