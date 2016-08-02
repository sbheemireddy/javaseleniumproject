package org.selenium.programs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridExample {

	//@Test
	public void testcase1() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver","D:\\Browsers_Drivers\\chromedriver.exe");
		URL url = new URL( "http", "localhost", 4444, "/wd/hub" );
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(url, capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//capability.setBrowserName("chrome");
		//capability.setPlatform(Platform.WINDOWS);
		driver.manage().window().maximize();
		driver.get("http://hotmail.com");
		Reporter.log("hotmail is opened");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@Parameters({ "browserType" })
	@Test
	public void testcase2(String browserType) throws MalformedURLException{
		URL url = new URL( "http", "localhost", 4444, "/wd/hub" );
		DesiredCapabilities capability = new DesiredCapabilities();
		
		if(browserType.equalsIgnoreCase("ie")){
			capability.setBrowserName("internet explorer");
			capability.setPlatform(Platform.WINDOWS);
			WebDriver driver = new RemoteWebDriver(url, capability);
			driver.manage().window().maximize();
			driver.get("http://fasurtech.com");
			Reporter.log("fasurtech page is opened");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.quit();
		}else{
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.WINDOWS);
			WebDriver driver = new RemoteWebDriver(url, capability);
			driver.manage().window().maximize();
			driver.get("http://gmail.com");
			Reporter.log("gmail page is opened");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.quit();
		}
	}
}
