package TestCases;

import org.testng.annotations.Test;

import TIMS.BaseClass;
import TIMS.barcode_batch_action;

public class BarcodeBatch extends BaseClass {

	//WebDriver driver;

	barcode_batch_action action;

	@Test
	public void test() {

		action = new barcode_batch_action(driver);
		action.createbatch();

	}

}
