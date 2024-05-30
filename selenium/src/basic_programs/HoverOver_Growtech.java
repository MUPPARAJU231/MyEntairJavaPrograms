package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Growtech 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		WebElement demo1= driver.findElement(By.xpath("//div[@data-id='1857001']"));
		Actions a=new Actions(driver);
		a.moveToElement(demo1).perform();
		WebElement p3= driver.findElement(By.xpath("(//div[@class='popup4'])[3]"));
		p3.click();
		WebElement demo4= driver.findElement(By.xpath("//div[@data-id='824f369']"));
		a.moveToElement(demo4).perform();
		WebElement p10= driver.findElement(By.xpath("(//div[@class='popup6'])[10]"));
		p10.click();
		WebElement demo5= driver.findElement(By.xpath("//div[@data-id='551f3a8']"));
		a.moveToElement(demo5).perform();
		WebElement p1= driver.findElement(By.xpath("(//div[@class='popup7'])[10]"));
		p1.click();
	}
}
