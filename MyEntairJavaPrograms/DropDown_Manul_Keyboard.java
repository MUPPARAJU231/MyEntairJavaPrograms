package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_Manul_Keyboard
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement dd=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        dd.sendKeys(Keys.ARROW_DOWN);
        dd.sendKeys(Keys.ARROW_DOWN);
        dd.sendKeys(Keys.ARROW_DOWN);
        dd.sendKeys(Keys.ARROW_DOWN);
	}	
}
