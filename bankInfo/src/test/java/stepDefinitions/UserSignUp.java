package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import Config.BrowserDriver;
import appPageObjectsModel.SignUpPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSignUp {
	
	
	SignUpPage signupPage;
	
	@Given("I am on the signup page")
	public void i_am_on_the_signup_page() {
		BrowserDriver.getCurrentDriver("chrome").get("https://www.mycontactform.com/signup.php");

	}
	
	@When("User should click on signup button")
	public void user_should_click_on_signup_button() {
		signupPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SignUpPage.class);
//		signupPage.clickSignUp();
	
	}

	@When("I enter the following details:")
	public void i_enter_the_following_details(DataTable usercredentials) {
		signupPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SignUpPage.class);
		List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
		signupPage.insertName(data.get(0).get("Value"));
		signupPage.insertMail(data.get(1).get("Value"));
		signupPage.insertUserSignUpName(data.get(2).get("Value"));
		signupPage.insertUserPassword(data.get(3).get("Value"));
		signupPage.insertReTypePassword(data.get(4).get("Value"));
		
	}

	@When("I check the Terms and Conditions checkbox")
	public void i_check_the_terms_and_conditions_checkbox() {
		signupPage.selectUserAgreeCheckbox();
	}

	@When("I click the Submit button")
	public void i_click_the_submit_button() {
		signupPage.clickSubmit();
	}

	@Then("I should see a confirmation message {string}")
	public void i_should_see_a_confirmation_message(String string) {
		BrowserDriver.getCurrentDriver().quit();
	}

	

}
