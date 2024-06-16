package amazonScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchNQuit
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		WebElement login=driver.findElement(By.id("ap_email"));
		login.sendKeys("9063332478");
		WebElement cont_btn=driver.findElement(By.id("continue"));
		cont_btn.click();
		WebElement psw=driver.findElement(By.id("ap_password"));
		psw.sendKeys("AddChinna");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
	}
	@AfterMethod
	public void quit() throws IOException
	{
		TakesScreenshot a1= driver;
		File source=a1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\admin\\OneDrive\\Desktop\\MKT\\SHOT"+Math.random()+".png");
		FileHandler.copy(source, destination);

		WebElement logout=driver.findElement(By.xpath("//a[.='Sign Out']"));
		Actions a=new Actions(driver);
		a.moveToElement(logout);
		a.click();
		driver.quit();
	}
}

