package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Signup 
{
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259813513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540019%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D13298992640119046696%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062141%26hvtargid%3Dkwd-365295376496%26hydadcr%3D5620_2359471%26gad_source%3D1&prevRID=V8SD0K229Q9SK5TQVB32&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.name("customerName")).sendKeys("India1");
		driver.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
		driver.findElement(By.id("ap_password")).sendKeys("qwerty");
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
	}
}
