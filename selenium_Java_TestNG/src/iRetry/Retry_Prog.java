package iRetry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Retry_Prog 
{
	 @Test(retryAnalyzer=iRetry.Retry_Logic.class)
     public void searchmobile()
     {
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:/www.amazon.in/");
 		WebElement search_tf=driver.findElement(By.id("twotabsearchtextboxx"));
 		search_tf.sendKeys("mobile");
 		WebElement search_btn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
 		search_btn.click();
 		WebElement mobile1=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
 		mobile1.click();
     }
}
