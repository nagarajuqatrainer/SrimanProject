package stepDefinitions;
import org.openqa.selenium.support.PageFactory;
import Config.BrowserDriver;
import appPageObjectsModel.LoginPagePageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidLoginPage {
	
	LoginPagePageObjects loginpage;
	
	@Given("user should navigate to the login page")
	public void user_should_navigate_to_the_login_page() {
	System.out.println("User should navigate to the login page");
				
	}
	
	
//	@When("user should enters login details")
//	public void user_should_enters_login_details(DataTable usercredentials) {
//		List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
//		loginpage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPagePageObjects.class);
//		loginpage.insertUserName(data.get(1).get("username"));
//		loginpage.insertPassword(data.get(1).get("password"));
//	}
//	
	@When("user should enters a valid {string} and {string}")
	public void user_should_enters_a_valid_and(String un,String pw) {
		loginpage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPagePageObjects.class);
		loginpage.insertUserName(un);
		loginpage.insertPassword(pw);
	}
	
	
	@When("clicks the Login button")
	public void clicks_the_login_button() throws InterruptedException {
		 
		loginpage.clickSubmit();
	}
	@Then("clicks the Logout button")
	public void clicks_the_Logout_button() {
		loginpage.clickLogout();
	}
	@Then("a welcome message should be displayed")
	public void a_welcome_message_should_be_displayed() {
		
	}


	
	
	

	

	




	

}
