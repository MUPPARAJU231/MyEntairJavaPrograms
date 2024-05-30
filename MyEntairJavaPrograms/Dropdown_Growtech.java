package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Growtech
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");

		WebElement dd1=driver.findElement(By.xpath("(//select)[1]"));
		Select s=new Select(dd1);
		s.selectByIndex(2);
		WebElement dd2=driver.findElement(By.xpath("(//select)[2]"));
		Select s1=new Select(dd2);
		s1.selectByVisibleText("practice1"); 
		WebElement dd3=driver.findElement(By.xpath("(//select)[3]"));
		Select s2=new Select(dd3);
		s2.selectByValue("Power1");

	}
}
