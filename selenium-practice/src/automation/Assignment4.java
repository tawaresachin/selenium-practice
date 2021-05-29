package automation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.flipkart.com");
		
		//1. Flipkart Login Action
		WebElement userID=driver.findElement(By.xpath("//form/div[@class='IiD88i _351hSN']//input[@type='text' or @class='_2IX_2- VJZDxU']"));
		userID.sendKeys("9096349923");
		WebElement pass=driver.findElement(By.xpath("//input[@type='password' or @class='_2IX_2- _3mctLh VJZDxU']"));
		pass.click();
		pass.sendKeys("Asmita@2025");
		WebElement loginButton=driver.findElement(By.xpath("//form//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']"));
		loginButton.click();
		Thread.sleep(3000);
		
//		//Login form close action
//		WebElement closeLogin=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z' and contains(text(),'✕')]"));
//		closeLogin.click();
		
		//2. Flipkart Search Action
		WebElement search=driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[@title='Search for products, brands and more']"));
		search.sendKeys("redmi note 10 pro");
		WebElement button=driver.findElement(By.xpath("//button[@class='L0Z3Pu' and @type='submit']"));
		button.click();
//		search.sendKeys(Keys.ENTER);
		WebElement mobile=driver.findElement(By.xpath("(//div[@class='_3pLy-c row']//div[contains(text(),'Dark Night, 128 GB')])[1]"));
		mobile.click();
		
		//3. Switching to new tab
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		
		//4. Find price
		WebElement price=driver.findElement(By.xpath("//div[@class='_25b18c']/child::div"));
		String cost=price.getText();
		System.out.println("Price of mobile is: "+cost);
		
		driver.quit();
	}

}
