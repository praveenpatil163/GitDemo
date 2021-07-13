package academies;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;
//WebDriver driver;
public class ValidateTitle extends Base {
public static Logger log=LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void init() throws IOException {
		driver=initalizeDriver();
		String url="http://www.qaclickacademy.com/index.php";
		log.info("Open the browser");
		driver.get(url);
		
	}
	
	@Test
	public void validateTitle() throws IOException {
		//WebDriver driver;
	/*	driver=initalizeDriver();
		String url="http://www.qaclickacademy.com/index.php";
		driver.get(prop.getProperty("URL"));*/
		//Creating object to that class to invoke that method.
		LandingPage lp=new LandingPage(driver);
		String actualTitle=lp.getTitile();
		log.info("Title opened");
		Assert.assertEquals(actualTitle, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
		log.info("Title is verified");
		boolean result=lp.Disply();
		Assert.assertTrue(result);
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
