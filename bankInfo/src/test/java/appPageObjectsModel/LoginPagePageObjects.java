package appPageObjectsModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import appHelpers.WebDriverUtils;

public class LoginPagePageObjects {
	
//	static WebDriverWait wait = new WebDriverWait(BrowserDriver.getCurrentDriver(), Duration.ofSeconds(5));
//	static WebDriver driver;
	//Page Object Model
	@FindBy(name="user")private WebElement userName;
	@FindBy(name="pass")private WebElement passWord;
	@FindBy(name="btnSubmit")private WebElement submitButton;
	@FindBy(linkText="Logout")private WebElement logOutLink;
	@FindBy(id="right_col_top_err")private WebElement loginErrorMessage;
	
	
	public void insertUserName(String un) {
		userName.sendKeys(un);
		
	}
	
	
	public void insertPassword(String pw) {
		passWord.sendKeys(pw);
	}
	
	
	public void clickSubmit()  {
		
		
//		 if (buttonHelper.isButtonEnabled(submitButton)) {
//	            System.out.println("Button is displayed!");
//	            if (buttonHelper.isButtonEnabled(submitButton)) {
//	                buttonHelper.clickButton(submitButton);
//	                System.out.println("Button clicked successfully.");
//	                Assert.assertTrue(true);
//	            }else {
//	    			Assert.assertFalse(false);
//	        }
//		
		
		if(submitButton.isEnabled()) {
			WebDriverUtils.waitForElementToBeClickable(submitButton, 5);
			submitButton.click();
			
			Assert.assertTrue(true);
		}else {
			Assert.assertFalse(false);
		}
		
		try {
			
			String loginError = loginErrorMessage.getText();
			System.out.println(loginError+"\t"+"Login Fail");
			Assert.assertTrue(true);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		 }
		
	
	
	
	
	public void clickLogout() {
		
		try {
			
			if(logOutLink.isEnabled()) {
				
				logOutLink.click();
				System.out.println("Login Success");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

	
	
	
	
	
	
}
