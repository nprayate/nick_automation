package Utils;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import java.time.Duration;

	public class WaitsHelper {

	    private WebDriver driver;
	    private WebDriverWait wait;

	    // Constructor
	    public WaitsHelper(WebDriver driver, int timeoutInSeconds) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	    }

	    // ✅ Wait for element to be visible
	    public WebElement waitForElementToBeVisible(WebElement element) {
	        return wait.until(ExpectedConditions.visibilityOf(element));
	    }

	    // ✅ Wait for element to be clickable
	    public WebElement waitForElementToBeClickable(WebElement element) {
	        return wait.until(ExpectedConditions.elementToBeClickable(element));
	    }

	    // ✅ Wait for element to disappear
	    public boolean waitForElementToDisappear(WebElement element) {
	        return wait.until(ExpectedConditions.invisibilityOf(element));
	    }

	    // ✅ Wait for an element with specific text
	    public boolean waitForTextToBePresent(WebElement element, String text) {
	        return wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	    }

	    // ✅ Wait for a URL to contain a specific keyword
	    public boolean waitForURLToContain(String keyword) {
	        return wait.until(ExpectedConditions.urlContains(keyword));
	    }
	}


