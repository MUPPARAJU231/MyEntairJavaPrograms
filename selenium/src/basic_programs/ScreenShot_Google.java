package basic_programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Google 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement e= driver.findElement(By.name("q"));
		e.sendKeys("india");
		e.sendKeys(Keys.ENTER);
		
		TakesScreenshot a1= driver;
		File source=a1.getScreenshotAs(OutputType.FILE);
//		File destination=new File("C:\\Users\\admin\\OneDrive\\Desktop\\MKT\\ram.png");
		File destination=new File("C:\\Users\\admin\\OneDrive\\Desktop\\MKT\\ram"+Math.random()+".png");
		FileHandler.copy(source, destination);
	}
}
