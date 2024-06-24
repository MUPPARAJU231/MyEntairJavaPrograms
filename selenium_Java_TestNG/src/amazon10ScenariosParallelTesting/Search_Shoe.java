package amazon10ScenariosParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Search_Shoe extends  LaunchQuit
{
	 @Test
     public void home() throws InterruptedException 
     {
	 		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
	 		search_tf.sendKeys("shoe");
	 		search_tf.sendKeys(Keys.ENTER);
	 		WebElement home_btn=driver.findElement(By.id("nav-logo-sprites"));
	 		home_btn.click();
     }
}
