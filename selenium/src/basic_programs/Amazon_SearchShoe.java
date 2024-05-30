package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SearchShoe 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.xpath("(//input)[5]"));
		search.sendKeys("shoe");
		WebElement search_btn=driver.findElement(By.xpath("(//input)[6]"));
		search_btn.click();
		
	}
}
