package Test1;

import org.testng.annotations.Test;

import Base.Baseclass;
import Page1.pagelogin;

public class Testlogin extends Baseclass{
	
	@Test
	public void Verifylogin()
	{
		pagelogin pl= new pagelogin(driver);
		pl.signin();
		pl.setvalues();
		pl.login();
	}

}
