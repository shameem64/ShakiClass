package LoginRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import LoginRegister.MainLogin;

public class Login extends MainLogin {
	
	WebElement LoginBtn = d.findElement(By.id("Button3"));
  @Test
  public void LoginToWeb() {
	  UserName.sendKeys("sylix");
	  Password.sendKeys("admin");
	  LoginBtn.click();
	  
  }
}
