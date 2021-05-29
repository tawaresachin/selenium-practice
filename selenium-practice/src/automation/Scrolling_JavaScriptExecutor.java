package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//		/* Application1-Scrolling the main browser window */
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");		//scoll-up
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-100)");	//scroll-down
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(500,0)");		//sroll-right
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(-200,0)");	//scroll-left
		
		/* Application2-Scrolling to the page object */
		driver.navigate().to("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[@id='mCSB_7_container']"));
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(2000);
		ele.click();
		ele.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		String str = ele.getText();
		System.out.println(str);
		Thread.sleep(2000);
//		
//		/* Application3-Access WebElement & perform action */
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(2000);
//		js.executeScript("document.getElementById('email').value='Sachin'");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
