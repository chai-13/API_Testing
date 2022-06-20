package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.Authors;

public class authorsmethod {
	
	public void TestGetMethod() {
		Authors obj=new Authors();
		obj.getMethod();
	}
public void TestDeleteMethod() {
	Authors obj=new Authors();
	obj.deleteMethod();
}
public void TestpostMethod() throws FileNotFoundException {
	Authors obj=new Authors();
	obj.PostMethod();
}
public void TestputMethod() throws FileNotFoundException {
	Authors obj=new Authors();
	obj.PutMethod();
}
public void TestpatchMethod() throws FileNotFoundException {
	Authors obj=new Authors();
	obj.PatchMethod();
}
}