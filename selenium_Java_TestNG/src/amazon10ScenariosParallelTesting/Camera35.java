package amazon10ScenariosParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Camera35 extends LaunchQuit
{
	 @Test
     public void camera() throws InterruptedException 
     {
 		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
 		search_tf.sendKeys("camera");
 		WebElement search_btn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
 		search_btn.click();
 		WebElement nextpage=driver.findElement(By.xpath("//a[@aria-label='Go to next page, page 2']"));
 		nextpage.click();
 		Thread.sleep(5000);
 		WebElement camera35=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[12]"));
 		camera35.click();
     }
}
