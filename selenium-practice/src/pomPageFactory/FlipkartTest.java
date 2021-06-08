package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\chromedriver_win32_91\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//Login Page
		FlipkartLoginPage login=new FlipkartLoginPage(driver);
		login.SetFlipkartUserID("9096349923");
		login.SetFlipkartPassword("9096349923");
		login.ClickFlipkartLoginButton();
		
		//Home Page
		FipkartHomePage home=new FipkartHomePage(driver);
		home.GetFlipkartHomePageTitle(driver);
		home.ClickMyProfileOnFlipkartHomePage(driver);
		home.ClickGroceryOnFlipkartHomePage(driver);
		
		//Offer Page
		FlipkartOfferPage offer=new FlipkartOfferPage(driver);
		offer.clickOnTopOfferOnFlipkart();
		offer.hoverOnElectronicsOnFlipkart(driver);
		offer.selectMobilesFromElectronicsOnFlipkart();
		offer.QuitBrowser(driver);
	}

}
