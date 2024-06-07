package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_TNCN_GOOGLE 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search_tf=driver.findElement(By.cssSelector("textarea.gLFyf"));
		search_tf.sendKeys("india");
    }
}
