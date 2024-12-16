//package appHelpers;
//
//	
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//
//	public class ButtonHelper {
//
//	    private WebDriver driver;
//
//	    // Constructor to initialize the WebDriver instance
//	    public ButtonHelper(WebDriver driver) {
//	        this.driver = driver;
//	    }
//
//	    /**
//	     * Clicks a button located by a By selector.
//	     * @param submitButton The By selector of the button.
//	     */
//	    public void clickButton(WebElement submitButton) {
//	        WebElement button = getButton(submitButton);
//	        if (isButtonEnabled(button)) {
//	            button.click();
//	        } else {
//	            throw new IllegalStateException("Button is disabled and cannot be clicked.");
//	        }
//	    }
//
//	    /**
//	     * Validates whether a button is displayed on the page.
//	     * @param submitButton The By selector of the button.
//	     * @return True if the button is displayed, false otherwise.
//	     */
//	    public boolean isButtonDisplayed(WebElement submitButton) {
//	        try {
//	            return driver.findElement((By) submitButton).isDisplayed();
//	        } catch (Exception e) {
//	            return false;
//	        }
//	    }
//
//	    /**
//	     * Validates whether a button is enabled for interaction.
//	     * @param locator The By selector of the button.
//	     * @return True if the button is enabled, false otherwise.
//	     */
//	    public boolean isButtonEnabled(By locator) {
//	        WebElement button = getButton(locator);
//	        return isButtonEnabled(button);
//	    }
//
//	    /**
//	     * Gets the button element by its locator.
//	     * @param submitButton The By selector of the button.
//	     * @return The WebElement representing the button.
//	     */
//	    private WebElement getButton(WebElement submitButton) {
//	        return driver.findElement((By) submitButton);
//	    }
//
//	    /**
//	     * Checks if a WebElement is enabled (internal method).
//	     * @param element The WebElement representing the button.
//	     * @return True if the button is enabled, false otherwise.
//	     */
//	    public boolean isButtonEnabled(WebElement element) {
//	        return element.isEnabled();
//	    }
//	}
//
//
//
