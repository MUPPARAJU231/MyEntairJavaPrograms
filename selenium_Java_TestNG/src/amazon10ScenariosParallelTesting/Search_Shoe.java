package amazon10ScenariosParallelTesting;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Search_Shoe extends  LaunchQuit
{
	@Test
	public void home() throws InterruptedException 
	{
		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("shoe",Keys.ENTER);
		//shoe assert
		WebElement now_sBox=driver.findElement(By.xpath("(//input[@value='shoe'])[1]"));
		String actual =now_sBox.getDomAttribute("value");
		System.out.println(actual);
		assertEquals(actual ,"shoe" , "Shoe Not Searched");

		WebElement home_btn=driver.findElement(By.id("nav-logo-sprites"));
		home_btn.click();
		//Home assert
		WebElement now_sBox1=driver.findElement(By.xpath("//input[@type='text']"));
		String actual1 =now_sBox1.getDomAttribute("value");
		System.out.println(actual1);
		assertEquals(actual1 ,"" , "Search box Not Empty");
	}
}
