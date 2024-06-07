package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_ONLINE_SBI_RclickProhibited
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login_btn= driver.findElement(By.className("login_button"));
		login_btn.click();
		WebElement user_name= driver.findElement(By.id("username"));
		user_name.sendKeys("abc123");
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("12345");
		WebElement captcha= driver.findElement(By.name("loginCaptchaValue"));
		captcha.sendKeys("a1q2s3");

	}
}
