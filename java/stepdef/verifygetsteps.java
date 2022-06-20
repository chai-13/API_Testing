package stepdef;

import ApiUtils.CreateAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class verifygetsteps {
	@Given("calling Get method")
	public void calling_get_method() {
	   CreateAPI obj= new CreateAPI();
	   obj.getMethod();
	}

	@Then("executed sucessfully")
	public void executed_sucessfully() {
	   System.out.println("executed successfully");
	}

}
