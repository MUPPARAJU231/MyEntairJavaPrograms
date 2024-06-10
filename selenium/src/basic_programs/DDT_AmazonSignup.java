package basic_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_AmazonSignup 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		FileInputStream f=new FileInputStream("C:\\Users\\admin\\eclipse-workspace-mkt\\selenium\\TestData\\test.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		String name=wb.getSheet("amazon_signup").getRow(1).getCell(0).getStringCellValue();
		String MNo=NumberToTextConverter.toText(wb.getSheet("amazon_signup").getRow(1).getCell(1).getNumericCellValue());
		String psw=wb.getSheet("amazon_signup").getRow(1).getCell(2).getStringCellValue();
		
		
		driver.findElement(By.name("customerName")).sendKeys(name);
		driver.findElement(By.id("ap_phone_number")).sendKeys(MNo);
		driver.findElement(By.id("ap_password")).sendKeys(psw);
		driver.findElement(By.id("continue")).click();
		
	}
}
