package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.ListenerClass.class)
public class Listener_Program extends ListenerClass
{
	@Test
	public void searchmobile() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.amazon.in/");
		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("mobile");
		WebElement search_btn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search_btn.click();
		Thread.sleep(2000);
		WebElement mobile1=driver.findElement(By.xpath("//div[@data-index='5']"));
		mobile1.click();
	}
}
