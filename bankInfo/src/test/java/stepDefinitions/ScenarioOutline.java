package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline {

	
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	   
	}

	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String uName, String pWord) {
	    System.out.println(uName);
	    System.out.println(pWord);
	}

	@When("clicks the Login button in the login page")
	public void clicks_the_login_button_in_the_login_page() {
	  
	}

	@Then("the user should see successful login")
	public void the_user_should_see_successful_login() {
	    
	}

	
}