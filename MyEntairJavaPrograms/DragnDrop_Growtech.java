package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop_Growtech
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag= driver.findElement(By.id("drag7"));
		WebElement drop= driver.findElement(By.id("div2"));

		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		
		WebElement drop1= driver.findElement(By.xpath("(//div[@id='container'])[7]"));
		WebElement drag1= driver.findElement(By.id("div2"));

		a.dragAndDrop(drag1, drop1).perform();
	}
}
