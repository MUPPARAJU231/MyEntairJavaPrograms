package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_IsDisplayed_IsSelected 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search_tf=driver.findElement(By.name("q"));
        if(search_tf.isDisplayed() && search_tf.isEnabled())
        {
        	search_tf.sendKeys("India");	
        }
		
        
		
	}
}
