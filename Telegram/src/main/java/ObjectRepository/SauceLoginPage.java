package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLoginPage {
	
	public SauceLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	private static WebElement usernameLink;
	
	public WebElement getusernameLink()
	{
		return usernameLink;
	}
	
	@FindBy(xpath = "//input[@id='password']")
	private static WebElement passwordLink;
	
	public WebElement getpasswordLink()
	{
		return passwordLink;
	}
	
	@FindBy(xpath = "//input[@id='login-button']")
	private static WebElement LoginButton;
	
	public WebElement getLoginButtton()
	{
		return LoginButton;
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private static WebElement AddtoCartButton;
	
	public WebElement getAddtoCartButton()
	{
		return AddtoCartButton;
	}
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private static WebElement cartButton;
	
	public WebElement getcartButton()
	{
		return cartButton;
	}
	
	@FindBy(linkText = "Sauce Labs Backpack")
	private static WebElement sauceLabsBackpackTitle;
	
	public WebElement getsauceLabsBackpackTitle()
	{
		return sauceLabsBackpackTitle;
	}
	
	@FindBy(xpath = "//div[@class='inventory_item_price']//..//button[@id='remove-sauce-labs-backpack']")
	private static WebElement sauceLabsBackpackPrice;
	
	public WebElement getsauceLabsBackpackPrice()
	{
		return sauceLabsBackpackPrice;
	}
	
	@FindBy(xpath = "//button[.='Checkout']")
	private static WebElement checkOut;
	
	public WebElement getcheckOut()
	{
		return checkOut;
	}
	
	@FindBy(id = "first-name")
	private static WebElement firstName;
	
	public WebElement getfirstName()
	{
		return firstName;
	}
	
	@FindBy(id = "last-name")
	private static WebElement lastName;
	
	public WebElement getlastName()
	{
		return lastName;
	}
	
	@FindBy(id = "postal-code")
	private static WebElement postalCode;
	
	public WebElement getpostalCode()
	{
		return postalCode;
	}
	
	@FindBy(id = "continue")
	private static WebElement continueButton;
	
	public WebElement getcontinueButton()
	{
		return continueButton;
	}
	
	@FindBy(xpath = "//button[@id='finish']")
	private static WebElement finish;
	
	public WebElement getfinish()
	{
		return finish;
	}
	
	@FindBy(className = "complete-header")
	private static WebElement orderPlaced;
	
	public WebElement getorderPlaced()
	{
		return orderPlaced;
	}
}
