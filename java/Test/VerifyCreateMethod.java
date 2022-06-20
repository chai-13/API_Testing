package Test;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI1;


public class VerifyCreateMethod extends CreateAPI1 {
	@Test
	
	public void TestpostMethod() throws FileNotFoundException {
		CreateAPI1 obj2=new CreateAPI1();
		obj2.PostMethod();
	}
}