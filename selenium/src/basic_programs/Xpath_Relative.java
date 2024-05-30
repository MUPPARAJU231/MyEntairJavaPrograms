package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Relative
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/learningHTML1.html");
		WebElement un=driver.findElement(By.xpath("(//input)[1]"));
		un.sendKeys("ranjith123");
		WebElement hint=driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("my name");
		WebElement psw=driver.findElement(By.xpath("(//input)[3]"));
		psw.sendKeys("ranjith123");
		WebElement fn=driver.findElement(By.xpath("(//input)[4]"));
		fn.sendKeys("ranjith");
//		WebElement sbutton=driver.findElement(By.xpath("(//input)[6]"));
//		sbutton.click();
		
		
	}
}
