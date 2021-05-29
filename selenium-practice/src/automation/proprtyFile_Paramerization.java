package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class proprtyFile_Paramerization 
{
	
	static String str;
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("D:\\Testing Class\\local\\selenium-practice\\src\\data.properties");
		Properties prop=new Properties();
		prop.load(file);
		str = prop.getProperty("browser1");
		System.out.println("Name of browser: "+str);
			
		if(str.equals("chrome"))
		{
		String str1=prop.getProperty("webdriver1");
		String str2=prop.getProperty("browser1Path");
		System.setProperty(str1,str2);
		driver=new ChromeDriver();

		}
		else if(str.equals("gecko"))
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				
			}
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(prop.getProperty("user"));;
		Thread.sleep(3000);
		driver.quit();
	
		
	}

}
