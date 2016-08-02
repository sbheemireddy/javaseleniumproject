package org.java.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumMethods {
	private static final Cookie Cookie = null;
	static WebDriver driver = null;

	public static void main(String[] args) throws ParseException {

		dateFormat();
	}

	public static void firefoxDriver(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static void chromeDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\driver_exes\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static void openURL(){
		driver.get("http://www.google.com");
		driver.navigate().to("https://www.gmail.com");
		driver.findElement(By.linkText("Create account")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		//driver.close();
	}
	public static void WebDriverMethods(){
		System.out.println("Title : "+driver.getTitle());
		System.out.println("Current URL : "+driver.getCurrentUrl());
		driver.close();
	}
	public static void WebElementMethods(){
		WebElement webElement = driver.findElement(By.id("Email"));
		System.out.println(webElement.getAttribute("Name"));
		System.out.println(webElement.getTagName());
		System.out.println(webElement.getText());
		System.out.println(webElement.getSize());
		System.out.println(webElement.getCssValue("width"));
		webElement.sendKeys("abc");
		driver.findElement(By.id("next")).click();

	}
	public static void ActionsMethods(){

		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(By.id("Email")),"bcd");
		action.clickAndHold(driver.findElement(By.id("next"))).clickAndHold(driver.findElement(By.linkText("Create account"))).click().build().perform();
	}

	public static void windowsMethods(){
		driver.switchTo().defaultContent();
		driver.getWindowHandle();
		driver.getWindowHandles();
		driver.switchTo().frame(1);
		driver.switchTo().parentFrame();
	}
	public static void waitMethods(){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	}
	public static void AlertMethods(){
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("");
		alert.getText();
	}
	public static void cookiesMethods(){
		Cookie name = new Cookie("abc","123");
		driver.manage().addCookie(name);
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookie(name);
		driver.manage().getCookies();
		
	}
	public static void selectMethod(){
		WebDriver driver = new FirefoxDriver();
		WebElement ele = driver.findElement(By.xpath(""));
		
		Select sel = new Select(ele);
		sel.selectByIndex(1);
		sel.selectByValue("aaa");
		sel.selectByVisibleText("aaa");
		
	}
	public static void dateFormat() throws ParseException{
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(date);
		System.out.println(df.format(date));
		
		Date date2 = df.parse("2010/01/01");
		System.out.println(df.format(date2));
		
		if(date.before(date2)){
			System.out.println("before");
		}else{
			System.out.println("after");
		}
	}

}
