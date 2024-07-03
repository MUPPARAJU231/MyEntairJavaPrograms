package assertion_TestNG;

import static org.testng.Assert.assertEquals;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Search_Shoe
{
	@Test
	public void shoe() throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("shoe");
		search_tf.sendKeys(Keys.ENTER);
		WebElement first_shoe=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		first_shoe.click();
		
		Set<String> s=driver.getWindowHandles();
		int tabs=s.size();
		assertEquals(tabs, 2,"No Child Tab");
		driver.quit();
	}
}
