package academies;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends  Base{
	
	public static Logger log=LogManager.getLogger(HomePage.class.getClass());
	@BeforeTest
	public void init() throws IOException {
		driver=initalizeDriver();
		String url="http://www.qaclickacademy.com/index.php";
		log.info("Get the URL and open the web");
		driver.get("http://www.qaclickacademy.com/index.php");
		
	}
	
	@Test
	public void basePageNavigation() throws IOException {
		driver=initalizeDriver();
		String url="http://www.qaclickacademy.com/index.php";
		
		System.out.println("Hiiiiii");
		System.out.println("Helloooooo");
		System.out.println("How are youuuu");
		System.out.println("Nice to meet you");
		System.out.println("Whats your name");
		System.out.println("This is boss");
		driver.get(url);
		driver.manage().window().maximize();
		LandingPage lp=new LandingPage(driver);
		log.debug("Click on the Login button");
		lp.getLogin().click();
		LoginPage lgp=new LoginPage(driver);
		log.debug("Enter the Username");
		lgp.getUsrnmae().sendKeys("username");
		log.debug("Enter the password");
		lgp.getPasword().sendKeys("password");
		log.debug("Click on login");
		lgp.Login().click();
		System.out.println("txt");
		log.info("SUccessfully Executed");
	}
	
	@DataProvider
	public Object[][] getData(String username,String password,String txt) {
		Object[][] data=new Object[1][3];
		
		data [0][0]="Praveen";
		data [0][1]="Patil";
		data[0][2]="HIIIIII";
		return data;
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
