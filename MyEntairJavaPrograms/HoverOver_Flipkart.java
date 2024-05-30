package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Flipkart
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e= driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		WebElement e3= driver.findElement(By.linkText("Men's T-Shirts"));
        e3.click();
	}

}
