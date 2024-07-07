package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Browser 
{
	public static void main(String[] args)
	{
		ChromeOptions o1=new ChromeOptions();
		o1.addArguments("headless");
		
		ChromeDriver driver=new ChromeDriver(o1);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		WebElement search_btn=driver.findElement(By.id("nav-search-submit-button"));
		search_btn.click();
//		WebElement first_shoe=driver.findElement(By.xpath("(//div[@data-index='3']"));
//		first_shoe.click();

		System.out.println(driver.getCurrentUrl());
		System.out.println("This is Headless Browser");
	}

}
