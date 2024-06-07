package basic_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_Amazon 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		WebElement search_btn=driver.findElement(By.id("nav-search-submit-button"));
		search_btn.click();
		
		WebElement shoe1=driver.findElement(By.xpath("//div[@data-index='3']"));
		shoe1.click();
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String> pcid=s.iterator();
		String p_id=pcid.next();
		String c_id=pcid.next();
		driver.switchTo().window(c_id);
		
		WebElement wish_list=driver.findElement(By.xpath("//a[.=' Add to Wish List ']"));
		wish_list.click();
		WebElement login=driver.findElement(By.id("ap_email"));
		login.sendKeys("9063332478");
		WebElement cont_btn=driver.findElement(By.id("continue"));
		cont_btn.click();
		WebElement psw=driver.findElement(By.id("ap_password"));
		psw.sendKeys("AddChinna");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
		WebElement cart=driver.findElement(By.id("add-to-cart-button"));
		cart.click();
		WebElement buy=driver.findElement(By.name("proceedToRetailCheckout"));
		buy.click();
		
//		driver.quit();
	}
}
