package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	public LogInPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='ico-login']")
	private static WebElement loginLink;
	
	public WebElement getloginLink()
	{
		return loginLink;
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	private static WebElement Email;
	
	public WebElement getEmail()
	{
		return Email;
	}
	
	@FindBy(xpath = "//input[@id='Password']")
	private static WebElement Password;
	
	public WebElement getPassword()
	{
		return Password;
	}
	
	@FindBy(xpath = "//input[@value='Log in']")
	private static WebElement LoginButton;
	
	public WebElement getLoginButton()
	{
		return LoginButton;
	}
	
	
}
