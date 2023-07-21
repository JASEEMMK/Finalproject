package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageclass {
	public pageclass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	WebDriver driver;
	By Register=By.xpath("//*[@id=\"navcol-11\"]/ul/li[2]/a");
	By Name=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/div[2]/form/input[1]");
	By Email=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[2]/div[2]/form/input[2]");
	By Password=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div[2]/form/input");
	By Reg=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[4]/div[2]/button");

	public void register()
	{
		driver.findElement(Register).click();
	}
	public void setvalues()
	{
		driver.findElement(Name).sendKeys("Jaseem");
		driver.findElement(Email).sendKeys("jaseemmuhammed314@gmail.com");
		driver.findElement(Password).sendKeys("jas@1234");
	}
	public void reg()
	{
		driver.findElement(Reg).click();
	}
}
