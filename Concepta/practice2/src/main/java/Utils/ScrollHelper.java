package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TIMS.BaseClass;

public class ScrollHelper extends BaseClass {
		
		private WebDriver driver;

		// Constructor
		public ScrollHelper(WebDriver driver) {
			this.driver = driver;
		}

		// Scroll to an element
		public void scrollToElement(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
		}

		// Scroll to the bottom of the page
		public void scrollToBottom() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		}

		// Scroll to the top of the page
		public void scrollToTop() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, 0);");
		}
	}

