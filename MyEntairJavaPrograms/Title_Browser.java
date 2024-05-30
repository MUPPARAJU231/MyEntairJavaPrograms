package basic_programs;

import org.openqa.selenium.edge.EdgeDriver;

public class Title_Browser 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
}
