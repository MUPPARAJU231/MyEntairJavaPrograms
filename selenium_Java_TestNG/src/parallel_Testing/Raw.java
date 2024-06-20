package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Raw 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void testcase1(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome")) 
		{
			driver= new ChromeDriver();
		}
		if(nameofbrowser.equals("edge")) 
		{
			driver= new EdgeDriver();
		}
		if(nameofbrowser.equals("firefox")) 
		{
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("India");
		e.sendKeys(Keys.ENTER);
	}
}
