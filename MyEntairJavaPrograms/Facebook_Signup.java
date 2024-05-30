package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Signup 
{
	public static void main(String[] args)
	{
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
//		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ranjith");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("9848012345");
		driver.findElement(By.id("password_step_input")).sendKeys("12345");
		driver.findElement(By.name("websubmit")).click();
		
	}
}
