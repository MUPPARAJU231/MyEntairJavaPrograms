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
		switch (nameofbrowser) {
		case "chrome": 
		{
			driver=new ChromeDriver();
		}
		break;
		case "edge": 
		{
			driver=new EdgeDriver();
		}
		break;
		case "firefox": 
		{
			driver=new FirefoxDriver();
		}
		break;
		default:System.err.println("Invalid Browser");
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
