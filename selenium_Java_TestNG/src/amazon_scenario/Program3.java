package amazon_scenario;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program3 
{
	@Test
	public static void wishlisting() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement login=driver.findElement(By.id("ap_email"));
		login.sendKeys("9063332478");
		WebElement cont_btn=driver.findElement(By.id("continue"));
		cont_btn.click();
		WebElement psw=driver.findElement(By.id("ap_password"));
		psw.sendKeys("AddChinna");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		WebElement search_btn=driver.findElement(By.id("nav-search-submit-button"));
		search_btn.click();
		WebElement shoe1=driver.findElement(By.xpath("//div[@data-index='3']"));
		shoe1.click();
	    driver.quit();
	}
}
