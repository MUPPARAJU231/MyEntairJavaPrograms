package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_POPUP_GTMRegi 
{
	public static void main(String[] args) throws InterruptedException  
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement file= driver.findElement(By.id("file"));
		file.sendKeys("C:\\Users\\admin\\OneDrive\\Desktop\\MKT\\upload.pdf");
	}
}
