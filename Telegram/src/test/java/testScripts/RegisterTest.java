package testScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;
import fileUtility.ExcelUtility;

public class RegisterTest {

	@DataProvider(parallel = true, name ="regdata")
	public String[][]registerData() throws IOException
	{
		return ExcelUtility.readExcelData("Sheet1");
	}
	
	@Test(dataProvider = "regdata")
	public void register_001(String firstName,String lastName, String email, String password, String confirmPassword)
	{
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WelcomePage welcome = new WelcomePage(driver);
	RegisterPage register= new RegisterPage(driver);
	
	welcome.getRegisterLink().click();
	register.getGenderButton().click();
	register.getFirstName().sendKeys(firstName);
	register.getLastName().sendKeys(lastName);
	register.getEmail().sendKeys(email);
	register.getConfirmPassword().sendKeys(confirmPassword);
	register.getRegisterButton().click();
	driver.quit();
	}
	}
		
	
		//@Test
		//public void register_001() {
			//WebDriver driver = new FirefoxDriver();
			//driver.manage().window().maximize();
			//driver.get("https://www.google.com/");
			//driver.quit();
		//}
		//@Test
		//public void register_002()
		//{
			//WebDriver driver = new FirefoxDriver();
		//	driver.manage().window().maximize();
			//driver.get("https://www.google.com/");
			//driver.quit();
		//}
//}
