package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pagelogin {
	WebDriver driver;
	By Signin = By.xpath("//*[@id=\"navcol-11\"]/ul/li[1]/a");
	By Email= By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/form/input[1]");
	By Password= By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/form/input[2]");
	By Login= By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/form/div/div[1]/button");
	
	public pagelogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void signin()
	{
		driver.findElement(Signin).click();
	}

	public void setvalues()
	{
		driver.findElement(Email).sendKeys("jaseemmuhammed314@gmail.com");
		driver.findElement(Password).sendKeys("jas@1234");
	}
	
	public void login()
	{
		driver.findElement(Login).click();
	}

}
