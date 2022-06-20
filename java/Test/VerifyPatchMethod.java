package Test;
import java.io.FileNotFoundException;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI1;


public class VerifyPatchMethod {
	public void TestMethod() throws FileNotFoundException {
		CreateAPI1 obj2=new CreateAPI1();
		obj2.PatchMethod();
	}
}

