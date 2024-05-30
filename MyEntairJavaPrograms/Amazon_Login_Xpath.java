package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login_Xpath
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("veeranji231@gmail.com");
		WebElement continue_btn=driver.findElement(By.xpath("//input[@id='continue']"));
		continue_btn.click();
		WebElement psw=driver.findElement(By.xpath("//input[@id='ap_password']"));
		psw.sendKeys("12345");
		WebElement signin_btn=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin_btn.click();
		
	}
}
