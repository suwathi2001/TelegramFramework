package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demowebshopPage {

	public demowebshopPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='button-1 search-box-button']")
	private static WebElement searchbutton;
	
	public WebElement getsearchbutton() 
	{
		return searchbutton;
	}
		
	@FindBy(linkText = "Gift Cards")
	private static WebElement giftCards;
		
	public WebElement getgiftCards()
	{
		return giftCards;
	}
	
	@FindBy(linkText = "Register")
	private static WebElement register;
	
	public WebElement getregister()
	{
		return register;
	}
	
	@FindBy(linkText = "Log in")
	private static WebElement loginLink;
	
	public WebElement getloginLink()
	{
		return loginLink;
	}
}
