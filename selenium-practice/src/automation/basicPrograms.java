package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicPrograms 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\chromedriver_win32_91\\chromedriver.exe");
		
		//to start web-browser
		WebDriver driver=new ChromeDriver();
		
		//1. open given URL
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		//2. Setting size of browser window
		Dimension D=new Dimension(100,200);
		driver.manage().window().setSize(D);
		Thread.sleep(1000);
		
		//3. Setting position of browser window
		Point P=new Point(300,400);
		driver.manage().window().setPosition(P);
		Thread.sleep(1000);
		
		//4. Maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//5. To Navigate to different URL
		driver.navigate().to("http://facebook.com/");
		Thread.sleep(1000);
		
		//6. To Navigate back to previous URL
		driver.navigate().back();
		Thread.sleep(1000);
		
		//7. To Navigate forword to desired URL
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//8. To refresh the browser
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		//9. To find the title of given page
		String title = driver.getTitle();
		System.out.println("Title of Page: "+title);
		
		//10. To find the url of current page
		String currentURL = driver.getCurrentUrl();
		System.out.println("URL of current page: "+currentURL);
		
		//11. To close the current tab
		driver.close();
		
		//12. to release WebDriver object
		driver.quit();
		
		
		
		
	}

}
