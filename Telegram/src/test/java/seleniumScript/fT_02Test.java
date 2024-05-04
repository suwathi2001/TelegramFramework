package seleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fT_02Test {

	public static void main(String[] args) throws InterruptedException {
		//Verify by entering all the credentials in Register option and click Register button
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		//WebElement genderbutton = driver.findElement(By.linkText("Gender:"));
		//Select selectradiobutton = new Select(genderbutton);
		//selectradiobutton.selectByValue("Female");
		
		//driver.findElement(By.linkText("Female")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Suwathi");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Velumani");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("suwathi315@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Suwa@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Suwa@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
