package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Amazon 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement e=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		Select s=new Select(e);
		s.selectByValue("search-alias=appliances");
		s.selectByVisibleText("Books");
		s.selectByIndex(3);
		
	}	
}
