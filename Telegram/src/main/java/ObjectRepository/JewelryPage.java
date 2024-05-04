package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {

	public JewelryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Jewelry")
	private static WebElement jewelryLink;
	
	public WebElement getjewelryLink()
	{
		return jewelryLink; 
	}

	@FindBy(linkText = "Black & White Diamond Heart")
	private static WebElement DiamondHeartAddToCartButton;
	
	public WebElement getDiamondHeartAddToCartButton()
	{
		return DiamondHeartAddToCartButton;
	}

	@FindBy(id = "products-orderby")
	private static WebElement SortByDropdown;
	
	public WebElement getSortByDropdown() 
	{
		return SortByDropdown;
	}
	
	@FindBy(id = "products-pagesize")
	private static WebElement DisplayDropdown;
	
	public WebElement getDisplayDropdown()
	{
		return DisplayDropdown;
	}
}
