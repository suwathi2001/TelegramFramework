package testScripts;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectRepository.BookPage;
import ObjectRepository.LogInPage;
import ObjectRepository.SauceLoginPage;
import ObjectRepository.demoappsPage;
import ObjectRepository.demowebshopPage;

public class integrationTest {

	@Test
	public void iT_17()
	{
		//Verify Demo Web Shop Title is displaying in HomePage
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String title = driver.getTitle();
		driver.quit();
			
	}
	
	@Test
	public void iT_18()
	{
		//Verify by checking the alert pop up after clicking on login button and close the pop up
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		SauceLoginPage popup = new SauceLoginPage(driver);
		popup.getusernameLink().sendKeys("standard_user");
		popup.getpasswordLink().sendKeys("secret_sauce");
		popup.getLoginButtton().click();
		
		driver.switchTo().alert().accept();
		driver.quit();
	}
	
	@Test
	public void iT_19()
	{
		//Verify by clicking on Price (High to Low) in Filter 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		SauceLoginPage dropdown = new SauceLoginPage(driver);
		dropdown.getusernameLink().sendKeys("standard_user");
		dropdown.getpasswordLink().sendKeys("secret_sauce");
		dropdown.getLoginButtton().click();
		
		
		WebElement element = driver.findElement(By.className("product_sort_container"));
		Select select = new Select(element);
		select.selectByValue("hilo");
		
		driver.quit();
	}
	
	@Test
	public void iT_20()
	{
		//Verify by clicking on Add to cart button is adding the product
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		SauceLoginPage dropdown = new SauceLoginPage(driver);
		dropdown.getusernameLink().sendKeys("standard_user");
		dropdown.getpasswordLink().sendKeys("secret_sauce");
		dropdown.getLoginButtton().click();
		
		dropdown.getAddtoCartButton().click();
		dropdown.getcartButton().click();
		dropdown.getsauceLabsBackpackTitle();
		
		driver.quit();
	}
	
	@Test
	public void iT_21()
	{
		//Check the Sauce Labs Backpack price and display the price
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		SauceLoginPage dropdown = new SauceLoginPage(driver);
		dropdown.getusernameLink().sendKeys("standard_user");
		dropdown.getpasswordLink().sendKeys("secret_sauce");
		dropdown.getLoginButtton().click();
		dropdown.getsauceLabsBackpackTitle();
		dropdown.getsauceLabsBackpackPrice();
		driver.quit();
	}
	
	@Test
	public void iT_22()
	{
		//Verify by clicking on Button in demoapps
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		demoappsPage button = new demoappsPage(driver);
		button.getUITestingConceptsLink();
		button.getwebElement().click();
		button.getbuttonweb().click();
		button.getyes1().click();
		button.getyes2().click();
		button.getnum1().click();
		driver.quit();
	}
	
	@Test
	public void iT_23()
	{
		//Verify by clicking on image in demoapps
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		demoappsPage image = new demoappsPage(driver);
		image.getUITestingConceptsLink().click();
		image.getwebElement().click();
		image.getimage().click();
		image.getclothingtype().click();
		driver.quit();
		
	}
	
	@Test
	public void iT_24()
	{
		//Verify by clicking on Print popup and print the page
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		demoappsPage print = new demoappsPage(driver);
		print.getUITestingConceptsLink();
		print.getOthers().click();
		print.getprint().click();
		print.getprintOut().click();
		print.getsave().click();
		driver.quit();
	}
	
	@Test
	public void iT_25()
	{
		//Verify by clicking on Toggle button in demoapps
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		demoappsPage toggle = new demoappsPage(driver);
		toggle.getUITestingConceptsLink().click();
		toggle.getwebElement().click();
		toggle.gettoggle().click();
		toggle.gettogglebutton().isSelected();
		toggle.getplaceOrder().click();
		
		driver.quit();
	}

	@Test
	public void iT_26()
	{
		//Verify by clicking on TextBox in demoapps
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		demoappsPage text = new demoappsPage(driver);
		text.getUITestingConceptsLink().click();
		text.getwebElement().click();
		text.gettextboxbutton().click();
		text.getnametxt().sendKeys("Suwathi");
		text.getemailId().sendKeys("suwathivelumani@gmail.com");
		text.getpasswordtxt().sendKeys("Suwathi@26");
		text.getregisterButton().click();
		driver.quit();
	}
	
	@Test
	public void iT_27()
	{
		//Verify by clicking on Edit in Shopping cart and remove the product
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LogInPage login = new LogInPage(driver);
		BookPage book = new BookPage(driver);
		demoappsPage demo = new demoappsPage(driver);
		login.getloginLink().click();
		login.getEmail().sendKeys("suwathi315@gmail.com");
		login.getPassword().sendKeys("Suwathi@26");
		login.getLoginButton().click();
		book.getBooksLink().click();
		book.getaddToCart().click();
		book.getshoppingCart().click();
		demo.getremove().click();
		demo.getupdateShopping().click();
		driver.quit();
	}
	@Test
	public void iT_28()
	{
		//Verify by clicking on gift cards link and make changes in dropdown 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		demowebshopPage giftcards = new demowebshopPage(driver);
		giftcards.getgiftCards().click();
		
		WebElement gifts = driver.findElement(By.id("products-orderby"));
		Select gift = new Select(gifts);
		gift.selectByValue("https://demowebshop.tricentis.com/gift-cards?orderby=5");
		
		WebElement displaySize = driver.findElement(By.id("products-pagesize"));
		Select size = new Select(displaySize);
		size.selectByValue("https://demowebshop.tricentis.com/gift-cards?pagesize=8");
		
		WebElement viewAs = driver.findElement(By.id("products-viewmode"));
		Select view = new Select(viewAs);
		view.selectByValue("https://demowebshop.tricentis.com/gift-cards?viewmode=list");
				
		driver.quit();
	}
}
