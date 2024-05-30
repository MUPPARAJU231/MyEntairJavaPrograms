package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Absolute 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/learningHTML1.html");
		WebElement un=driver.findElement(By.xpath("(/html/body/input)[1]"));
		un.sendKeys("ranjith123");
		WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("my name");
		WebElement psw=driver.findElement(By.xpath("(/html/body/input)[3]"));
		psw.sendKeys("ranjith123");
		WebElement fn=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		fn.sendKeys("ranjith");
		/*
		 * WebElement
		 * submitbutton=driver.findElement(By.xpath("(/html/body/form/input)[3]"));
		 * submitbutton.click(); WebElement
		 * checkbox1=driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		 * checkbox1.click(); WebElement
		 * submitbutton2=driver.findElement(By.xpath("(/html/body/form/input)[7]"));
		 * submitbutton2.click(); WebElement
		 * radiobutton=driver.findElement(By.xpath("(/html/body/input)[4]"));
		 * radiobutton.click(); WebElement
		 * checkbox2=driver.findElement(By.xpath("(/html/body/input)[6]"));
		 * checkbox2.click(); WebElement
		 * signup=driver.findElement(By.xpath("(/html/body/input)[7]")); signup.click();
		 */	}
}
