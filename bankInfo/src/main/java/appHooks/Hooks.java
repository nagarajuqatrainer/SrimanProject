package appHooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Config.BrowserDriver;
import appHelpers.WebDriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	
	
	@Before
	public void startBrowser() {
		BrowserDriver.getCurrentDriver().manage().timeouts().pageLoadTimeout(Duration.ofMillis(5000));
		BrowserDriver.getCurrentDriver("chrome").get("https://www.mycontactform.com");
//		BrowserDriver.getCurrentDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverUtils.setImplicitWait(BrowserDriver.getCurrentDriver(), 5);
	}
	
	
	
	
	@After
	public void closeBrowser() {
		
		BrowserDriver.getCurrentDriver().quit();
		
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) BrowserDriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}
	
	}


}
