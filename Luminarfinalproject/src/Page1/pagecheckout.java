package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pagecheckout {
	WebDriver driver;
	By Checkout=By.xpath("//button[@class='btn btn-primary height3em']");
	By Country=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/select");
	By Firstname=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[1]/div[1]/input");
	By Lastname=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input");
	By Address=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[2]/div/input");
	By Landmark=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[3]/div/input");
	By Phone=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[4]/div/input");
	By Email=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[5]/div/input");
	By City=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[6]/div[1]/input");
	By State=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/input");
	By Pincode=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[6]/div[3]/input");
	By Payment=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[7]/div[1]/button[1]/strong");
	
	public pagecheckout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void checkout()
	{
		driver.findElement(Checkout).click();
	}
	public void country()
	{
		WebElement w=driver.findElement(Country);
		Select s=new Select(w);
		s.selectByVisibleText("India");
	}
	public void setvalues()
	{
		driver.findElement(Firstname).sendKeys("Jaseem");
		driver.findElement(Lastname).sendKeys("MK");
		driver.findElement(Address).sendKeys("Luminar");
		driver.findElement(Landmark).sendKeys("near CSEZ");
		driver.findElement(Phone).sendKeys("1234567890");
		driver.findElement(Email).sendKeys("jaseemmuhamed314@gmail.com");
		driver.findElement(City).sendKeys("Kochi");
		driver.findElement(State).sendKeys("Kerala");
		driver.findElement(Pincode).sendKeys("682004");
	}
	public void payment()
	{
		driver.findElement(Payment).click();
	}

}
