package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ObjectRepository.BookPage;
import ObjectRepository.WelcomePage;
import genericLibrary.BaseClass;

public class BookTest {

	@Test(groups = "smoke,FT")
	public void books_001() 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcomePage = new WelcomePage(driver);
		BookPage bookPage = new BookPage(driver);
		System.out.println("smoke");
		//click on Books Link
		welcomePage.getBooksLink().click();
		
		//verify books page is displayed
		if(bookPage.getBooksTitle().getText().equals("Books"))
		{
			System.out.println("Test case Pass");
		}
		else
			System.out.println("Test case Fail");
		
		driver.quit();
		
	}
}
