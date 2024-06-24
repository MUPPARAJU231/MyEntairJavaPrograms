package amazon10ScenariosParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Redmi extends LaunchQuit
{
	 @Test
     public void redmicheck() throws InterruptedException 
     {
 		WebElement electronics=driver.findElement(By.xpath("//a[.=' Electronics ']"));
 		electronics.click();
 		WebElement redmi=driver.findElement(By.xpath("(//span[text()='Apple'])[2]"));
 		redmi.click();
     }
}
