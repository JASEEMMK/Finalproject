package Test1;

import org.testng.annotations.Test;

import Page1.pagecheckout;

public class Testcheckout extends Testproduct{
	@Test
	public void VerifyCheckout() throws Exception
	{
		pagecheckout pc= new pagecheckout(driver);
		Thread.sleep(5000);
		pc.checkout();
		Thread.sleep(3000);
		pc.country();
		Thread.sleep(3000);
		pc.setvalues();
		Thread.sleep(3000);
		pc.payment();
	}

}
