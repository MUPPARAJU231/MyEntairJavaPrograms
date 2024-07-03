package amazon10ScenariosParallelTesting;

import static org.testng.Assert.assertEquals;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Books extends LaunchQuit 
{
	 @Test
     public void book() throws InterruptedException 
     {
 		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
 		dd.click();
 		Select s=new Select(dd);
 		s.selectByVisibleText("Books");
 		WebElement b=driver.findElement(By.id("twotabsearchtextbox"));
 		b.sendKeys("power of mind");
 		b.sendKeys(Keys.ENTER);
 		Thread.sleep(2000);
 		WebElement book1=driver.findElement(By.xpath("//span[.='The Power of Your Subconscious Mind: Original Edition | Premium Paperback']"));
 		book1.click();

 		Set<String> s1=driver.getWindowHandles();
 		Iterator<String> p_cid= s1.iterator();
 		String p_id=p_cid.next();
 		String c_id=p_cid.next();
 		driver.switchTo().window(c_id);
 		WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
 		assertEquals(addtocart.isDisplayed(), true);
     }
}
