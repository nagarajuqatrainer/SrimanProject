package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidLogin {
	
	
	@Given("user should navigate to the contact form login page")
	public void user_should_navigate_to_the_contact_form_login_page() {
	    
	}
	
	
	
	
	@When("the user enters login details")
	public void the_user_should_enters_login_details_page(DataTable usercredentials) {
		List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
		System.out.println(data.get(0).get("Username"));
		System.out.println(data.get(0).get("Password"));
	}

	@When("clicks the Login buttons")
	public void clicks_the_Login_buttons() {
	    
	}

	@Then("an error message should be displayed")
	public void an_error_message_should_be_displayed() {
	    
	}

	@Then("the user should remain on the login page")
	public void the_user_should_remain_on_the_login_page() {
	    
	}
	
	


}
