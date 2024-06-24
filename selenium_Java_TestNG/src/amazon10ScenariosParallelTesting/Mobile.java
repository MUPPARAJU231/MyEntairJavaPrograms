package amazon10ScenariosParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Mobile extends LaunchQuit
{
	 @Test
     public void searchmobile()
     {
 		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
 		search_tf.sendKeys("mobile");
 		WebElement search_btn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
 		search_btn.click();
 		WebElement mobile1=driver.findElement(By.xpath("//div[@data-index='3']"));
 		mobile1.click();
     }
}
