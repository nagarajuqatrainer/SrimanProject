package appHelpers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.BrowserDriver;

public class WebDriverUtils {
	
	 static WebDriverWait wait = new WebDriverWait(BrowserDriver.getCurrentDriver(), Duration.ofSeconds(5));

	
	    // Method to set implicit wait
	    public static void setImplicitWait(WebDriver driver, long seconds) {
	        if (driver != null) {
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	        } else {
	            throw new IllegalArgumentException("WebDriver instance is null. Please initialize the driver before setting implicit wait.");
	        }
	    }
	    
	    
	    
	    
	    
	    public static void waitForElementToBeClickable(WebElement submitButton, long timeoutInSecs) {
	        if (BrowserDriver.getCurrentDriver() != null && submitButton != null) {
	           	            wait.until(ExpectedConditions.elementToBeClickable(submitButton));
	        } else {
	            throw new IllegalArgumentException("WebDriver or locator is null.");
	        }
	    }
	    
	    
	  
	    
	    
	    
	    
	    
	    
	    
	}


