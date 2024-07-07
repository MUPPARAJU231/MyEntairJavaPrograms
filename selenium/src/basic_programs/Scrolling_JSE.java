package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_JSE 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement aboutus=driver.findElement(By.linkText("About Us"));
        Point p1= aboutus.getLocation();
	    int x= p1.getX();
        int y= p1.getY();	
        System.out.println(x);
        System.out.println(y);
        
        JavascriptExecutor e=driver;
        e.executeScript("window.scrollBy(0,"+y+")");
        Thread.sleep(3000);
        e.executeScript("window.scrollBy(0,"+-y+")");	     
	}
}
