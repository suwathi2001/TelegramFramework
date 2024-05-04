package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import ObjectRepository.LogInPage;
import ObjectRepository.WelcomePage;

public class BaseClass extends UtilityMethods {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void login()
	{
		WelcomePage welcome = new WelcomePage(driver);
		
		LogInPage login = new LogInPage(driver);
		welcome.getLoginLink().click();
		
		login.getEmail().sendKeys("suwathivelumani@gmail.com");
		login.getPassword().sendKeys("Suwathi@26");
		
		login.getLoginButton().click();
		
		System.out.println("Before Method");	
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		System.out.println("After class");
		Thread.sleep(2000);
		driver.quit();
	}
	
	//@AfterMethod
	//public void logout()
	//{
	//	WelcomePage welcoome = new WelcomePage(driver);
	//	welcoome.getlogoutLink().click();
	//	System.out.println("After Method");
	//}
	}
