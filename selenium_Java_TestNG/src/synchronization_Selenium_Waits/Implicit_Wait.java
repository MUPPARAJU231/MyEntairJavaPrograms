package synchronization_Selenium_Waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Implicit_Wait 
{
	@Test
	public void links()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement e=links.get(i);
			String link_text=e.getText();
			String link=e.getAttribute("href");
			System.out.println(link_text);
			System.out.println(link);
		}
	}
}
