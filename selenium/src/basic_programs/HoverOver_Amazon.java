package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Amazon
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		WebElement e2= driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		e2.click();
		WebElement e3= driver.findElement(By.name("email"));
		e3.sendKeys("mygarbage@gmail.com");
		WebElement e4= driver.findElement(By.id("continue"));
		e4.click();
	}
}
