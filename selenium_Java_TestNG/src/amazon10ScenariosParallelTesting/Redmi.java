package amazon10ScenariosParallelTesting;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Redmi extends LaunchQuit
{
	@Test
	public void redmicheck()  
	{
		WebElement electronics=driver.findElement(By.xpath("//a[.=' Electronics ']"));
		electronics.click();
		WebElement redmi=driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[8]"));
		redmi.click();

		WebElement actual=driver.findElement(By.xpath("//span[.='Clear']"));
		assertEquals(actual.isDisplayed(), true, "Redmi Not Selected");
	}
}
