package basic_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Google 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search_tf=driver.findElement(By.name("q"));
        if(search_tf.isDisplayed() && search_tf.isEnabled())
        {
        	search_tf.sendKeys("India");
        	Thread.sleep(500);
        }
		List<WebElement> auto_sugg=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=auto_sugg.size();
		System.out.println(count);
		auto_sugg.get(count-1).click();
	}
}
