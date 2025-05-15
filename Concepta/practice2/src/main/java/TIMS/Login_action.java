package TIMS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.WaitsHelper;

public class Login_action {
	WebDriver driver;
	WaitsHelper helper;
	
	public Login_action(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//button[text()='Enable Later']")
	WebElement mfa;

	@FindBy(xpath = "//button[@class='btn-close']")
	WebElement close;
	
	private String string;
	
	
	public void login() throws InterruptedException {
		username.sendKeys("admin@myhealthchecked.com");
		password.sendKeys("7Rbh3bCfKirstNNreuAZUUvxKXKV9wQfjVmQ25sQzJvVhJhstDfVwd7D3PPxue");
		submit.click();
		String MFA = mfa.getText();
		System.out.println(MFA);
		String checkMFA = "Enable Later";
		
		helper = new WaitsHelper(driver, 30);
		helper.waitForElementToBeClickable(mfa);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", mfa);

		//close.click();
		
		
		assert MFA.equals(checkMFA);
		
		
		
		
	}
	
	

}
