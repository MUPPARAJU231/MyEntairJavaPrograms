package selenium_Project1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
  
public class Testcase_fb
{
	@Test
	public void login_to_facebook()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Facebook_LoginPage fb=new Facebook_LoginPage(driver);
		fb.un();
		fb.pwd();
		fb.login();
		
	}
}
