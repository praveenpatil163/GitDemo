package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LoginPage extends Base {
	WebDriver driver;
	By username=By.cssSelector("input[id=\"user_email\"]");
	By password=By.cssSelector("input[id=\"user_password\"]");
	By lgn=By.cssSelector("input[value=\"Log In\"]");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getUsrnmae() {
		return driver.findElement(username);
	}
	
	public WebElement getPasword() {
		return driver.findElement(password);
	}
	
	public WebElement Login() {
		return driver.findElement(lgn);
	}

}
