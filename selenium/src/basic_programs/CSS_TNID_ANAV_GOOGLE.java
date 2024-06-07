package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_TNID_ANAV_GOOGLE 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
//		WebElement search_tf=driver.findElement(By.cssSelector("textarea#APjFqb"));
//		WebElement search_tf=driver.findElement(By.cssSelector("[CLASS='gLFyf']"));
//		WebElement search_tf=driver.findElement(By.cssSelector("textarea[CLASS='gLFyf']"));
		WebElement search_tf=driver.findElement(By.cssSelector("textarea[data-ved^='0ah']"));
		search_tf.sendKeys("india");
    }
}
