package org.java.programs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Questions {

	public static void main(String[] args) {
		//browsers_types();
		//webdriver_wait();
		//elementNotFouncException();
		locators_types();
	}
	
	public static void browsers_types(){
		//firefox
		FirefoxDriver firefox = new FirefoxDriver();
		
		//chrome
		System.setProperty("webdriver.chrome.driver","D:\\eclipse-SDK-3.4.2-win32\\workspace\\Sample\\Drivers\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("http://www.google.com");
		
		//internet explorer
		System.setProperty("webdriver.ie.driver","D:\\eclipse-SDK-3.4.2-win32\\workspace\\Sample\\Drivers\\IEDriverServer_64.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();
		
		ie.get("http://www.google.com");
	}
	public static void webdriver_wait(){
		
		System.setProperty("webdriver.chrome.driver","D:\\eclipse-SDK-3.4.2-win32\\workspace\\Sample\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@title='More'])")).click();
		driver.close();
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,60);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Email")));
		element.sendKeys("abc");
		
	}
	public static void elementNotFouncException(){
	
		System.setProperty("webdriver.chrome.driver","D:\\eclipse-SDK-3.4.2-win32\\workspace\\Sample\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//div[@id='Email']")).click();
	}
	public static void locators_types(){
		System.setProperty("webdriver.chrome.driver","D:\\eclipse-SDK-3.4.2-win32\\workspace\\Sample\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		WebElement element =null;
		Actions action = new Actions(driver);
		driver.findElement(By.id("Email")).sendKeys("abcd");
		element = driver.findElement(By.name("Email"));
		element = driver.findElement(By.className("Email"));
		element = driver.findElement(By.tagName("input"));
		element = driver.findElement(By.linkText("abc"));
		element = driver.findElement(By.partialLinkText("abc"));
		element = driver.findElement(By.xpath("//input[@id='Email']"));
		element = driver.findElement(By.cssSelector("input [id='email]"));
		
		}
	@Test
	public void testNGAssertions(){
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertEquals("actual value","expected value");
		Assert.assertEquals("message","actual value","expected value");
		
	}

}
