package amazon10ScenariosParallelTesting;

import static org.testng.Assert.assertEquals;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Shoe extends LaunchQuit
{
     @Test
     public void searchshoe()
     {
 		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
 		search_tf.sendKeys("shoe");
 		WebElement search_btn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
 		search_btn.click();
 		WebElement shoe1=driver.findElement(By.xpath("//div[@data-index='3']"));
 		shoe1.click();
 		Set<String> s1=driver.getWindowHandles();
 		Iterator<String> p_cid= s1.iterator();
 		String p_id=p_cid.next();
 		String c_id=p_cid.next();
 		driver.switchTo().window(c_id);
 		WebElement buynow_btn=driver.findElement(By.id("buy-now-button"));
 		assertEquals(buynow_btn.isDisplayed(), true, "shoe Not Selected");
     }
}
