package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

	public AmazonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='icp-nav-flyout']")
	private static WebElement chooseLanguage;
	
	public WebElement getchooseLanguage()
	{
		return chooseLanguage;
	}
	
	@FindBy(xpath = "//div[@class='a-row']//input[@class='a-button-input']")
	private static WebElement savechanges;
	
	public WebElement getsavechanges()
	{
		return savechanges;
	}
	
	@FindBy(id = "twotabsearchtextbox")
	private static WebElement searchtextfield;
	
	public WebElement getsearchtextfield()
	{
		return searchtextfield;
	}
	
	@FindBy(id = "nav-search-submit-button")
	private static WebElement searchbutton;
	
	public WebElement getsearchbutton()
	{
		return searchbutton;
	}
}
