package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import TIMS.BaseClass;
import TIMS.Testkits;

public class CreateTestKit extends BaseClass {
	
	Testkits kit;
	
    @Test
	public void testkit() throws IOException {
		kit = new Testkits(driver);
		kit.uploadkit();
		
	}
	
}
