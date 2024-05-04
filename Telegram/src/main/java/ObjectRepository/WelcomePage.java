package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WelcomePage {

	public WelcomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Books")
	private WebElement BooksLink;
	
	public WebElement getBooksLink()
	{
		return BooksLink;
	}
		
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	public WebElement getRegisterLink()
	{
		return RegisterLink;
	}
		
	@FindBy(linkText = "Log in")
	private WebElement LoginLink;
	
	public WebElement getLoginLink()
	{
		return LoginLink;
	}
		
	@FindBy(linkText = "My account")
	private WebElement MyaccountLink;
	
	public WebElement getMyaccountLink()
	{
		return MyaccountLink;
	}
	
	@FindBy(xpath = "//a[.='Automationteststore']")
	private WebElement automationteststoreLink;
	
	public WebElement getautomationteststoreLink()
	{
		return automationteststoreLink;
	}
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	public WebElement getlogoutLink()
	{
		return logoutLink;
	}
	
	@FindBy(linkText = "Jewelry")
	private static WebElement jewelryLink;
	
	public WebElement getjewelryLink()
	{
		return jewelryLink; 
	}
}