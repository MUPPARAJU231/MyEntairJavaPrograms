package basic_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Flipkart_mobile 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search_tf= driver.findElement(By.className("Pke_EE"));
		search_tf.sendKeys("mobile");
		search_tf.sendKeys(Keys.ENTER);

		List<WebElement> mobile1=driver.findElements(By.xpath("//div[@class='yKfJKb row']"));
		mobile1.get(0).click();
		
	}
}
