package Test1;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Base.Baseclass;
import Page1.pageclass;

public class Testclass extends Baseclass{

	
	@Test
	public void VerifyRegister() throws FileNotFoundException, Exception
	{
		
		pageclass p=new pageclass(driver);
			 p.register();
			 p.setvalues();
			 Thread.sleep(3000);
			 p.reg();
		 }
			 
}
