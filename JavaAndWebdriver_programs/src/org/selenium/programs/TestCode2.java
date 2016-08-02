package org.selenium.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestCode2 {
	
	@Test
	public  void method1(){
		System.out.println("abc");
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.w3schools.com/cssref/css_selectors.asp");
		driver.close();
	}
//	@Test
	public  void method2(){
		System.out.println("bcd");
		System.setProperty("webdriver.ie.driver","D:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver =  new InternetExplorerDriver();
		driver.get("http://www.google.com");
		driver.close();
	}
//	@Test
	public  void method3(){
		System.out.println("abc");
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.yahoo.com");
		driver.close();
	}
//	@Test
	public  void method4(){
		System.out.println("bcd");
		System.setProperty("webdriver.ie.driver","D:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver =  new InternetExplorerDriver();
		driver.get("http://www.hotmail.com");
		driver.close();
	}
}
