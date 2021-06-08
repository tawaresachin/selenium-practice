package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parameterization 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\chromedriver_win32_91\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		
		FileInputStream file=new FileInputStream("C:\\Users\\Sachin Taware\\Desktop\\sample1.xlsx");
		Workbook file1 = WorkbookFactory.create(file);
		Sheet sheet = file1.getSheet("Sheet1");
		int maxRow = sheet.getLastRowNum();	
		Row row = sheet.getRow(1);
		int maxCell=row.getLastCellNum();

		for(int i=1;i<=maxRow;i++)
		{
			Row rowData = sheet.getRow(i);
			String emailData = rowData.getCell(1).getStringCellValue();
			String passData = rowData.getCell(2).getStringCellValue();
			
			email.sendKeys(emailData);
			pass.sendKeys(passData);
			Thread.sleep(3000);
			email.clear();
			pass.clear();
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
