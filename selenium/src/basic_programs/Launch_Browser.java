package basic_programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser
{

	public static void main(String[] args) 
	{
	
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
}
