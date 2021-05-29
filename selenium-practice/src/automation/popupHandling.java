package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(3000);
		
		//Using Alert Class & its action
		driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		//alt.accept();			//to accept
		//alt.dismiss();		//To cancel or decline
		String str=alt.getText();		//to get text from popup
		System.out.println("Alert: "+str);
		alt.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		Thread.sleep(3000);
		Alert alt1=driver.switchTo().alert();
		alt1.sendKeys("Sachin");			//To send input on popup
		alt1.accept();
		
		Thread.sleep(3000);
		driver.quit();
	

	}

}
