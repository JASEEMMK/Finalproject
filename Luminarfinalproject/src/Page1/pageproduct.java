package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageproduct {
	
	WebDriver driver;
	
	By Mattresses= By.xpath("//*[@id=\"myDropdown\"]/a");
	By Ortho = By.xpath("/html/body/div[1]/div/nav[2]/div/div/ul/li[2]/ul/li[4]/a");
	By Variety= By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[3]/div[3]/div/div/div[2]/div/button[2]");
	By Sizecategory=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[3]/div[5]/div/div[2]/div/button[2]");
	By Sizes=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[3]/div[6]/div/div[2]/div[1]/button[8]");
	By Region=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[3]/div[8]/div/div[2]/div/select");
	By Addtocart=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[3]/div[10]/div[2]/div[2]/button");
	By Proceed =By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[3]/div[10]/div[3]/div/div/div[3]/a/button");
	public pageproduct(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void bed()
	{
		driver.findElement(Mattresses).click();
		
	}
	public void inter()
	{
		driver.findElement(Ortho).click();
				
	}
	public void select() throws Exception
	{
		driver.findElement(Variety).click();
		//Thread.sleep(5000);
		//driver.findElement(Sizecategory).click();
		//driver.findElement(Sizes).click();
	}
	public void region()
	{
		WebElement w= driver.findElement(Region);
		Select s= new Select(w);
		s.selectByVisibleText("KERALA");
	}
	public void cart()
	{
		driver.findElement(Addtocart).click();
	}
	public void proceed()
	{
		driver.findElement(Proceed).click();
	}
	

}
