package basic_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Parent_Child_Tabs 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement laptop= driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		laptop.click();
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);

		Iterator<String> pcid=s1.iterator();
		String parentid=pcid.next();
		String childid=pcid.next();
		System.out.println(parentid);
		System.out.println(childid);
	}
}
