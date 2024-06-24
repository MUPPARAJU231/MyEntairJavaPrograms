package amazon10ScenariosParallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DealsofTheDay extends LaunchQuit
{
	 @Test
     public void deal() throws InterruptedException 
     {
 		WebElement todaysdeals=driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_4']"));
 		todaysdeals.click();
 		Thread.sleep(2000);
 		WebElement dealoftheday=driver.findElement(By.cssSelector("li[aria-posinset='1']"));
 		dealoftheday.click();
 		
 		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
 		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-testid='B0CQPGG8KG']"))).click();
		
 		
// 		WebElement e1=driver.findElement(By.cssSelector("div[data-testid='B0CQPGG8KG']"));
// 		e1.click();
     }
}
