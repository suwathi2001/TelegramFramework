package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {

	public BookPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Books")
	private static WebElement BooksLink;
	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement BooksTitle;

	public WebElement getBooksLink() {
	return BooksLink;
}
	public WebElement getBooksTitle()
	{
		return BooksTitle;
	}
	
	@FindBy(xpath = "button-2 product-box-add-to-cart-button")
	private static WebElement addToCart;
	
	public WebElement getaddToCart()
	{
		return addToCart;
	}
	
	@FindBy(xpath = "//span[.='Shopping cart']")
	private static WebElement shoppingCart;
	
	public WebElement getshoppingCart()
	{
		return shoppingCart;
	}
	
	@FindBy(className = "qty-input valid")
	private static WebElement quantity;
	
	public WebElement getquantity()
	{
		return quantity;
	}
	
	@FindBy(xpath = "//span[@class='product-subtotal']")
	private WebElement price;
	
	public WebElement getprice()
	{
		return price;
	}
}