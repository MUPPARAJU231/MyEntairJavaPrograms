package assertion_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_login 
{
	@Test
	public void login()
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("9063332478");
		WebElement continue_btn=driver.findElement(By.xpath("//input[@id='continue']"));
		continue_btn.click();
		WebElement psw=driver.findElement(By.xpath("//input[@id='ap_password']"));
		psw.sendKeys("AddChinna");
		WebElement signin_btn=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin_btn.click();
		
		String actual_title=driver.getTitle(); 
		String expected_title="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
//		Assert.assertEquals(actual_title, expected_title, "Title Mismatched");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertEquals(search.isDisplayed(), true, "Test case Failed");
		driver.close();
	}
}
