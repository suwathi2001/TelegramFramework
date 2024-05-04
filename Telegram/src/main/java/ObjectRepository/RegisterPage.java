package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(linkText = "Register")
	private static WebElement RegisterLink;
	
	public WebElement getRegisterLink()
	{
		return RegisterLink;
	}
	
	@FindBy(xpath = "//input[@id='gender-female']")
	private static WebElement GenderButton;
	
	public WebElement getGenderButton()
	{
		return GenderButton;
	}
	
	@FindBy(xpath = "//input[@id='FirstName']")
	private static WebElement FirstName;
	
	public WebElement getFirstName()
	{
		return FirstName;
	}
	
	@FindBy(xpath = "//input[@id='LastName']")
	private static WebElement LastName;
	
	public WebElement getLastName() 
	{
		return LastName;
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
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private static WebElement ConfirmPassword;
	
	public WebElement getConfirmPassword()
	{
		return ConfirmPassword;
	}
	
	@FindBy(xpath = "//input[@id='register-button']")
	private static WebElement RegisterButton;
	
	public WebElement getRegisterButton()
	{
		return RegisterButton;
	}
}
