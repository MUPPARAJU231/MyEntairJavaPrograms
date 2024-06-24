package amazon10ScenariosParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class MoblieCover extends LaunchQuit
{
	 @Test
     public void searchmobileCover() throws InterruptedException 
     {
 		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
 		search_tf.sendKeys("mobile cover");
 		WebElement search_btn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
 		search_btn.click();
 		WebElement sort=driver.findElement(By.xpath("//li[@aria-label='Include Out of Stock']"));
 		sort.click();
 		
// 		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
// 		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[starts-with(@class,'a-size')])[3]"))).click();
		
		 WebElement mouse1=driver.findElement(By.xpath("(//span[starts-with(@class,'a-size')])[3]"));
		 mouse1.click(); 
     }
}
