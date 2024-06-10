package basic_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_NumbertoText 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\admin\\eclipse-workspace-mkt\\selenium\\TestData\\test.xlsx");
		Workbook wb=WorkbookFactory.create(f);
//		Sheet s=wb.getSheet("login");
//		Row r=s.getRow(3);
//		Cell c=r.getCell(1);
//		String value=c.getStringCellValue();
		String No=NumberToTextConverter.toText(wb.getSheet("login").getRow(3).getCell(1).getNumericCellValue());
		
		System.out.println(No);
		
	}
}
