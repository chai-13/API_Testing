package stepdef;

import java.io.FileNotFoundException;

import ApiUtils.CreateAPI1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class verifycreatesteps {
	@Given("Create new Booking id")
	public void create_new_booking_id() throws FileNotFoundException {
		CreateAPI1 obj=new CreateAPI1();
		obj.PostMethod();
	}
	@Then("Create executed successfully")
	public void create_executed_successfully() {
		System.out.println("executed successfully");
	    
	}

}
