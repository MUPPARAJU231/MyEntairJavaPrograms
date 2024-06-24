package amazon10ScenariosParallelTesting;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit
{
	RemoteWebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launch(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
		driver=new EdgeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
		driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	@AfterMethod
	public void quit() 
	{
		driver.quit();
	}
}
