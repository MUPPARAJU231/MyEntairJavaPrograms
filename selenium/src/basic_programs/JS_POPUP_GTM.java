package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class JS_POPUP_GTM
{
	public static void main(String[] args) throws InterruptedException  
	{
	    EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.findElement(By.className("btnjs")).click();
//		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
}
