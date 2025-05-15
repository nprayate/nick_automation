package TIMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	protected WebDriver driver;
	Login_action login_action;
	
	public void intializer() {

		driver = new ChromeDriver();

	}

	@BeforeClass
	public void setup() throws InterruptedException {
		intializer();
		driver.get("https://purushottam.dev.myhealthchecked.com:444/admin/");
		driver.manage().window().maximize();
		login_action = new Login_action(driver);
		login_action.login();
	}
	
	public void quiet() {
		
		driver.close();
		driver.quit();
	}
}