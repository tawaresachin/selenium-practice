package automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookieHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\chromedriver_win32_91\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.com/");
		
		Set<Cookie> cookie1 = driver.manage().getCookies();
		int size = cookie1.size();
		
		System.out.println("Size of cookies: "+size);
		for(Cookie cookie:cookie1)
		{
			System.out.println("Name of Cookie:"+cookie.getName()+" Value of Cookie:"+cookie.getValue());
		}
		
	Cookie cookie2 = driver.manage().getCookieNamed("1P_JAR");
	System.out.println("Name of Cookie:"+cookie2.getName()+" Value of Cookie:"+cookie2.getValue());
	
	Cookie cookie3=new Cookie("Sachin","25051988");
	driver.manage().addCookie(cookie3);
	
	Set<Cookie> cookie4 = driver.manage().getCookies();
	for(Cookie cookiee:cookie4)
	{
		System.out.println("Name of Cookie:"+cookiee.getName()+" Value of Cookie:"+cookiee.getValue());
	}
	
//	driver.manage().deleteCookie(cookie3);
//	Cookie cookie5 = driver.manage().getCookieNamed("Sachin");
//	System.out.println("Name of Cookie:"+cookie5.getName()+" Value of Cookie:"+cookie5.getValue());

//	driver.manage().deleteCookieNamed("Sachin");
//	Cookie cookie6 = driver.manage().getCookieNamed("Sachin");
//	System.out.println("Name of Cookie:"+cookie6.getName()+" Value of Cookie:"+cookie6.getValue());
	
	Thread.sleep(3000);
	driver.quit();
	
	}
	
}
