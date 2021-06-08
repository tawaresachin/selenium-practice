package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotClass {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Study\\Drivers\\chromedriver_win32_91\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		Robot robo=new Robot();
		/* Mouse Move Action */
		robo.mouseMove(611, 430);		// To click on link
//		robo.mouseMove(440, 298);		//To click on search
		robo.delay(2000);
		
		/* Mouse Press Action */
		robo.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		robo.delay(2000);
		
		/* Keyboard Key Press Action */
//		robo.keyPress(KeyEvent.VK_A);	//Pass character in search field
//		robo.keyRelease(KeyEvent.VK_A);

		Thread.sleep(3000);
		driver.quit();
	}

}
