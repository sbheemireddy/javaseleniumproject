package org.selenium.programs;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class RemoteExecutionTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.ie.driver","D:\\Browsers_Drivers\\chromedriver.exe");
//		URL url = new URL( "http", "192.168.1.246", 4444, "/wd/hub" ); 
		URL url = new URL( "http", "192.168.1.19", 4444, "/wd/hub" );
		//Capabilities cap = new Capabilities();
		DesiredCapabilities capabilities =  DesiredCapabilities.firefox();
		//capabilities.setPlatform(org.openqa.selenium.Platform.MAC);
		//capabilities.setBrowserName("firefox");
		
		capabilities.setJavascriptEnabled(true);
		WebDriver driver = new RemoteWebDriver(url,capabilities);
		driver.get("http://www.yahoo.com");
		
//		String imagePath  = "E:\\abc.png";
//		WebDriver augmentedDriver = new Augmenter().augment(driver);
//		File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshot, new File("E:\\googlesearch-webdriverapi.png"));
//		driver.quit();
		
		
		//String imagePath  = GeneralUtils.getResultsFileLocation()+"\\screenshot\\" + imageName;
        //File scrFile = ((TakesScreenshot)com.fasur.lorica.framework.LoricaDriver.driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile,new File(imagePath));
		
	}

}
