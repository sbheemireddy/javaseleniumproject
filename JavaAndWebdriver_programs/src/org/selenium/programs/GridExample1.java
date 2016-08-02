package org.selenium.programs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GridExample1 {

	@Test
	public void testcase3() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver","D:\\Browsers_Drivers\\chromedriver.exe");
		URL url = new URL( "http", "localhost", 4444, "/wd/hub" );
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(url, capability);
		//capability.setBrowserName("chrome");
		//capability.setPlatform(Platform.WINDOWS);
		driver.manage().window().maximize();
		driver.get("http://google.com");
		Reporter.log("google is opened");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
	//@Test
	public void testcase4() throws MalformedURLException{
		URL url = new URL( "http", "localhost", 4444, "/wd/hub" );
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		WebDriver driver = new RemoteWebDriver(url, capability);
		driver.manage().window().maximize();
		driver.get("http://yahoo.com");
		Reporter.log("Yahoo page is opened");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
}
