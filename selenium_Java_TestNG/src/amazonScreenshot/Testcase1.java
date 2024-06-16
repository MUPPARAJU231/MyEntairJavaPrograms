package amazonScreenshot;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Testcase1 extends LaunchNQuit
{
	@Test
	public  void Addtokart() 
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
	}
}
