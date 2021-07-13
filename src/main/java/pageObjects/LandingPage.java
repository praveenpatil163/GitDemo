package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LandingPage extends Base {
public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.xpath("//div[@class=\"text-center\"]//child::h2[1]//text()");
	By Prctbtn=By.cssSelector("a[href*='Practice']");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	
	public String getTitile() {
		return driver.getTitle();
	}
	
	public boolean Disply() {
		return driver.findElement(Prctbtn).isDisplayed();
	}

}
