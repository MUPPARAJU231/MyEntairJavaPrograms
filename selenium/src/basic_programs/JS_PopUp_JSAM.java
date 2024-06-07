package basic_programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class JS_PopUp_JSAM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/learningHTML1.html");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
}
