package TIMS;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ScrollHelper;
import Utils.SimpleCSVHelper;
import Utils.WaitsHelper;

public class Testkits {

	WebDriver driver;
	ScrollHelper helper;
	WaitsHelper wait;
	SimpleCSVHelper helper2;
	barcode_batch_action action;

	public Testkits(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	String filePath = "C:\\Users\\nikhil.rayate\\Downloads\\dna_kit_automation.csv";

	@FindBy(xpath = "//a[@href='/admin/test-kits/']")
	WebElement testkit;

	@FindBy(xpath = "//button[@data-bs-target='#uploadKitCsvModal']")
	WebElement uploadkit;

	@FindBy(id = "kit_csv_kit")
	WebElement choosefile;

	@FindBy(xpath = "//button[text()='Upload']")
	WebElement upload;

	public void uploadkit() throws IOException {

		action = new barcode_batch_action(driver);
		helper2 = new SimpleCSVHelper(filePath);

		helper2.printCSV();
		
		helper2.updateValue(1, 0, action.goldBarcode);
		helper2.saveCSV("C:\\Users\\nikhil.rayate\\Downloads\\dna_kit_automation2.csv");
		
		helper2.printCSV();

		helper = new ScrollHelper(driver);
		helper.scrollToElement(testkit);

		wait = new WaitsHelper(driver, 30);

		testkit.click();

		wait.waitForElementToBeClickable(uploadkit);
		uploadkit.click();

		wait.waitForElementToBeVisible(choosefile);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", choosefile);
		
		String filePath2 = "C:\\Users\\nikhil.rayate\\Downloads\\dna_kit_automation2.csv";

		choosefile.sendKeys(filePath2);

		upload.click();

	}

}
