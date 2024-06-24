package amazon10ScenariosParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Mango extends LaunchQuit
{
	 @Test
     public void mango() throws InterruptedException 
     {
		 Thread.sleep(2000);
 		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
 		dd.click();
 		Select s=new Select(dd);
 		s.selectByVisibleText("Amazon Fresh");
 		WebElement mango=driver.findElement(By.id("twotabsearchtextbox"));
 		mango.sendKeys("mango");
 		mango.sendKeys(Keys.ENTER);
     }
}
