package amazonScreenshot;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchNQuit
{
	@Test
	public void buy() throws InterruptedException	
	{ 
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		WebElement search_btn=driver.findElement(By.id("nav-search-submit-button"));
		search_btn.click();
		WebElement shoe1=driver.findElement(By.xpath("//div[@data-index='3']"));
		shoe1.click();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> pcid=s.iterator();
		String p_id=pcid.next();
		String c_id=pcid.next();

		driver.switchTo().window(c_id);

		WebElement wish_list=driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
		wish_list.click();

		WebElement view_list=driver.findElement(By.xpath("//button[@aria-label='Close']"));
		view_list.click();
		WebElement addtokart=driver.findElement(By.id("add-to-cart-button"));
		addtokart.click();
		WebElement gotokart=driver.findElement(By.id("nav-cart-count"));
		gotokart.click();
		WebElement buy=driver.findElement(By.name("proceedToRetailCheckout"));
		buy.click();
//		driver.navigate().back();
//		WebElement logout=driver.findElement(By.xpath("//a[.='Sign Out']"));
//		Actions a=new Actions(driver);
//		a.moveToElement(logout);
//		Thread.sleep(2000);
//		a.click();
	}
}
