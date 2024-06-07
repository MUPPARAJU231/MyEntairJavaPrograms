package basic_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Links 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	    List<WebElement> links= driver.findElements(By.tagName("a"));
	    int count=links.size();
	    System.out.println(count);
	    for(int i=0;i<count;i++)
	    {
	    	WebElement e=links.get(i);
	    	String link_text=e.getText();
	    	String link=e.getAttribute("href");
	    	System.out.println(link_text);
	    	System.out.println(link);
	    }
	    
	}
}
