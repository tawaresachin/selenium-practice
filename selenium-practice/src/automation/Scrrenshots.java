package automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshots {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Testing Class\\2. Automation Testing\\Screenshots\\image.jpg");
		FileHandler.copy(src,dest);
		//FileUtils.copyFile(src,dest);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest1=new File("D:\\Testing Class\\2. Automation Testing\\Screenshots\\image1.jpg");
		FileHandler.copy(src1,dest1);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
