package basic_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_Naukari 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		WebElement regi=driver.findElement(By.xpath("//a[.='Register']"));
		regi.click();
		WebElement continue_with=driver.findElement(By.className("google-text"));
		continue_with.click();
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String> pcid=s.iterator();
		String p_id=pcid.next();
		String c_id=pcid.next();
		driver.switchTo().window(c_id);
		
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("mygarbage@gmail.com");
		driver.quit();
	}
}
