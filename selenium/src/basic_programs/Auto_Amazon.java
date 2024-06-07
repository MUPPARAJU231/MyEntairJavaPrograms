package basic_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto_Amazon 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement accoun_list= driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));
		Actions a=new Actions(driver);
		a.moveToElement(accoun_list).click().perform();
		WebElement signin=driver.findElement(By.name("email"));
		signin.sendKeys("9494743231");
		WebElement cont_btn=driver.findElement(By.id("continue"));
		cont_btn.click();
		WebElement psw=driver.findElement(By.name("password"));
		psw.sendKeys("123veR^2");
		WebElement signin_btn=driver.findElement(By.id("signInSubmit"));
		signin_btn.click();

		WebElement search_tf=driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("shoe");
		WebElement search_btn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search_btn.click();
		WebElement shoe1=driver.findElement(By.xpath("//div[@data-index='3']"));
		shoe1.click();
		
	}
}
