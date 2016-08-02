package org.selenium.programs;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@Test(dataProvider="getBrowser")
	public void testcase1(String browser,String username,String pwd){
		WebDriver driver = null;
		if(browser.equals("mozilla")){
			driver = new FirefoxDriver();
		}else{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver_exes\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		System.out.println(browser + username);
		driver.quit();
		
	}
	
	@DataProvider
	public String[][] getBrowser(){
		
		String[][] data = new String[2][3];
		
		data[0][0] = "mozilla";
		data[0][1] = "username1";
		data[0][2] = "pwd1";
			
		data[1][0] = "chrome";
		data[1][1] = "username2";
		data[1][2] = "pwd2";
		
		return data;
		
	}
	@DataProvider(name="abc")
	public Integer[][] browserName(){
		Integer[][] data = new Integer[2][2];
		data[0][0] =1;
		data[0][1]=2;
		data[1][0]=3;
		data[1][1]=4;
		return data;
	}
	
	@Test(dataProvider = "abc")
	public void testcase1(Integer value1,Integer value2){
		System.out.println(value1 + value2);
	}
}
