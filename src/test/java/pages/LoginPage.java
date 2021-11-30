package pages;

import java.io.File;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {	
	
	LoginPage()
	{
		String DriverPath = new File("src/test/java/Resource/chromedriver.exe").getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", DriverPath);
	}
	
	WebDriver d = new ChromeDriver();
	WebElement UserName = d.findElement(By.id("txt_unam"));
	WebElement Password = d.findElement(By.id("txt_pass")); 
	WebElement LoginBtn = d.findElement(By.id("Button3"));
	
	public void Login(String URL)
	{
		d.get(URL);
		UserName.sendKeys("");
		Password.sendKeys("");
		LoginBtn.click();
	}
}
