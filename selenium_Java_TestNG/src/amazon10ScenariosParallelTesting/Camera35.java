package amazon10ScenariosParallelTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import java.util.Iterator;
import java.util.Set;
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

 		Set<String> s1=driver.getWindowHandles();
 		Iterator<String> p_cid= s1.iterator();
 		String p_id=p_cid.next();
 		String c_id=p_cid.next();
 		driver.switchTo().window(c_id);
 		//Assertion addtocart
 		WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
 		assertEquals(addtocart.isDisplayed(), true);
 		//Assertion url
 		String actualurl=driver.getCurrentUrl();
 		String expectedurl="https://www.amazon.in/FINICKY-WORLD-Bulb-Camera-Wireless-Panoramic/dp/B0C4LFWT82/ref=sr_1_23_sspa?crid=1DEUIZ5RW6591&dib=eyJ2IjoiMSJ9.YxXul07j7o4UqvlTz2wWQePjr9m6h-eP2aWtSXVRinc71531z0gVukVY32aQkbhU0obwVamz-HJUzma4bT6gXDOZzoTM0YooNdfDa6r9hw7Bd5ARMJkNbAehNacOUAheeQ7GUaMjipdIxzUwayBueyeqhJ8fkbsroY4lKQdfnV5xl_Zsm3lOuRVmUD_kfe1M.o6hIRf0E2vYKXPvmNHNbAd9L9fTuh5ijhsZI6RO8C8Y&dib_tag=se&keywords=camera&qid=1719930955&sprefix=camera%2Caps%2C393&sr=8-23-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9tdGY&psc=1";
 		assertNotEquals(actualurl , expectedurl);
     }
}
