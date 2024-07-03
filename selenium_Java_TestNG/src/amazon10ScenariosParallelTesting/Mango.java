package amazon10ScenariosParallelTesting;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Mango extends LaunchQuit
{
	 @Test
     public void mango()
     {
 		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
 		dd.click();
 		Select s=new Select(dd);
 		s.selectByVisibleText("Amazon Fresh");
 		WebElement mango=driver.findElement(By.id("twotabsearchtextbox"));
 		mango.sendKeys("mango");
 		mango.sendKeys(Keys.ENTER);
 		
 		WebElement fresh_logo=driver.findElement(By.xpath("//a[@href=\"/alm/storefront?almBrandId=ctnow&ref=fs_dsk_sn_logo\"]"));
 		assertEquals(fresh_logo.isDisplayed(), true, "No Logo");
     }
}
