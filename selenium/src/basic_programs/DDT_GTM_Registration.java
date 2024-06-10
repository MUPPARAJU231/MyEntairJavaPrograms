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
import org.openqa.selenium.support.ui.Select;

public class DDT_GTM_Registration 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");

		FileInputStream f=new FileInputStream("C:\\Users\\admin\\eclipse-workspace-mkt\\selenium\\TestData\\test.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		String F_name=wb.getSheet("GTM").getRow(1).getCell(0).getStringCellValue();
		String L_name=wb.getSheet("GTM").getRow(1).getCell(1).getStringCellValue();
		String email=wb.getSheet("GTM").getRow(1).getCell(2).getStringCellValue();
		String PhNo=NumberToTextConverter.toText(wb.getSheet("GTM").getRow(1).getCell(3).getNumericCellValue());		
		String aadhaar=NumberToTextConverter.toText(wb.getSheet("GTM").getRow(1).getCell(6).getNumericCellValue());
		String pan=wb.getSheet("GTM").getRow(1).getCell(7).getStringCellValue();

		driver.findElement(By.id("firstName")).sendKeys(F_name);
		driver.findElement(By.id("lastName")).sendKeys(L_name);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("phone")).sendKeys(PhNo);
		WebElement g= driver.findElement(By.id("gender"));
		Select sg=new Select(g);
		sg.selectByVisibleText("Male");
		WebElement st= driver.findElement(By.id("state"));
		Select sta=new Select(st);
		sta.selectByVisibleText("Andhra Pradesh");
		driver.findElement(By.id("aadhaar")).sendKeys(aadhaar);
		driver.findElement(By.id("pan")).sendKeys(pan);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("Submit")).click();
	}
}
