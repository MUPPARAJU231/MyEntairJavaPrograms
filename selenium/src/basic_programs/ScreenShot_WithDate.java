package basic_programs;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_WithDate 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement e= driver.findElement(By.name("q"));
		e.sendKeys("india");
		e.sendKeys(Keys.ENTER);
		
		Date d=new Date();
		String dt=d.toString();
		System.out.println(dt);
		String t=dt.substring(11, 19);
		String time=t.replace(":", "_");
		System.out.println(time);
		
		ScreenShot_WithDate s=new ScreenShot_WithDate();
		Object o=s.getClass();
		System.out.println(o);
		
		TakesScreenshot a1= driver;
		File source=a1.getScreenshotAs(OutputType.FILE);
//		File destination=new File("C:\\Users\\admin\\OneDrive\\Desktop\\MKT\\ram"+time+".png");
		File destination=new File("C:\\Users\\admin\\OneDrive\\Desktop\\MKT\\ram"+o+".png");
		FileHandler.copy(source, destination);
	}
}
