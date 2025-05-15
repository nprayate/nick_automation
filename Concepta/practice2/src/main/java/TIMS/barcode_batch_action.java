package TIMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.ScrollHelper;
import Utils.WaitsHelper;

public class barcode_batch_action {

	WebDriver driver;

	ScrollHelper helper;
	WaitsHelper wait;
	static String goldBarcode;

	public barcode_batch_action(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='/admin/barcode-batches']")
	WebElement barcode_batch;

	@FindBy(xpath = "//button[contains(text(),'Create blood batch')]")
	WebElement button;

	@FindBy(id = "btype")
	WebElement type;

	@FindBy(id = "sub_type")
	WebElement subtype;

	@FindBy(id = "barcode_count")
	WebElement count;

	@FindBy(id = "comment")
	WebElement comment;

	@FindBy(id = "customer")
	WebElement customer;

	@FindBy(id = "save_button")
	WebElement save;
	
	@FindBy(id = "nav-barcode-tab")
	WebElement barcodes;
	
	@FindBy(xpath = "(//table[@id='barcode-table']//tbody//tr//td/a)[1]")
	WebElement firsttbarcode;
	
	

	public void createbatch() {

		helper = new ScrollHelper(driver);
		helper.scrollToElement(barcode_batch);

		barcode_batch.click();

		button.click();

		Select select = new Select(type);
		select.selectByVisibleText("blood");

		wait = new WaitsHelper(driver, 30);
		wait.waitForElementToBeClickable(subtype);

		// Wait for the dropdown to be populated
		// Select "Phlebotomy-gold" from the dropdown
		Select select2 = new Select(subtype);
		select2.selectByVisibleText("phlebotomy gold");

//		wait.waitForElementToBeClickable(subtype);
//	//	subtype.click();
//		Select select2 = new Select(subtype);
//		select.selectByVisibleText("gold");
		count.sendKeys("2");
		comment.sendKeys("Test");

//		Select select3 = new Select(customer);
//		select3.selectByVisibleText("Boots");

		save.click();
		
		wait = new WaitsHelper(driver, 30);
		wait.waitForElementToBeClickable(barcodes);
		barcodes.click();
		
		wait = new WaitsHelper(driver, 30);
		wait.waitForElementToBeVisible(firsttbarcode);
		goldBarcode = firsttbarcode.getText();
		
		System.out.println("Gold barcode"+" "+ goldBarcode);

	}

}
