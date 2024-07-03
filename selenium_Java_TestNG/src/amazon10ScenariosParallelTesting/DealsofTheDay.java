package amazon10ScenariosParallelTesting;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DealsofTheDay extends LaunchQuit
{
	 @Test
     public void deal() throws InterruptedException 
     {
 		WebElement todaysdeals=driver.findElement(By.xpath("//a[@href=\'/deals?ref_=nav_cs_gb\']"));
 		todaysdeals.click();
 		Thread.sleep(2000);
 		WebElement dealoftheday=driver.findElement(By.xpath("//button[@data-csa-c-element-id=\"filter-bubble-deals-collection-deal-of-the-day\"]"));
 		dealoftheday.click();
 		
// 		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
// 		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-testid='B0CRQ8874B']"))).click();
		
 		Thread.sleep(3000);
 		WebElement e1=driver.findElement(By.xpath("(//div[@class='a-section ProductCardImage-module__wrapper_YgLz4kq6ekChj01qeqOf'])[1]"));
 		e1.click();
 		
 		WebElement buynow= driver.findElement(By.id("buy-now-button"));
 		assertTrue(buynow.isEnabled());
     }
}
