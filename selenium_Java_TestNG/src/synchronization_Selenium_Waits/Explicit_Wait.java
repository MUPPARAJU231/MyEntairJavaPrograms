package synchronization_Selenium_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit_Wait 
{
     @Test
     public void testcase1()
     {
    	 ChromeDriver driver= new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://www.google.com");
 		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
 		w1.until(ExpectedConditions.titleContains("Goo"));
 		WebElement e=driver.findElement(By.name("q"));
 		e.sendKeys("India");
 		e.sendKeys(Keys.ENTER);
     }
}
