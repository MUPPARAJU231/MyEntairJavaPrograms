package amazon10ScenariosParallelTesting;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Mobile  extends LaunchQuit
{
	 @Test
     public void searchmobile() throws InterruptedException
     {
 		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
 		search_tf.sendKeys("mobile" , Keys.ENTER);
 		WebElement mobile1=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
 		mobile1.click();
 		Set<String> s1=driver.getWindowHandles();
 		Iterator<String> p_cid= s1.iterator();
 		String p_id=p_cid.next();
 		String c_id=p_cid.next();
 		driver.switchTo().window(c_id);
 		WebElement buynow_btn=driver.findElement(By.id("buy-now-button"));
 		assertEquals(buynow_btn.isDisplayed(), true, "Mobile Not Selected");
     }
}
