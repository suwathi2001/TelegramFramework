package testScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectRepository.AmazonPage;
import ObjectRepository.BookPage;
import ObjectRepository.LogInPage;
import ObjectRepository.RegisterPage;
import ObjectRepository.SauceLoginPage;
import ObjectRepository.WelcomePage;
import ObjectRepository.demoappsPage;
import ObjectRepository.demowebshopPage;
import genericLibrary.BaseClass;

public class functionTest {

	@Test
	public void fT_01() {
		//Click on the books button and check the title of page
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		BookPage books = new BookPage(driver);
		
		welcome.getBooksLink().click();
		
		String title = books.getBooksTitle().getText();
		System.out.println(title);
		
		driver.quit();
	}
	
	@Test
	public void fT_02() {
		//Verify by entering all the credentials in Register option and click Register button
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    WelcomePage welcome = new WelcomePage(driver);
	    RegisterPage register = new RegisterPage(driver);
	    
	    register.getRegisterLink().click();
	    register.getGenderButton().click();
	    register.getFirstName().sendKeys("Suwathi");
	    register.getLastName().sendKeys("Velumani");
	    register.getEmail().sendKeys("suwathi315@gmail.com");
	    register.getPassword().sendKeys("Suwathi@123");
	    register.getConfirmPassword().sendKeys("Suwathi@123");
	    register.getRegisterButton().click();
	    
	    driver.quit();
	}
	
	@Test
	public void fT_03()
	{
		//Verify by entering valid Email Id and Valid Password in Log In
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WelcomePage welcome = new WelcomePage(driver);
		LogInPage login = new LogInPage(driver);
		
		welcome.getLoginLink().click();
		login.getEmail().sendKeys("suwathi315@gmail.com");
		login.getPassword().sendKeys("Suwathi@123");
		login.getLoginButton().click();
		
		driver.quit();
	}
	
	@Test
	public void fT_04()
	{
		//Verify by clicking on My Account
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 2000);
		action.scrollToElement(driver.findElement(By.xpath("//a[.='My account']"))).perform();
		driver.quit();
	}
	
	@Test
	public void fT_05()
	{
		//Verify by entering invalid username and invalid Password and click on Login button
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		SauceLoginPage login = new SauceLoginPage(driver);
		login.getusernameLink().sendKeys("suwathivelumani@gmail.com");
		login.getpasswordLink().sendKeys("Suwathi@16");
		login.getLoginButtton().click();
		driver.quit();
	}

	
	@Test
	public void fT_06() 
	{
	//Verify by entering valid username and valid Password and click on Login button
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		SauceLoginPage login = new SauceLoginPage(driver);
		login.getusernameLink().sendKeys("standard_user");
		login.getpasswordLink().sendKeys("secret_sauce");
		login.getLoginButtton().click();
		
		driver.quit();
	}
	
	@Test
	public void fT_07()
	{
		//Verify there is automationteststore link and click it 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://webdriveruniversity.com/index.html/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 2000);
		welcome.getautomationteststoreLink().click();
		driver.quit();
	}
	
	@Test
	public void fT_08()
	{
		//Verify by double clicking on Add to cart button
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		SauceLoginPage login = new SauceLoginPage(driver);
		login.getusernameLink().sendKeys("standard_user");
		login.getpasswordLink().sendKeys("secret_sauce");
		login.getLoginButtton().click();
		Actions action = new Actions(driver);
		action.doubleClick();
		driver.quit();
	}
	
	@Test
	public void fT_09()
	{
		//Verify by clicking ML Language in language settings and click on save changes and check the language has changed in HomePage

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		AmazonPage language = new AmazonPage(driver);
		language.getchooseLanguage().click();
		
		WebElement element = driver.findElement(By.xpath("//span[@dir='ltr']"));
		Select languageDropdown = new Select(element);
		languageDropdown.selectByIndex(5);
		
		language.getsavechanges().click();
		
		driver.quit();
		
	}
	
	@Test
	public void fT_10()
	{
		//Verify by clicking on Amazon devices in search dropdown and enter FireTV Stick and click the search button
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement element = driver.findElement(By.id("searchDropdownBox"));
		Select search = new Select(element);
		search.selectByValue("search-alias=amazon-devices");
		
		AmazonPage searchitem = new AmazonPage(driver);
		searchitem.getsearchtextfield().sendKeys("FireTvStick");
		searchitem.getsearchbutton().click();
		driver.quit();
		
		
	}
	
	@Test
	public void fT_11() throws AWTException
	{
		//Verify by clicking on Virtual keyboard and enter the credentials and Click on submit
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	
	@Test
	public void fT_12() 
	{
		//Verify by clicking on keyboard and enter the credentials and Click on submit
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		demoappsPage keyboard = new demoappsPage(driver);
		keyboard.getUITestingConceptsLink();
		keyboard.getkeyboardActions().click();
		keyboard.getkeyboard().click();
		Actions action = new Actions(driver);
		keyboard.getemail().click();
		action.keyDown(Keys.PAGE_DOWN).sendKeys("suwathivelumani@gmail.com").perform();
		keyboard.getpassword().click();
		action.keyDown(Keys.PAGE_DOWN).sendKeys("Suwathi@26").perform();
		keyboard.getconfirmPassword().click();
		action.keyDown(Keys.PAGE_DOWN).sendKeys("Suwathi@26").perform();
		keyboard.getsubmit().click();
		driver.quit();
	}
	
	@Test
	public void fT_13()
	{
		//Verify by clicking on progress bar in synchronisation and select disabled element and start the execution
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		demoappsPage synchronization = new demoappsPage(driver);
		synchronization.getUITestingConceptsLink().click();
		synchronization.getsynchronization().click();
		synchronization.getprogressBar().click();
		synchronization.getdisabledElement().click();
		synchronization.getsecondtext().sendKeys("3");
		synchronization.getstartButton().click();
		driver.quit();
		
	}
	
	@Test
	public void fT_14()
	{
		//Verify by clicking on Scroll and click on accept our policy
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		demoappsPage scroll = new demoappsPage(driver);
		scroll.getUITestingConceptsLink().click();
		scroll.getscroll().click();
		scroll.getscrollLink().click();
		scroll.getOpeninNewTabButton().click();
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 2000);
		scroll.getcheckbox().isSelected();
		scroll.getacceptPolicy().click();
		
		driver.quit();
		
	}
	
	@Test
	public void fT_15()
	{
		//Verify by clicking on Open modal in Multiple modal
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		demoappsPage modal = new demoappsPage(driver);
		modal.getUITestingConceptsLink().click();
		modal.getpopUpsLink().click();
		modal.getmodalLink().click();
		modal.getmultipleModalLink().click();
		modal.getopenModalButton().click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().dismiss();
		
		

	}
	
	@Test
	public void fT_16()
	{
		//Verify by trying to click on search button without entering any product name
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		
		demowebshopPage search = new demowebshopPage(driver);
		search.getsearchbutton().click();
		driver.switchTo().alert().accept();
		
		driver.quit();

	}
	
	
	
}
