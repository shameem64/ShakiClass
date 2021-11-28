package LoginRegister;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.asserts.SoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainLogin {	
	
	MainLogin()
	{
		System.setProperty("webdriver.chrome.driver", "sfsdfsfd");
	}
	
	WebDriver d = new ChromeDriver();
	WebElement UserName = d.findElement(By.id("txt_unam"));
	WebElement Password = d.findElement(By.id("txt_pass")); 
}
