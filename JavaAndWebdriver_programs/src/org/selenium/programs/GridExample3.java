package org.selenium.programs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridExample3 {

	@Parameters({ "browserType" })
	@Test
	public void testcase4(String browserType) throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver","D:\\Browsers_Drivers\\chromedriver.exe");
		URL url = new URL( "http", "localhost", 4444, "/wd/hub" );
		DesiredCapabilities capability =null;
		if(browserType.equalsIgnoreCase("chrome")){
			capability = DesiredCapabilities.chrome();
		}else if(browserType.equalsIgnoreCase("firefox")){
			capability = DesiredCapabilities.firefox();				 
		}else{
			capability = DesiredCapabilities.internetExplorer();
		}
		WebDriver driver = new RemoteWebDriver(url, capability);
		driver.manage().window().maximize();
		driver.get("http://yahoo.com");
		Reporter.log("Yahoo page is opened");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		driver.quit();
	}
	
	
}
