package Test1;

import org.testng.annotations.Test;

import Page1.pageproduct;

public class Testproduct extends Testlogin{
	@Test

	public void Verifyproduct() throws Exception
	{
		pageproduct pp= new pageproduct(driver);
		Thread.sleep(3000);
		pp.bed();
		Thread.sleep(5000);
		pp.inter();
		Thread.sleep(3000);
		pp.select();
		Thread.sleep(3000);
		pp.region();
		Thread.sleep(3000);
		pp.cart();
		Thread.sleep(3000);
		pp.proceed();
	}

}
