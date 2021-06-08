package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage 
{	
	private static final FipkartHomePage FipkartHomePage = null;
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']") private WebElement userID;
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]") private WebElement login;
	
	public FlipkartLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SetFlipkartUserID(String user)
	{
		userID.sendKeys(user);
	}
	
	public void SetFlipkartPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public FipkartHomePage ClickFlipkartLoginButton()
	{
		login.click();
		return FipkartHomePage;
	}


}
