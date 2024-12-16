package appPageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import appHelpers.WebDriverUtils;

public class SignUpPage {
	WebDriver driver;
	
	@FindBy(linkText="Free Account Sign Up!")private WebElement signUp;
	@FindBy(name="name")private WebElement name;
	@FindBy(name="email")private WebElement mail;
	@FindBy(name="user_signup")private WebElement userName;
	@FindBy(name="pass_signup")private WebElement passWord;
	@FindBy(name="pass2")private WebElement retypePassword;
	@FindBy(name="useragree")private WebElement userAgree;
	@FindBy(name="Submit")private WebElement submitButton;
	
	public void clickSignUp() {
//		WebDriverUtils.waitForElementToBeClickable(signUp, 5);
		signUp.click();
		
	}
	
	public void insertName(String nm) {
//		WebDriverUtils.waitForElementToBeClickable(signUp, 5);
		name.sendKeys(nm);
	}
	
	
	public void insertMail(String ml) {
		mail.sendKeys(ml);
	}
	
	public void insertUserSignUpName(String un) {
		userName.sendKeys(un);
	}
	
	public void insertUserPassword(String pw) {
		passWord.sendKeys(pw);
	}
	
	public void insertReTypePassword(String rpw) {
		retypePassword.sendKeys(rpw);
	}
	
	public void selectUserAgreeCheckbox() {
		userAgree.click();
	}
	
	public void clickSubmit() {
		submitButton.click();
	}
	
	
	
	
	
	
	
	
	
	

}
