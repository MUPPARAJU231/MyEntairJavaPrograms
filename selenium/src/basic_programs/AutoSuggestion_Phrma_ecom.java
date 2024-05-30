package basic_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Phrma_ecom 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.1mg.com/");
		WebElement search_tf=driver.findElement(By.id("srchBarShwInfo"));
        if(search_tf.isDisplayed() && search_tf.isEnabled())
        {
        	search_tf.sendKeys("diclo");
        	Thread.sleep(500);
        }
		List<WebElement> auto_sugg=driver.findElements(By.xpath("//ul[@class='styles__search-results___3rJOl']/li/a"));
		int count=auto_sugg.size();
		System.out.println(count);
		auto_sugg.get(count-12).click();
	}
}
