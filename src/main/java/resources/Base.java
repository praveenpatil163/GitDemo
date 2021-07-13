package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver;
	Properties prop=new Properties();
	public WebDriver initalizeDriver() throws IOException {
		
		
		FileInputStream fis=new FileInputStream("D:\\MavenProject\\End2EndProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Java\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver,chrome.driver", "D:\\geckodriver.exe");
			 driver=new FirefoxDriver();
			
		}
		else if(browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver,chrome.driver", "D:\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
		
		
	}
	
	public void getScreenShotPath(String testCaseName) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\report\\"+testCaseName+".png";
		try {
			FileUtils.copyFile(source, new File(destinationFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
