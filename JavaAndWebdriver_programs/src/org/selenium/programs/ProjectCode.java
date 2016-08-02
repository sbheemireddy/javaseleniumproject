package org.selenium.programs;
/*package selenium.example;

import static org.testng.AssertJUnit.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.apache.xpath.compiler.Keywords;
import org.omg.SendingContext.RunTime;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.testng.Assert;

public class Program3 extends HtmlUnitDriver{

	////@Test
	public void seleniumBacked() throws InterruptedException { 
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("abc");
		String baseUrl = "http://www.google.co.in/";
		Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);
		selenium.open("http://www.google.com");
		selenium.type("q", "abc");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("bcd");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).clear();
		selenium.type("q", "xyz");
	}
	////@Test
	public void sampleTestCase(){
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Browsers_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Open firefox browser</br>");
		Reporter.log("Open google site</br>");
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium ide");
		driver.findElement(By.name("q")).submit();
		Reporter.log("search for selenium ide</br>");
		boolean value =true;
		value = driver.getPageSource().contains("Selenium IDE");
		
	}
	////@Test
	public void exaclyLogin()
	{
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://test.exacly.me/lc/home.seam");
		driver.findElement(By.linkText("Log In")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		System.out.println("result1------------"+wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='Email']"))));

		driver.findElement(By.xpath("//input[@title='Email']")).sendKeys("soujanya@exacly.me");
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("fasur@123");

		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		System.out.println("result2------------"+wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='popUpInput']/div[2]/a"))));


		System.out.println("login text :"+driver.findElement(By.xpath("//div[@class='popUpInput']/div[2]/a")).getText());
		System.out.println("by return value :"+By.xpath("//div[@class='popUpInput']/div[2]/a"));;
		System.out.println("find element return value :"+driver.findElement(By.xpath("//div[@class='popUpInput']/div[2]/a")));
		WebElement we =driver.findElement(By.xpath("//div[@class='popUpInput']/div[2]/a"));
		we.click();

		System.out.println("value:"+driver.findElement(By.xpath("//span[@class='productTitle']")).getText());
		driver.findElement(By.xpath("//span[@class='productTitle']")).click();
	}
	////@Test
	public void login(){

		//System.setProperty("webdriver.ie.driver","E:\\Browsers_Drivers\\IEDriverServer.exe");
		//WebDriver driver	=	new InternetExplorerDriver();
		//System.setProperty("webdriver.chrome.driver","E:\\Browsers_Drivers\\chromedriver.exe");
		//WebDriver driver	=	new ChromeDriver();
		//WebDriver driver = new SafariDriver();
		//FirefoxProfile fp = new FirefoxProfile();
		//fp.setPreference("webdriver.load.strategy", "unstable"); // As of 2.19. from 2.9 - 2.18 use 'fast'
		//WebDriver driver = new FirefoxDriver(fp);
		//WebDriver driver = new FirefoxDriver();
		//assumeTrue(isSupportedPlatform());
		//SafariDriver driver = new SafariDriver();

		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://ec2-54-200-251-85.us-west-2.compute.amazonaws.com/lc/home.seam");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//driver.navigate().to("/lc/home.seam");
		//driver.navigate().forward();

		//driver.navigate().to("http://ec2-54-200-251-85.us-west-2.compute.amazonaws.com/lc/home.seam");

		//System.out.println("text1:"+driver.findElement(By.linkText("Log In")).getText());
		//driver.findElement(By.linkText("Log In")).click();
		System.out.println("text2:"+driver.findElement(By.id("j_idt183:j_idt189")).getText());
		driver.findElement(By.id("j_idt183:j_idt189")).click();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		System.out.println("text name :"+driver.findElement(By.xpath("//*[@id='regForm0:regPopup_0']")).getText());
		WebElement element = driver.findElement(By.xpath("//*[@id='regForm0:regPopup_0']/div/div/div[2]/div[3]/div[2]/input"));
		//WebElement element = driver.findElement(By.xpath("//input[@title='Email']"));
		System.out.println("element"+element);
		element.sendKeys("may17@abc.com");
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//a[@class='green_btn small']")).click();
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//WebElement verify1 = driver.findElement(By.xpath("//*[@id='headerForm:j_idt60']/img"));
		//System.out.println("login "+verify1.getTagName());

	}
	////@Test
	public void gmailLogin() {

		// System.setProperty("webdriver.ie.driver",
		// "E:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean value =driver.getPageSource().contains("abc");
		String url = driver.getCurrentUrl();
		System.out.println("value-------------------"+value+"--"+url);

		WebElement username = driver.findElement(By.id("Email"));
		username.sendKeys("gfasur1@gmail.com");
		WebElement password = driver.findElement(By.id("Passwd"));
		WebElement signin = driver.findElement(By.id("signIn"));
		password.sendKeys("fasur@123");
		System.out.println("After sending keys");
		signin.click();

	}
	////@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver
		.get("https://medley-test04.isc-seo.upenn.edu/fastUnit/jsp/fast.do");
		WebElement userName = driver.findElement(By.id("pennkey"));
		userName.sendKeys("rsurabhi");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("sa!ram77");
		try {
			WebElement submit = driver.findElement(By
					.className("fastBlueButton"));
			submit.submit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		WebElement link1 = driver.findElement(By.linkText("ajax.jsp"));
		link1.click();
		WebElement type1 = driver.findElement(By.xpath("//form[@id='ajax1']/table/tbody/tr/td[3]/input"));
		type1.sendKeys("a");
		WebElement submit1 = driver.findElement(By
				.xpath("//form[@id='ajax1']/table/tbody/tr/td[3]/button"));
		submit1.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement ok1 = driver.findElement(By
				.xpath("//*[contains(@id,'alertWin')]/div[2]/button"));
		ok1.click();

		// WebElement radio1 =
		// driver.findElement(By.xpath("//form[@id='form8']/table/tbody/tr/td[3]/table[2]/tbody/tr/td/input"));
		// radio1.click();
		WebElement dropbox1 = driver.findElement(By
				.xpath("//form[@id='form13']/table/tbody/tr/td[4]/button[2]"));
		dropbox1.sendKeys("option2");
		driver.close();

		
		 * try { WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.alertIsPresent()); Alert alert =
		 * driver.switchTo().alert(); alert.accept(); } catch (Exception e)
		 * {e.printStackTrace(); //exception handling }
		 
	}
	////@Test
	public void demo() {
		// Create a new instance of the Firefox driver
		// Notice that the remainder of the code relies on the interface,
		// not the implementation.
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit Google
		driver
		.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
			// exception handling
		}

		// Alternatively the same thing can be done like this
		// driver.navigate().to("http://www.google.com");

		// Find the text input element by its name
		
		 * WebElement element = driver.findElement(By.name("q"));
		 * 
		 * // Enter something to search for element.sendKeys("Cheese!");
		 * 
		 * // Now submit the form. WebDriver will find the form for us from the
		 * element element.submit();
		 * 
		 * // Check the title of the page System.out.println("Page title is: " +
		 * driver.getTitle());
		 * 
		 * // Google's search is rendered dynamically with JavaScript. // Wait
		 * for the page to load, timeout after 10 seconds (new
		 * WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
		 * public Boolean apply(WebDriver d) { return
		 * d.getTitle().toLowerCase().startsWith("cheese!"); } });
		 * 
		 * // Should see: "cheese! - Google Search"
		 * System.out.println("Page title is: " + driver.getTitle());
		 * 
		 * //Close the browser driver.quit();
		 

	}
	////@Test
	public void download() {
		System.out.println("start of download method");
		FirefoxProfile f = new FirefoxProfile();

		
		 * goto firefox browser and type about.config to see the firefox default
		 * value for browser.download.folderList & set the value as 2
		 * browser.download.dir - specify the loc
		 * browser.helperApps.neverAsk.SaveToDisk as mime type of download file
		 * (Ex.pdf mime is aplication/mime)
		 

		f.setPreference("browser.download.folderList", 2);
		f.setPreference("browser.download.dir", "D:\\Downloads");
		f.setPreference("browser.helperApps.neverAsk.saveToDisk",
		"application/pdf");

		WebDriver driver = new FirefoxDriver(f);
		driver.get("http://www.scrumalliance.org/scrum_certification");

		// click Class Participation and Certification Statistics link
		driver.findElement(By.xpath("//*[@id='side_1']/h2[2]/a")).click();

		// Click on download link
		driver.findElement(By.xpath("//*[@id='body']/div/div[1]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, 300 
		 * timeout in
		 * seconds
		 );
		if (wait.until(ExpectedConditions.alertIsPresent()) == null)
			System.out.println("Alert is not present");
		else
			System.out.println("Alert is present");
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		System.out.println("end of download method");
	}
	////@Test
	public void search() throws Exception {
		int i = 1;
		WebDriver driver = new FirefoxDriver();
		// driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@class='gbqfif']")).sendKeys(
		"Tottenham court road");
		driver.findElement(By.xpath("//input[@class='gbqfif']")).sendKeys(
				Keys.ENTER);
		Thread.sleep(2000l);

		while (i > 0) {
			List<WebElement> searchResultList = driver.findElements(By
					.xpath("//ol[@id='rso']/li"));
			for (int j = 0; j < searchResultList.size(); j++) {
				boolean value = searchResultList
				.get(j)
				.findElement(By.tagName("a"))
				.getText()
				.contains(
						"Tottenham Court Road Direct - the best prices in the UK");
				System.out.println(value
						+ "-"
						+ searchResultList.get(j).findElement(By.tagName("a"))
						.getText());
				if (value) {
					searchResultList.get(j).findElement(By.tagName("a"))
					.click();
					System.out.println("Pass");
					break;
				}
			}
			System.out.println(i
					+ "-----"
					+ driver.findElement(By.xpath("//a[@id='pnnext']/span"))
					.isDisplayed());
			if (driver.findElement(By.xpath("//a[@id='pnnext']/span"))
					.isDisplayed()) {
				driver.findElement(By.xpath("//a[@id='pnnext']/span")).click();

			} else {
				System.out.println("Link not Found");
			}
			Thread.sleep(2000l);
			i = i + 1;
		}
	}
	////@Test
	public void expectedConditions() {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms05.htm");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		if (wait
				.until(ExpectedConditions
						.visibilityOfElementLocated(By
								.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input"))) == null)
			System.out.println("Element is present");
		else
			System.out.println("Element is not present");
		driver.close();
	}
	////@Test
	public void verifyText() {
		//System.setProperty("webdriver.safari.driver","C:\\Program Files\\Safari\\safari.exe");
		System.setProperty("webdriver.ie.driver","E:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver	=	new InternetExplorerDriver();
		//System.setProperty("webdriver.chrome.driver","E:\\Browsers_Drivers\\chromedriver.exe");
		//WebDriver driver	=	new ChromeDriver();
		//WebDriver driver = new SafariDriver();
		//FirefoxProfile fp = new FirefoxProfile();
		//fp.setPreference("webdriver.load.strategy", "unstable"); // As of 2.19. from 2.9 - 2.18 use 'fast'
		//WebDriver driver = new FirefoxDriver(fp);
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//html/body/div[1]/div[3]/div[1]/div[1]/div[3]/div/div/div/form/fieldset[2]/div/div/div/table/tbody/tr/td[2]")).sendKeys("selenium");

		Reporter.log("image is verified");
		Reporter.log("image is verified1<br/>");
		Reporter.log("image is verified2<br/>");
		Reporter.log("image is verified3<br/>");

	}
	public static void getRemote(String remote) throws MalformedURLException {
		
			 if (remote.equalsIgnoreCase("ie")) {
			  if (CommonFunctions.is64Bit()) {
			   File _file = new File("Drivers/IEDriverServer_64.exe");
			   System.setProperty("webdriver.ie.driver", _file
			     .getAbsolutePath());
			   URL url = new URL( "http", "192.168.1.143", 4444, "/wd/hub" );
			   
			   DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			   capabilities.setBrowserName("ie");
			   
			   capabilities.setJavascriptEnabled(true);
			   _driver = new RemoteWebDriver(url,capabilities);
			   capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			   _driver = new InternetExplorerDriver();
			  } else {
			   File _file = new File("Drivers/IEDriverServer_32.exe");
			   System.setProperty("webdriver.ie.driver", _file
			     .getAbsolutePath());
			   URL url = new URL( "http", "192.168.1.143", 4444, "/wd/hub" );
			   DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			   capabilities.setBrowserName("ie");
			   
			   capabilities.setJavascriptEnabled(true);
			   _driver = new RemoteWebDriver(url,capabilities);
			   capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			   _driver = new InternetExplorerDriver();
			   _driver.manage().window().maximize();
			  }
			 } else if (remote.equalsIgnoreCase("chrome")) {
			  File _file = new File("Drivers/chromedriver.exe");
			  System.setProperty("webdriver.chrome.driver", _file
			    .getAbsolutePath());
			  URL url = new URL( "http", "192.168.1.143", 4444, "/wd/hub" );
			  DesiredCapabilities desiredCapabilities= DesiredCapabilities.chrome();
			  
			  desiredCapabilities.setBrowserName("chrome");
			  
			  desiredCapabilities.setJavascriptEnabled(true);
			  _driver= new RemoteWebDriver(url,desiredCapabilities);
			  
			  ChromeOptions options=new ChromeOptions();
			  desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
			  _driver = new ChromeDriver();
			  _driver.manage().window().maximize();
			 } else if (remote.equalsIgnoreCase("firefox")) {
			  URL url = new URL( "http", "192.168.1.143", 4444, "/wd/hub" );
			  _driver = new FirefoxDriver();
			  _driver.manage().window().maximize();
			 } else {
			  System.err.println(remote.toUpperCase()
			    + " is not supported in framework");
			  System.exit(o);
			 }
			}
	}
	////@Test
	public void alert() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://weblogin.pennkey.upenn.edu/login");
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

		//isElementExists(driver,"//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input",1);
		//driver.findElement(	By.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20 
		 * timeout in
		 * seconds
															 );
		if (wait.until(ExpectedConditions.alertIsPresent()) == null)
			System.out.println("Alert is not present");
		else
			System.out.println("Alert is present");
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}
	////@Test
	public void click() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement element =  driver.findElement(By.name("q"));
		element.sendKeys("selenium");
		
		driver.get("http://www.echoecho.com/htmlforms14.htm");
		isElementExists(
				driver,
				"//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input",
				1);
		driver
				.findElement(
						By
								.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input"))
				.click();
		 
	}
	////@Test
	public void inputText() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms05.htm");
		isElementExists(
				driver,
				"//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input",
				1);
		driver
		.findElement(
				By
				.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input"))
				.sendKeys("sai");

	}
	////@Test
	public void radioButton() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		isElementExists(driver,"//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input[2]",1);
		System.out.println(driver.findElement(By.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input[2]")).isSelected());
		driver.findElement(By.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input[2]")).click();
		System.out.println(driver.findElement(By.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input[2]")).isSelected());


	}
	////@Test
	public void checkBox() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		System.out.println(driver.findElement(By.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input[2]"))	.isSelected());
		driver
		.findElement(
				By
				.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input[2]"))
				.click();
		System.out
		.println(driver
				.findElement(
						By
						.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input[2]"))
						.isSelected());
	}
	////@Test
	public void dropDownSelection() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		// driver.findElement(By.xpath("//*[@id='submitBTN']")).click();
		WebElement ele = driver.findElement(By.cssSelector("select"));
		Select droplist = new Select(ele);
		//droplist.deselectByValue("Milk");
		droplist.selectByValue("Milk1");

		
		 * WebElement select = driver.findElement(By.name("dropdownmenu"));
		 * List<WebElement> options = select.findElements(By.tagName("option"));
		 * for (WebElement option : options) {
		 * if("Milk".equals(option.getText())) option.click(); }
		 

	}
	////@Test
	public void select(){
		WebDriver driver = new FirefoxDriver();
		Select droplist = new Select(driver.findElement(By.id("selection")));   
		droplist.selectByVisibleText("Germany");
		WebDriverWait wait = null;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		ExpectedConditions.visibilityOfElementLocated(By.id(""));
		
	}
	
	////@Test
	public boolean isElementExists(WebDriver driver, String obj, int value) {
		switch (value) {
		case 1:
			if (driver.findElements(By.className(obj)).size() > 0) {
				return true;
			}
		case 2:
			if (driver.findElements(By.cssSelector(obj)).size() > 0) {
				return true;
			}
		case 3:
			if (driver.findElements(By.id(obj)).size() > 0) {
				return true;
			}
		case 4:
			if (driver.findElements(By.linkText(obj)).size() > 0) {
				return true;
			}
		case 5:
			if (driver.findElements(By.name(obj)).size() > 0) {
				return true;
			}
		case 6:
			if (driver.findElements(By.partialLinkText(obj)).size() > 0) {
				return true;
			}
		case 7:
			if (driver.findElements(By.tagName(obj)).size() > 0) {
				return true;
			}
		case 8:
			if (driver.findElements(By.xpath(obj)).size() > 0) {
				return true;
			}

		}
		return false;

	}
	////@Test
	public void isDisplayed()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bbc.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).isDisplayed());
		}
	}
	@Test
	public void isDisplayed1(){
		System.out.println("isDisplayed1");
		System.setProperty("webdriver.chrome.driver","D:\\Browsers_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Selenium/Test.html");
		System.out.println("value : "+driver.findElement(By.id("abc1")).isSelected());
		WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement element = null;
		 try{element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("abc1")));}catch(Exception e){e.printStackTrace();}
		 
		System.out.println("value1 : "+element );
		//element.sendKeys("abc");
		driver.quit();
	}
	////@Test
	public void highlightTest() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver
		.get("https://medley-test04.isc-seo.upenn.edu/fastUnit/jsp/fast.do");
		WebElement userName = driver.findElement(By.id("pennkey"));
		Thread.sleep(10000);
		highlightElement(userName, driver);
		userName.sendKeys("ipod nano");
		WebElement password = driver.findElement(By.id("password"));
		highlightElement(password, driver);
		password.sendKeys("sa!ram77");

		// String searchHeader =
		// driver.findElement(By.cssSelector("H1")).getText().toLowerCase();
		// Assert.assertTrue(searchHeader.contains("ipod nano"));
	}
	////@Test
	public void highlightElement(WebElement element, WebDriver driver)
	throws InterruptedException {
		for (int i = 0; i < 2; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element,"color: green; border: 10px solid red;");
			js.executeScript(
					"arguments[0].setAttribute('style', arguments[1]);",
					element, "");
		}
	}
	////@Test
	public void tabsAndPopups() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dev.exacly.me/lc");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("About")).click();
		driver.findElement(By.xpath("//html/body/div[8]/div[3]/a[1]/i"));
		Set<String> windowIds = driver.getWindowHandles();
		windowIds.add("abcd");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Iterator<String> itr = windowIds.iterator();
		String mainWindow = itr.next();
		System.out.println(mainWindow.toString());
		String popupWindow = itr.next();
		System.out.println("main window:"+mainWindow);
		System.out.println("second window :"+popupWindow);

		driver.switchTo().window(popupWindow);
		driver.close();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(mainWindow);

		System.out.println("main title: "+driver.getTitle());
		driver.quit();


		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> itr = windowIds.iterator();
		String mainWindowId = itr.next();
		String tabbedWindowId = itr.next();
		driver.switchTo().window(tabbedWindowId);
		driver.close();
		driver.switchTo().window(mainWindowId);
		driver.close();//close the current window
		driver.quit();//close all windows

	}
	////@Test
	public void keyboardKeys(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys(
				Keys.ADD);
	}
	////@Test
	public void downloadFiles() {
		FirefoxProfile profile = new FirefoxProfile();

		profile.setPreference("browser.download.folderList", 2);

		profile.setPreference("browser.download.dir", "E:\\download");
		profile
		.setPreference(
				"browser.helperApps.neverAsk.saveToDisk",
		"application/msword,application/x-rar-compressed,application/octet-stream,application/csv,text/csv");

		WebDriver driver = new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://qtpselenium.com/test/testdownload.php");
		driver.findElement(By.xpath("html/body/a[1]")).click();
		driver.findElement(By.xpath("html/body/a[2]")).click();
		driver.findElement(By.xpath("html/body/a[3]")).click();
	}
	////@Test
	public void Front_and_Back_Button() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.gmail.com");
		driver.get("http://www.yahoo.com");
		Thread.sleep(5000L);
		driver.navigate().back();
		Thread.sleep(5000L);
		driver.navigate().forward();
		Thread.sleep(5000L);
		driver.quit();
	}
	////@Test
	public void ListenerTest() throws InterruptedException {
		WebDriver web_driver = new FirefoxDriver();
		EventFiringWebDriver driver = new EventFiringWebDriver(web_driver);
		// MyListener myListener = new MyListener();
		// driver.register(myListener);
		// MyListener class example is given below
		
		 * public class MyListener extends AbstractWebDriverEventListener{
		 * 
		 * 
		 * public void afterNavigateBack(WebDriver driver) {
		 * System.out.println("clicked browser back button"); } public void
		 * afterNavigateForward(WebDriver driver) {
		 * System.out.println("clicked browser front button"); } }
		 
		driver.navigate().to("http://www.gmail.com");
		driver.get("http://www.yahoo.com");
		Thread.sleep(5000L);
		// back button
		System.out.println("Going to click back button");
		driver.navigate().back();
		System.out.println("Clicking back button");
		Thread.sleep(5000L);
		driver.navigate().forward();
		Thread.sleep(5000L);
		driver.quit();
	}
	////@Test
	public void testImplicitlyWait() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("http://www.google.com");
		driver.findElement(By.id("Email")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("bcd");				
	}
	////@Test
	public void button()
	{
		//click, get the text
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.mail.yahoo.com");
		String str = driver.findElement(By.xpath("//*[@id='.save']")).getText();
		System.out.println(str);

	}
	////@Test
	public void textField()
	{
		//write , read and clear
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		List<WebElement> textfields = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		textfields.get(0).sendKeys("one1");
		System.out.println(textfields.get(0).getAttribute("value"));
		System.out.println(textfields.get(1).getAttribute("value"));
		Assert.assertEquals("one1",textfields.get(0).getAttribute("value"));
		//textfields.get(0).clear();
		System.out.println(textfields.size());
		//sendKeys("abc")
		//getAttribute("value");
		//clear();
	}
	////@Test
	public void link() throws InterruptedException, ClientProtocolException, IOException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ec2-54-201-97-223.us-west-2.compute.amazonaws.com/lc/home.seam");
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		Thread.sleep(20000);
		WebElement element =driver.findElement(By.xpath("//div[@class='masonry_item__toolbox']/div/div[2]/a"));
		System.out.println("text-----------"+element.getText());
		String linkSource = element.getAttribute("onClick");
		String [] linkSource1=linkSource.split(",");
		System.out.println(linkSource1[1]);
		String [] linkSource2=linkSource1[1].split("'");
		System.out.println(linkSource2[1]);
		int res_code = Request.Get(linkSource2[1]).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("res code :"+res_code);


	}
	////@Test
	public void links()
	{
		//click , get the text
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bbc.com");
		//driver.findElement(By.xpath("//a[text()='Asia News']")).click();

		//WebElement links= driver.findElement(By.xpath("//*[@id='news_moreTopStories']"));
		List<WebElement> allLinks = driver.findElements(By.tagName("img"));
		System.out.println(allLinks.size());
		for(int i =0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getAttribute("src"));
			//allLinks.get(i).click();
			//driver.get("http://www.bbc.com");
			//links= driver.findElement(By.xpath("//*[@id='news_moreTopStories']"));
			//allLinks = links.findElements(By.tagName("a"));
		}

	}
	////@Test
	public void scrol() throws InterruptedException
	{
		WebDriver d = new FirefoxDriver();
		d.get("http://test.exacly.me/lc");
		d.manage().timeouts().implicitlyWait(60,TimeUnit.MINUTES);
		for(int i =0;i<10;i++){
			((JavascriptExecutor)d).executeScript("window.scrollBy(0,8500)");
			Thread.sleep(10000);
			System.out.println(i);
		}
	}
	////@Test
	public void Images() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.bbc.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		List<WebElement> allLinks = driver.findElements(By.tagName("img"));
		System.out.println(allLinks.size());
		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getAttribute("src"));
			Thread.sleep(2000);
		}
		//JavascriptExecutor jsx = (JavascriptExecutor)driver;
		//String status = (String) jsx.executeScript("return STARTED");
		//jsx.executeScript("window.scrollBy(0,50)", "");
	}
	////@Test
	public void image() throws ClientProtocolException, IOException{
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		driver.get("http://ec2-54-201-97-223.us-west-2.compute.amazonaws.com/lc/home.seam");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//div[@class='item_image_contaner']/img"));

		String imageSource = element.getAttribute("src");
		System.out.println("image source : "+imageSource);
		if(imageSource.contains("http://"))
		{
			System.out.println("image source : "+imageSource);
			//String abc = "http://st.kadoo.com/44184827-eaf/direct1/F1GaMxRsfiuJbsw245x184.png";
			int res_code = Request.Get(imageSource).execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println("res code :"+res_code);
		}
		else
		{
			System.out.println("image doesnot contain http://"+driver.getCurrentUrl());

		}
		System.out.println("url"+driver.getCurrentUrl());
		String str[] = driver.getCurrentUrl().split("lc");
		String abc="images/Female_profile_icon.jpg" ;
		String imageSource1 = str[0]+"lc/"+abc ;
		System.out.println(imageSource1);
		int res_code = Request.Get(imageSource1).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("res code :"+res_code);

	}
	////@Test
	public void Links() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.test.exacly.me/lc");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
			Thread.sleep(5000);
		}

	}
	////@Test
	public void responseCode() throws ClientProtocolException, IOException //throws ClientProtocolException, IOException
	{
		String Url ="http://static.bbci.co.uk/frameworks/barlesque/2.58.1/desktop/3.5/img/blq-blocks_grey_alpha1.png";
		//try{
		int res_code = Request.Get(Url).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println(res_code);
		//}catch(Exception e){
		//System.out.println("exception occur");

		//}

	}
	////@Test
	public void dropDownList() throws InterruptedException
	{
		// select, find total ,print ,
		WebDriver driver =new FirefoxDriver();
		//driver.get("http://se:newyear@qa.exacly.me/lc/home.seam");
		driver.get("http://se:newyear@qa.exacly.me/lc/home.seam");
		Thread.sleep(10000);
		//WebElement element = driver.findElement(By.name("xyz"));
		//List<WebElement> dropListValues1 = element.findElements(By.tagName("option"));
		Thread.sleep(40000);
		WebElement dropList = driver.findElement(By.xpath("//select[@id='settingsForm:ageRange']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropList);
		System.out.println("display:" +dropList.isDisplayed());
		System.out.println("enable:"+dropList.isEnabled());
		System.out.println("select:"+dropList.isSelected());
		//Select select = new Select(element);
		//select.selectByValue("25");
		List<WebElement> dropListValues = dropList.findElements(By.tagName("option"));
		System.out.println("size:"+dropListValues.size());
		for(int i =1 ; i < dropListValues.size() ; i++)
		{
			System.out.println(dropListValues.get(i).getText());
		}
		((JavascriptExecutor)driver).executeScript("scroll(0,350);");
		//driver.quit();


		driver.get("http://www.echoecho.com/toolcustomforms.htm");
		WebElement dropList = driver.findElement(By.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/form/table[3]/tbody/tr/td/b/font/select"));
		dropList.sendKeys("Sample 2");
		WebElement ele = driver.findElement(By.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/form/table[3]/tbody/tr/td/b/font/input[1]"));
		//ele.clear();
		ele.sendKeys("hello");
		List<WebElement> dropListValues = dropList.findElements(By.tagName("option"));
		//dropListValues.get(40).click();
		System.out.println(dropListValues.size());

		//other way of selection
		//Select select = new Select(dropList);
		//select.selectByValue("18");
		//driver.get("http://www.hdfcbank.com");
		//driver.findElement(By.xpath("//*[@id='hometab1']/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='hometab1']/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		 	
	}
	////@Test
	public void screenShot() throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.com");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile,new File("E:\\image1.jpg"));

	}
	////@Test
	public void explicitWait()
	{
		//WebDriverWait ,FluentWait

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);

		driver.get("http://www.yahoo.com");
		driver.findElement(By.xpath("//*[@id='pa-u_14782488-bd']/a/span[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		System.out.println("after explicit wait");

		driver.get("http://www.echoecho.com/javascript7.htm");
		//driver.findElement(By.xpath("//html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/div/form/input")).click();

		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
		.withTimeout(30, TimeUnit.SECONDS)
		.pollingEvery(5, TimeUnit.SECONDS);
		//.ignoring(TimeoutException.class);

		fWait.ignoring(NoAlertPresentException.class ,TimeoutException.class ).until(ExpectedConditions.alertIsPresent());
		System.out.println("after fluentWait method");

		//System.out.println("value :"+wait.until(ExpectedConditions.alertIsPresent()));
		//wait.until(ExpectedConditions.alertIsPresent());

		//Alert alert = driver.switchTo().alert();
		//alert.accept();
	}
	////@Test
	public void certificateErrorHandle()
	{
		FirefoxProfile fp = new FirefoxProfile();
		fp.setAcceptUntrustedCertificates(true);
		fp.setAssumeUntrustedCertificateIssuer(false);

		//for ie browser.we should write after the action
		//driver.navigate().to("javascript:document.getElementById('overridelink').click()");
	}
	////@Test
	public void firefoxProfile() throws InterruptedException{

		WebDriver driver = null;
		FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\sbheemireddy\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\amyr00tu.Srikanth"));
		driver = new FirefoxDriver(profile);
		driver.get("http://192.168.172.212:9090/AlertEnterprise");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		Thread.sleep(100000);
		//WebDriverWait wait = new WebDriverWait(driver, 60000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div")));


	}
	////@Test
	public void uploadfile() throws InterruptedException{

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/sbheemireddy/Desktop/sample.html");
		Thread.sleep(10000);
		//sh_avatar_input
		WebElement uploadImg = driver.findElement(By.xpath("//*[@id='abc']"));

		System.out.println("debug1 : "+ uploadImg);
		Thread.sleep(10000);
		//uploadImg.click();
		uploadImg.sendKeys("E:\\test.jpg");
		//driver.findElement(By.xpath("//*[@id='settingsForm:settingsPopupPanel']/div/div[3]/div[2]/div[4]/div[2]/div[1]")).sendKeys("C:\\Users\\sbheemireddy\\Desktop\\test.png");

	}
	////@Test
	public void prompt()
	{
		//WebDriver driver =  new FirefoxDriver();
		WebDriver driver = null;
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.http.phishy-userpass-length", 255);
		profile.setPreference("network.automatic-ntlm-auth.trusted-uris", "qa.exacly.me");
		driver = new FirefoxDriver(profile);
		driver.get("http://se:newyear@qa.exacly.me/lc"); 
		//driver.get("http://www.qa.exacly.me/lc");
		//Alert alert = driver.switchTo().alert();
		//System.out.println(alert.getText());
	}
	////@Test
	public void findPeopleToFollow() throws InterruptedException{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://se:newyear@qa.exacly.me/lc/home.seam");
		Thread.sleep(50000);
		//driver.findElement(By.partialLinkText("Find People to Follow")).click();

	}
	////@Test
	public void scrollDown() throws InterruptedException
	{
		//FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver","E:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver	=	new InternetExplorerDriver();
		//driver.get("http://www.incometaxindia.gov.in/home.asp");
		driver.get("http://192.168.172.141:8080/AlertEnterprise/");
		driver.manage().window().maximize();
		Thread.sleep(60000);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		System.out.println("size :"+driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).size()-1);
		//WebElement element = driver.findElement(By.cssSelector("input[value='New']"));
		//WebElement element = driver.findElement(By.cssSelector("input[name='policyName']"));
		//WebElement element =  driver.findElement(By.linkText("PAN"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",element);
		//((JavascriptExecutor)driver).executeScript("scroll(0,750);");

		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		System.out.println("eroor msg size:"+driver.findElements(By.cssSelector("span[class='feedbackPanelERROR']")).size());
		if((driver.findElements(By.cssSelector("span[class='feedbackPanelERROR']")).size()>0)){
			System.out.println(driver.findElement(By.cssSelector("span[class='feedbackPanelERROR']")).getText());
		}
		else{
			System.out.println("element is not found");
		}

		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		Point loc = element.getLocation();
		int yLoc = loc.y;
		int xLoc =loc.x;
		System.out.println("Height = " + height);
		System.out.println("XLocation = "+xLoc);
		System.out.println("YLocation = "+yLoc);

		//((JavascriptExecutor)driver).executeScript("scrollBy(0,400)");
		//if(yLoc >= (height-300))
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);

		yLoc=yLoc-100;
		//element = driver.findElement(By.cssSelector("input[name='priority']"));
		//loc = element.getLocation();
		driver.switchTo().defaultContent();
		((JavascriptExecutor)driver).executeScript("scrollTo("+xLoc+","+yLoc+")");
		//((JavascriptExecutor)driver).executeScript("scrollBy(0,400)");
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).size()-1);
		Thread.sleep(5000);
		element.sendKeys("abc");
		Thread.sleep(5000);
		 
		//Thread.sleep(20000);
		System.out.println("pause");
		//((JavascriptExecutor)driver).executeScript("scrollTo("+xLoc+","+yLoc+")");
		if(yLoc > (height)){
			//int newScroll = yLoc - (height + 20);
			yLoc=(yLoc-height)+200;
			//((JavascriptExecutor)driver).executeScript("scroll(0,"+yLoc+");");

			System.out.println("------------------------------------------------"+yLoc);
		}
		System.out.println("last statement");
	}
	////@Test
	public void testCode() throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://se:newyear@qa.exacly.me/lc/home.seam");
		WebDriverWait wait = new WebDriverWait(driver,60);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		//System.out.println("value:"+((JavascriptExecutor) driver).executeScript("alert('hello world');"));
		//((JavascriptExecutor) driver).executeScript("alert('hello world');");
		//Thread.sleep(20000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Log In")));
		driver.findElement(By.partialLinkText("Log In")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("regForm0:email0")));
		driver.findElement(By.id("regForm0:email0")).sendKeys("may17@abc.com");
		driver.findElement(By.id("regForm0:password0")).sendKeys("password");
		driver.findElement(By.xpath("//div[@class='popUpBut']/a")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myDashboardForm:personalArea']/div[1]/a[1]")));
		//driver.findElement(By.xpath("//div[@class='tn__avatar']")).click();
		//driver.findElement(By.xpath("//div[@class='tn__user_menu']/a[1]")).click();

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='settingsForm:settingsPopupPanel']/div/div[3]/div[2]/div[4]/div[2]/div[1]")));
		Thread.sleep(20000);
		WebElement element1 = driver.findElement(By.xpath("//*[@id='masonry_container']/div[2]/div[5]/div[2]/div/div[1]"));
		//*[@id='masonry_container']/div[1]/div[5]/div[2]/div/div[1]
		new Actions(driver).moveToElement(element1).perform();
		WebElement element = driver.findElement(By.xpath("//*[@id='masonry_container']/div[2]/div[5]/div[2]/div/div[1]/div[1]/div/div/div[1]/i/span"));
		element.click();

		//WebElement e = driver.findElement(By.xpath("//*[@id='settingsForm:settingsPopupPanel']/div/div[3]/div[2]/div[4]/div[2]/div[1]"));
		//e.sendKeys("E:\\test.jpg");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		System.out.println("Before get Resource");
		URL jqueryUrl = Resources.getResource("/lc/javax.faces.resource/jquery.js.seam?ln=script");
		System.out.println("after get Resource");
		String jqueryText = "";
		try{
			System.out.println("Before tostring");
		 jqueryText = Resources.toString(jqueryUrl, Charsets.UTF_8);
		 System.out.println("after to string");
		}catch(Exception e){System.out.println(e);}
		jse.executeScript(jqueryText);
		jse.executeScript("jQuery('#sh_avatar_input').click();");
		 

		//System.out.println("value-before:"+driver.getPageSource().contains("Thank you for taking the time to provide your feedback."));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("feedBackForm:msgBody")));
		//driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		//Thread.sleep(30000);

		//driver.findElement(By.id("feedBackForm:msgBody")).sendKeys("hello");
		//System.out.println("value:"+driver.getPageSource().contains("Thank you for taking the time to provide your feedback1."));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dashboardNavigation']/a[3]")));
		//driver.findElement(By.xpath("//div[@id='dashboardNavigation']/a[3]")).click();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myDashboardForm:personalArea']/div[1]/a[1]")));
		//System.out.println("value:"+driver.getPageSource().contains("Activate Badge"));
		//Thread.sleep(30000);
		//System.out.println("Before execution time:"+new Date());
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='lifestyleBadges']/div[3]/ul/li[15]/div")));
		//System.out.println("after execution time:"+new Date());
		//WebElement element = driver.findElement(By.xpath("//*[@id='lifestyleBadges']/div[3]/ul/li[15]/div"));
		//((JavascriptExecutor)driver).executeScript("scroll(0,150);");
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		//Thread.sleep(500);
		//element.click();


	}
	////@Test
	public void testAttribute(){

		System.setProperty("webdriver.ie.driver","E:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://se:newyear@prodqa.exacly.me/lc/home.seam");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http://prodqa.exacly.me/lc/home.seam");
		driver.findElement(By.linkText("Log In")).click();
	}
	////@Test
	public void popup(){
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");

		String win = driver.getWindowHandle();
		System.out.println("single window:"+win);
		Set<String> windows =  driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String mainwindow =  itr.next();
		String secondwindow =  itr.next();

		System.out.println(mainwindow);
		System.out.println(secondwindow);
		driver.switchTo().window(secondwindow);
		driver.close();

	}
	////@Test
	public void frames(){

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("http://commonfloor.com");
		List <WebElement> framesList = driver.findElements(By.xpath("//iframe"));

		for(int i=1 ; i <framesList.size() ;i++)
		{
			System.out.println(i+"--"+framesList.get(i).getAttribute("id"));
			System.out.println(i+"--"+framesList.get(i).getAttribute("name"));
		}
		//driver.switchTo().frame("twttrHubFrame");
		System.out.println(driver.getTitle());
		WebElement ele = driver.findElement(By.id("twttrHubFrame"));
		driver.switchTo().frame(ele);
		System.out.println(driver.getTitle());
		driver.close();

		driver.get("http://timesofindia.indiatimes.com/");
		//driver.switchTo().frame("pollsdv");
		//driver.findElement(By.xpath("//*[@id='mathuserans2']")).sendKeys("abc");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("size"+frames.size());

		for(int i=1;i<frames.size();i++)
		{
			System.out.println(frames.get(i).getAttribute("name"));
		}
	}
	////@Test
	public void ajax_auto_suggest(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(20,	TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.id("q")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id='gsr']/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/table/tbody/tr/td[1]")).click();
	}
	////@Test
	public void waitTest(){

		WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/Users/sbheemireddy/Desktop/Results.html");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("abc")));
		System.out.println("after exception");
	}
	////@Test
	public void httpunitTest(){

		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://timesofindia.indiatimes.com/");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("size"+frames.size());

		for(int i=1;i<frames.size();i++)
		{
			System.out.println(frames.get(i).getAttribute("name"));
		}
	}
	////@Test
	public void testByClass(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		method1(driver,By.id("Email"));


	}
	////@Test
	public void method1(WebDriver driver,By by){
		driver.findElement(by);
	}
	@Parameters ({"browser"})
	//(dataProvider="getData")
	////@Test
	public void gridTest(String par1,String par2,String par3) throws MalformedURLException{
		DesiredCapabilities cap = null;
		if(par3.equals("firefox")){
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}else if(par3.equals("chrome")){
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}

		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);

		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		driver.quit();
	}
	@DataProvider(parallel=true)
	public Object[][] getData(){
		Object data[][] = new Object[2][3];

		data[0][0] = "a1";
		data[0][1] = "a2";
		data[0][2] = "firefox";
		data[1][0] = "b1";
		data[1][1] = "b2";
		data[1][2] = "chrome";

		return data;

	}
	////@Test
	public void gridTest1() throws MalformedURLException{
		DesiredCapabilities cap = null;

		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		driver.quit();
	}
	////@Test
	public void gridTest2() throws MalformedURLException{
		DesiredCapabilities cap = null;

		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);

		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.quit();
	}	
	////@Test
	public void mouseOver() throws InterruptedException{

		WebDriver driver = new SafariDriver();
		driver.get("http://www.fasurtech.com/");
		WebDriverWait wait = new WebDriverWait(driver,30);
		Thread.sleep(20000);
		WebElement element = driver.findElement(By.cssSelector("a[title='Fasur Technologies']"));

		try
		{
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(mouseOverScript, element);
		}
		catch (Exception e)
		{
			e.printStackTrace();

		}
		new Actions(driver).moveToElement(element).build().perform();
	}
	////@Test
	public void hashMap(){

		HashMap<String,String> hm1 =  new HashMap<String, String>();
		String badge = "active retire";
		String badgeDesc = "this is active retire description1";
		hm1.put("active retire","this is active retire description");
		hm1.put("yoga guru", "this is yoga guru description");


		if(hm1.get(badge).equalsIgnoreCase(badgeDesc)){
			System.out.println("badge description is matched");
		}else {
			System.out.println("badge description is not matched");
		}
		System.out.println();

	}
	////@Test
	public void mouseOverTestInSafari(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://fasurtech.com");
		System.out.println(driver.findElement(By.xpath("//*[@id='ja-header']/div/div/h1/a")).getAttribute("name"));

	}
	////@Test
	public void alertLogin() throws InterruptedException, IOException{
		System.setProperty("webdriver.ie.driver","E:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		Selenium selenium = new WebDriverBackedSelenium(driver, "http://192.168.172.134:8080/AlertEnterprise/");
		driver = ((WrapsDriver) selenium).getWrappedDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://192.168.172.134:8080/AlertEnterprise/");
		driver.findElement(By.name("signinpod:userName")).sendKeys("admin");
		driver.findElement(By.name("signinpod:password")).sendKeys("System@123");
		driver.findElement(By.name("signinpod:logIn")).click();
		Thread.sleep(20000);
		 
		driver.get("http://google.com");
		Thread.sleep(10000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new File("E:\\googlesearch-webdriverapi.png"));

		//Thread.sleep(90000);
		//driver.switchTo().defaultContent();
		//WebElement ele = driver.findElement(By.cssSelector("html a[class='sf-with-ul']"));
		//ele.click();
		//Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		//driver.switchTo().activeElement();
		//ele.click();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("document.getElementById('banner_signout').click();");
		//Thread.sleep(2000);
		//WebElement ele1 = driver.findElement(By.cssSelector("html span[id=banner_signout]>a"));
		//selenium.click("banner_signout");
		//System.out.println("value:"+ele1.isDisplayed());
		//new Actions(driver).moveToElement(ele1).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("html span[id=banner_signout]>a")));


		//driver.findElement(By.cssSelector("html span[id=banner_signout]>a")).sendKeys(Keys.ENTER);

		//((JavascriptExecutor)driver).executeScript("$('span.banner_signout112').click();");

	}
	////@Test
	public  void switchToFrame() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://192.168.172.134:8080/AlertEnterprise");
		//driver.get("http://www.easymoviesindia.com/");
		driver.get("file:///C:/Users/sbheemireddy/Desktop/frame/mainframe1.html");
		//Thread.sleep(20000);

		Set<String> windowIds = driver.getWindowHandles();
		List<WebElement> frameset=driver.findElements(By.tagName("frame"));
		List<WebElement> iframeset=driver.findElements(By.tagName("iframe"));
		System.out.println("framesize:"+frameset.size());
		System.out.println("iframesize:"+iframeset.size());
		System.out.println("windowsize:"+windowIds.size());
		int i=0;
		//String str= frameset.get(i).getAttribute("name");
		for(; i<frameset.size() ; i++)
     {
    	 System.out.println("frame name:"+frameset.get(i).getAttribute("name"));
    	 System.out.println("frame :"+frameset.get(i).getTagName());
    	 System.out.println("frame id:"+frameset.get(i).getAttribute("id"));
    	 System.out.println("frame location:"+frameset.get(i).getLocation());
    	 System.out.println("frame size:"+frameset.get(i).getSize());
    	 System.out.println("------------------------");
     }
		//System.out.println("frame name :"+str);
		//driver.get("http:google.com");


		//driver.switchTo().frame(2);
		//driver.switchTo().frame(1);
		//driver.switchTo().defaultContent();
		//driver.switchTo().frame(0);
		for(int ii = 0;ii<10;ii++){
			try{
				System.out.println("check point1:try block");
				System.out.println("size : "+driver.findElements(By.tagName("frame")).size());
				driver.switchTo().frame((driver.findElements(By.tagName("frame")).size())-5);
				driver.findElement(By.name("abcd")).sendKeys("sai");
				//driver.switchTo().frame(str);
				break;
			}catch(Exception e){
				System.out.println("Waiting for frame...");
				Thread.sleep(2000);
			}
		}
		System.out.println("check point 2");
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName("iframe")));

		System.out.println("checkpoint 3");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.name("abcd")).sendKeys("sai");
		//driver.switchTo().defaultContent();
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(str));
		//System.out.println("checkpoint 2");
		//System.out.println("1-isDisplayed:"+(driver.findElements(By.xpath("//select[@id='CitySelect']")).size()>0));


		//System.out.println("1-isDisplayed:"+(driver.findElements(By.xpath("//select[@id='CitySelect']")).size()>0));
		//System.out.println(driver.findElement(By.xpath("//select[@id='CitySelect']")));
		//Select a = new Select(driver.findElement(By.xpath("//select[@id='CitySelect']")));
		//a.selectByIndex(1);
		//a. selectByValue("Hyderabad");

		//driver.findElement(By.xpath("//select[@id='CitySelect']")).sendKeys("Hydera");

		if(frameset.size()>=0)
     {
         for (WebElement framename :frameset)
         {
        	 int i = 0;
             System.out.println("frame name:" + framename.getAttribute("name"));
             System.out.println("frame id:" + framename.getAttribute("id"));
             //driver.switchTo().frame(framename);
             driver.switchTo().frame(i);
             i++ ;
         }
     }
		//driver.findElement(By.xpath("//*[@id='Table1']/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("abc");
	}
	////@Test
	public void checkServerResponse() throws ClientProtocolException, IOException
	{
		String url = "http://st.kadoo.com/82106594-cd5/direct/OiWie7WnJTMGVLT505x5051.JPEG";

		int res_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println(res_code);
	}
	////@Test
	public void checkBrowser() throws InterruptedException{
		//System.setProperty("webdriver.ie.driver", "E:\\Browsers_Drivers\\IEDriverServer.exe");

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,60);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://ebay.com");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gh-eb-My']/a")));
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("document.getElementById('banner_signout').click();");
		Actions action = new Actions(driver);
		action.pause(10000);
		action = action.moveToElement(driver.findElement(By.xpath("//*[@id='gh-eb-My']/a")));
		action.perform();
		action.pause(3000);
		action.release();
		action.pause(3000);
		action.perform();
		action.pause(3000);
		driver.findElement(By.cssSelector("div[id='gh-top']>ul:nth-child(2) a[class='gh-eb-oa thrd']")).click();
		System.out.println(driver.getCurrentUrl());
	}
	////@Test
	public void mouseOverOnSafari(){
		WebDriver driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("http://se:newyear@qa.exacly.me");
		WebElement element = driver.findElement(By.xpath("//div[@class='allBadges']/ul/li[3]/div"));
		System.out.println(onMouseOver(driver,By.xpath("//div[@class='allBadges']/ul/li[3]/div")));
		//System.out.println(onMouseRelease(driver,element));

	}
	public boolean onMouseOver(WebDriver driver , By by)
	{
		boolean result = false;
		try
		{
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(mouseOverScript, driver.findElement(by));
			Thread.sleep(10000);
			result = true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	////@Test
	public boolean onMouseRelease(WebDriver driver , WebElement element)
	{
		boolean result = false;
		try
		{
			String mouseOverScript1 = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseout', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseout');}";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(mouseOverScript1, element);
			result = true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	public  static HashMap hp = new HashMap();
	public void  hashData(){
		hp.put("a","apple");
	}
	public void method1(int a,float b){

	}
	////@Test
	public void testRegularExpression() throws InterruptedException{
		hp.put("abc","aaa");
		hashData();
		System.out.println("before : :"+hp.get("a"));
		String actual = "ldqqq";
		String expectedRegex = "[^abc]*";

		assertTrue(actual.matches(expectedRegex));


		WebDriver driver = new SafariDriver();
	   driver.get("http://facebook.com");
	   Thread.sleep(20000);
	   driver.manage().deleteAllCookies();
	   DesiredCapabilities desiredCapabilities = DesiredCapabilities.safari();
	   SafariOptions safariOptions = new SafariOptions();
	   safariOptions.setUseCleanSession(true);

	   desiredCapabilities.setCapability(SafariOptions.CAPABILITY, safariOptions);
	   driver.get("http://facebook.com");
		 
	}
	////@Test
	public void testIdsinExacly() throws InterruptedException{

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		driver.get("http://se:newyear@prod.exacly.me/lc/");
		Thread.sleep(30000);
		((JavascriptExecutor)driver).executeScript("scroll(0,750);");
		Thread.sleep(20000);
		((JavascriptExecutor)driver).executeScript("scroll(0,750);");
		Thread.sleep(20000);
		((JavascriptExecutor)driver).executeScript("scroll(0,750);");
		Thread.sleep(20000);
		((JavascriptExecutor)driver).executeScript("scroll(0,750);");
		Thread.sleep(20000);
		((JavascriptExecutor)driver).executeScript("scroll(0,750);");
		Thread.sleep(20000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		List<String> productList = new ArrayList<String>();
		int j=0;

		for(int i =0; i<list.size();i++){
			String temp1 = list.get(i).getAttribute("onclick");
			//System.out.println(i+"="+temp1);
			if(temp1 != null){
				if(temp1.contains("EItemType")){
					String temp2[] = temp1.split("itemId:");
					String temp3[]=temp2[1].split(",");
					System.out.println(++j+"--"+temp3[0]);
					productList.add(temp3[0]);
				}
			}
		}
		Set<String> unique = new HashSet<String>();
		List<String> duplicates = new ArrayList<String>();
		for( String n : productList ) {
			if( !unique.add( n ) ) {
				duplicates.add( n );
			}
		}

		System.out.println("duplicate size"+duplicates.size());
		driver.quit();
	}
	////@Test
	public void test1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Browsers_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		Thread.sleep(30000);
		System.out.println(driver.getCurrentUrl());



		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object obj=  js.executeScript("window.alert(document.cookie)");

		Thread.sleep(10000);
		System.out.println("cookies : "+obj);
		String allcookies = (String) obj;
		String[] cookiearray  = allcookies.split(";");

		// Now take key value pair out of this array
		for(int i=0; i<cookiearray.length; i++){
			String name = cookiearray[i].split("=")[0];
			String value = cookiearray[i].split("=")[1];
			System.out.println("befor-Key is : " + name + " and Value is : " + value);
			try{
				js.executeScript("document.cookie = "+ name +" \" =; Max-Age=0\";\"");
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println("Key is : " + name + " and Value is : " + value);
		}
		Thread.sleep(10000);
		driver.navigate().to("http://facebook.com");
		 try{
		   //js.executeScript("alert('abc')");
	   //js.executeScript("var now = new Date(); document.cookie = \"expires=\"+now.toUTCString()+\";\"");
		   js.executeScript("var now = new Date(); document.cookie = \"name=\"+now.toUTCString()+\";\"");
	   }catch(Exception e){
		   System.out.println(e);
	   } 
		//js.executeScript("window.alert(document.cookie)");
		// driver.get("http://gmail.com");
		try{
	   driver.navigate().refresh();
	   driver.get("http://gmail.com");
	   }catch(Exception e){
		   System.out.println("exception:"+e);
	   }
	}
	////@Test
	public void testGoogle() throws InterruptedException{
		String actual ="[/$/.\\d+]*";
		String str = "$34.98";
		System.out.println(str.matches(actual));
		WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("selenium");
	//driver.quit();



	String actual ="regexp=[\\W+\\w+]*";
	//String expected=" DVD Color: Color Rating: Not Rated Genre: TV Series Runtime: 220 Year: 2010 Release Date: 2010-01-26";
	String arrayValue[] = actual.split("p=");
	System.out.println(arrayValue[1]);

	String expected="a2134sfd vgfg #$#@@@#$1daassss";
	assertTrue(expected.matches(arrayValue[1]));

		//long time1 = new Date().getTime();
		//System.out.println("Time in milliseconds: " + time1);

		//Thread.sleep(6000);

		//long time2 = new Date().getTime();
		//System.out.println("Time in milliseconds: " + time2);
		//long timeDifference = time2 - time1 ;

		//System.out.println("Time in milliseconds: " + timeDifference);


		//Calendar lCDateTime = Calendar.getInstance();
		//System.out.println("Calender - Time in milliseconds :" + lCDateTime.getTimeInMillis());
	}
	////@Test
	public void grab() throws ClientProtocolException, IOException, InterruptedException{

		WebDriver driver = new FirefoxDriver();
		if(driver.findElements(By.xpath("")).size()>0){}

		driver.get("http://google.com");
		Thread.sleep(10000);
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> itr = windowIds.iterator();
		String mainWindow = itr.next();
		System.out.println("main window:"+mainWindow);
		System.out.println(mainWindow.toString());

		String popupWindow = itr.next();

		System.out.println("second window :"+popupWindow);
		//driver.switchTo().window(popupWindow);
		String temp = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		int res_code = Request.Get(temp).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("response code:"+res_code);
	}
	////@Test
	public void checkboxSelectForAlert() throws InterruptedException{
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver","E:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://192.168.172.141:8080/AlertEnterprise/");
		//driver.get("file:///C:/Users/sbheemireddy/Desktop/frame/checkbox.html");
		Thread.sleep(40000);
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).size()-1);
		List<WebElement> list = driver.findElements(By.tagName("td"));
		String chkStatus = "Y";
		String chkLabel = "AlarmGenerated";//User Id";//checkbox6-1
		System.out.println("list size:"+list.size());
		for(int i=0;i<list.size() ;i++){
			if(list.get(i).findElements(By.cssSelector("span>label")).size() > 0){
				List<WebElement> list1 = list.get(i).findElements(By.cssSelector("span"));
				List<WebElement> list2 = list1.get(0).findElements(By.cssSelector("label"));
				List<WebElement> list3 = list1.get(0).findElements(By.cssSelector("input"));
				for(int j=0;(j<list2.size()&&j<list3.size());j++){					
					if(chkLabel.equalsIgnoreCase(list2.get(j).getText())){
						if(chkStatus.equalsIgnoreCase("Y")){
							if(!list3.get(j).isSelected()){
								list3.get(j).click();
								break;
							}
						}else{
							if(list3.get(j).isSelected()){
								list3.get(j).click();
								break;
							}
						}
					}
				}
			}
			if(list.get(i).findElements(By.cssSelector("span")).size()>0&&list.get(i).findElements(By.cssSelector("input")).size()>0){
				if(chkLabel.equalsIgnoreCase(list.get(i).findElement(By.cssSelector("span")).getText())){
					if(chkStatus.equalsIgnoreCase("Y")){
						if(!list.get(i).findElement(By.cssSelector("input")).isSelected()){
							list.get(i).findElement(By.cssSelector("input")).click();
							break;
						}
					}else{
						if(list.get(i).findElement(By.cssSelector("input")).isSelected()){
							list.get(i).findElement(By.cssSelector("input")).click();
							break;
						}
					}
				}

			}
		}
		list = driver.findElements(By.tagName("tr"));
		System.out.println("tr list : "+list.size());
		for(int i=0;i<list.size() ;i++){
			if(list.get(i).findElements(By.cssSelector("td>span")).size()>0&&list.get(i).findElements(By.cssSelector("td>input")).size()>0){
				System.out.println(i+":label : "+list.get(i).findElement(By.cssSelector("td>span")).getText());
				if(chkLabel.equalsIgnoreCase(list.get(i).findElement(By.cssSelector("td>span")).getText().trim())){
					System.out.println("i am in first if");
					if(chkStatus.equalsIgnoreCase("Y")){
						if(!list.get(i).findElement(By.cssSelector("td>input")).isSelected()){
							System.out.println("i am in second if");
							list.get(i).findElement(By.cssSelector("td>input")).click();
							break;
						}
					}else{
						if(list.get(i).findElement(By.cssSelector("td>input")).isSelected()){
							System.out.println("i am in third else");
							list.get(i).findElement(By.cssSelector("td>input")).click();
							break;
						}
					}
				}

			}
		}

		//driver.quit();
	}
	////@Test
	public void javaScriptTest() throws InterruptedException{

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/sbheemireddy/Desktop/table.html");
		Thread.sleep(5000);
		String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		String elementDimen = "var elem =document.getElementById('button11');return elem.offsetHeight+':'+elem.offsetWidth";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String temp = (String)js.executeScript(elementDimen);
		System.out.println(temp);
		String[] value = temp.split(":");
		System.out.println(value[0]+value[1]+value[2]);
		//String height=value[0]
		((JavascriptExecutor)driver).executeScript("scroll("+value[0]+","+value[1]+");");
		//((JavascriptExecutor)driver).executeScript("scroll(200,700);");

	}
	////@Test
	public void time() throws InterruptedException{
		long lDateTime1 = new Date().getTime();
		Thread.sleep(1000);
		long lDateTime2 = new Date().getTime();
		System.out.println(lDateTime2-lDateTime1);

	}
	////@Test
	public void exceptionTest() throws InterruptedException{

		System.setProperty("webdriver.ie.driver","E:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver	=	new InternetExplorerDriver();
		driver.get("http://192.168.172.141:8080/AlertEnterprise");
		Thread.sleep(90000);
		System.out.println("size:"+driver.findElements(By.name("abc")).size());
		String str="";
		String[] str1=str.split("\\|");
		System.out.println(str.equalsIgnoreCase(""));
		System.out.println("length:"+str1.length);
		try{

		}catch(Exception e){
			System.out.println("main try");
			System.out.println(e.toString());
		}
	}
	public void exceptionTest1() throws Exception{
		try{
			for(int j=0;j<6;j++){
				System.out.println(j);
				if(j ==5){
					j=j/0;
				}

			}
		}
		catch(Exception e){throw new ArithmeticException("throws catch from exceptonTest1");

		}
	}
	////@Test
	public void batFileExecution(){
		try{  
			System.out.println(" am at process");
			Process p = Runtime.getRuntime().exec("C:\\Users\\sbheemireddy\\Desktop\\ieKill.bat");
			p.waitFor();
			System.out.println(" am at process");

		}catch( Exception ex ){
			ex.printStackTrace();
		}

	}
	////@Test
	public void pageRefresh() throws InterruptedException{

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/sbheemireddy/Desktop/pageRefresh.html");

		Select element = new Select(driver.findElement(By.name("select1")));

		element.selectByIndex(1);
		driver.get("file:///C:/Users/sbheemireddy/Desktop/table1.html");
		Thread.sleep(6000);
		driver.get("file:///C:/Users/sbheemireddy/Desktop/pageRefresh.html");
		Thread.sleep(6000);
		element = new Select(driver.findElement(By.name("select1")));

		element.selectByIndex(2);

	}
	////@Test
	public static void keyboardKeys() throws InterruptedException{

		System.setProperty("webdriver.ie.driver","E:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver	=	new InternetExplorerDriver();

		driver.get("http://192.168.172.141:8080/AlertEnterprise");

		//Actions action = new Actions(driver);
		//action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(text), null);
		//element.sendKeys(Keys.CONTROL + "v");
		System.out.println("before pause");
		Thread.sleep(70000);
		System.out.println("after pause");
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).size()-1);
		//action.moveToElement(element1).click().build().perform();
		WebElement element =driver.findElement(By.name("parameterPanel:parameter:3:optionCol:optionDropDownOrText:passwordForm:optionPwdField"));
		WebElement element1 =driver.findElement(By.name("parameterPanel:parameter:8:optionCol:optionDropDownOrText:passwordForm:optionPwdField"));
		Actions action = new Actions(driver);
		CharSequence password1 = "Alert1234";
		Thread.sleep(5000);
		CharSequence password2 = "U29sdXNBZG1pbg==";
		action.sendKeys(element, password1).build().perform();
		action.sendKeys(element1, password2).build().perform();

		//element1.click();
	}
	////@Test
	public void imageUpload() throws InterruptedException, AWTException{

		WebDriver driver = new FirefoxDriver();
		//driver.get("http://se:newyear@qa.exacly.me/lc/");
		driver.get("http://google.com");
		String text="C:\\Users\\sbheemireddy\\Desktop\\test.png";
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(text), null);
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("css=div[class='sh__third_column']>div")).click();
		//Set<String> windowIds = driver.getWindowHandles();
		//setClipboardData("C:\\Users\\Demo\\Desktop\\today.txt");
		//native key strokes for CTRL, V and ENTER keys

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		text="selenium";
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(text), null);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		System.gc();


	}

	////@Test
	public void leftNavigation() throws InterruptedException{
		//System.setProperty("webdriver.ie.driver","E:\\Browsers_Drivers\\IEDriverServer.exe");
		//WebDriver driver	=	new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Browsers_Drivers\\chromedriver.exe");
		WebDriver driver	=	new ChromeDriver();
		String mpath = "Manual Configuration>Systems>Systems";
		String[] path = new String[3];
		path[0]="";
		path[1]="";
		path[2]="";
		String[] mpath1 =mpath.split(">");
		if(mpath1.length == 1){
			path[0]=mpath1[0];
		}else if(mpath1.length == 2){
			path[0]=mpath1[0];
			path[1]=mpath1[1];
		}else if(mpath1.length == 3){
			path[0]=mpath1[0];
			path[1]=mpath1[1];
			path[2]=mpath1[2];
		}
		driver.get("http://192.168.172.141:8080/AlertEnterprise");
		Thread.sleep(60000);
		boolean flag =false;
		List<WebElement> mainList = driver.findElements(By.cssSelector("div[class='leftmenu fabric_comp_tree']>div>ul>li"));
		List<WebElement> mainList1 = driver.findElements(By.cssSelector("div[class='leftmenu fabric_comp_tree']>div>ul>li>span"));
		List<WebElement> secondList = null;
		List<WebElement> secondList1 = null; 
		List<WebElement> secondList2 = null;
		List<WebElement> thirdList = null;
		if(!path[0].equalsIgnoreCase("")){
			for(int i=0;i<mainList.size();i++){
				scrollToView(driver,mainList1.get(i));
				Thread.sleep(500);
				if(mainList1.get(i).getAttribute("data-exp") != null){
					if(mainList1.get(i).getAttribute("data-exp").equalsIgnoreCase("true")){
						mainList1.get(i).click();
					}
				}
				if(path[0].equalsIgnoreCase(mainList.get(i).getText())){
					if(mpath1.length == 1){
						Thread.sleep(1000);
						mainList.get(i).click();
						secondList = driver.findElements(By.cssSelector("div[class='leftmenu fabric_comp_tree']>div>ul>li:nth-child("+(i+1)+")>ul>li"));
						break;
					}
					Thread.sleep(2000);
					mainList.get(i).click();
					secondList = driver.findElements(By.cssSelector("div[class='leftmenu fabric_comp_tree']>div>ul>li:nth-child("+(i+1)+")>ul>li"));
					secondList1 = driver.findElements(By.cssSelector("div[class='leftmenu fabric_comp_tree']>div>ul>li:nth-child("+(i+1)+")>ul>li>span"));
					secondList2 = driver.findElements(By.cssSelector("div[class='leftmenu fabric_comp_tree']>div>ul>li:nth-child("+(i+1)+")>ul>li>a"));
					break;
				}	
			}
			if((secondList.size()>0)&& !path[1].equalsIgnoreCase("")){
				for(int j=0;j< secondList.size();j++){
					scrollToView(driver,secondList1.get(j));
					if(secondList1.get(j).getAttribute("data-exp") != null){
						if(secondList1.get(j).getAttribute("data-exp").equalsIgnoreCase("true"))
						{
							Thread.sleep(2000);
							secondList1.get(j).click();
						}}
					if(path[1].equalsIgnoreCase(secondList.get(j).getText())){
						if(mpath1.length == 2){
							Thread.sleep(1000);
							secondList2.get(j).click();
							break;
						}else{
							thirdList = secondList.get(j).findElements(By.cssSelector("li>a"));
							if(thirdList.size() == 1){
								Thread.sleep(1000);
								secondList2.get(j).click();
								break;
							}
							Thread.sleep(1000);
							secondList1.get(j).click();
							for(int k=1;k<thirdList.size();k++){
								if(!path[2].equalsIgnoreCase("")){
									if(path[2].equalsIgnoreCase(thirdList.get(k).getText())){
										scrollToView(driver,thirdList.get(k));
										Thread.sleep(1000);
										thirdList.get(k).click();
										flag =true;
										break;
									}
								}
							}
						}		
					}
					if(flag)break;
				}
			}

		}	


	}
	public static void scrollToView(WebDriver driver,WebElement element) throws InterruptedException{
		Dimension dim = driver.manage().window().getSize();
		Point loc = element.getLocation();
		int yLoc = loc.y;
		int xLoc = loc.x;
		yLoc = yLoc - 200;
		((JavascriptExecutor)driver).executeScript("scrollTo(" + xLoc+ "," + yLoc + ")");

	}

	////@Test
	public void topNavigation() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","E:\\Browsers_Drivers\\chromedriver.exe");
		WebDriver driver	=	new ChromeDriver();
		driver.get("http://192.168.172.141:8080/AlertEnterprise");
		Thread.sleep(40000);
		String path = "";
		List<WebElement> mainList = driver.findElements(By.cssSelector("div[id='tabmenu']>div>ul>li"));
		List<WebElement> mainList1 = driver.findElements(By.cssSelector("div[id='tabmenu']>div>ul>li>a"));
		if(!path.equalsIgnoreCase("")){
			for(int i=0;i<mainList.size();i++){
				scrollToView(driver, mainList.get(i));
				if(mainList.get(i).isDisplayed()){
					if(path.equalsIgnoreCase(mainList.get(i).getText())){
						mainList.get(i).click();
						i=mainList.size();
					}
				}else{
					mainList.get(i-1).click();
					for(;i<mainList.size();i++){
						if(path.equalsIgnoreCase(mainList.get(i).getText())){
							mainList1.get(i-2).click();
							i=mainList.size();
						}
					}
				}
			}
		}	
	}
	////@Test
	public void dimensionsTest() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/sbheemireddy/Desktop/frame/checkbox.html");
		driver.manage().window().maximize();
		
	Thread.sleep(20000);
	WebElement element = driver.findElement(By.id("checkbox4"));
	Point poi = element.getLocation();
	Dimension dim  = driver.manage().window().getSize();
	//Point dim1 = driver.manage().window().getPosition();
	int xloc = dim.height;
	int yloc = dim.width;
	System.out.println("dim :"+dim);
	System.out.println("dim-x-y :"+xloc+":"+yloc);
	System.out.println("poi :"+poi);

	int xLoc = poi.x;
	int yLoc = poi.y;
	JavascriptExecutor je = (JavascriptExecutor)driver ;
	je.executeScript("scrollTo(" + xLoc+ "," + yLoc + ")");
		 
		WebElement element = driver.findElement(By.id("checkbox4"));
		WebElement element1 = driver.findElement(By.linkText("Visit"));
		WebElement element11 = driver.findElement(By.id("checkbox444"));
		WebElement element2 = driver.findElement(By.id("button1"));
		Point poi = element.getLocation();
		System.out.println("element width:"+poi.getX());
		System.out.println("element height:"+poi.getY());
		java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		System.out.println("screen width:"+width);
		System.out.println("screen height:"+height);
		driver.manage().window().maximize();
		Dimension dim  = driver.manage().window().getSize();
		System.out.println("browser width:"+dim.width);
		System.out.println("browser height:"+dim.height);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Object w = js.executeScript("return window.innerWidth;");
		Object h = js.executeScript("return window.innerHeight;");
		System.out.println("document width:"+w);
		System.out.println("document height:"+h);
		System.out.println("isDisplayed:"+element.isDisplayed());
		if(poi.getY()+100>dim.height){
			//((JavascriptExecutor)driver).executeScript("scrollTo(" + poi.getX()+ "," + (poi.getY()-200) + ")");
		}	
		System.out.println("isDisplayed:"+element.isDisplayed());
		DesiredCapabilities dc = new DesiredCapabilities();
		System.out.println(dc.getBrowserName()+":"+dc.getVersion()+":"+dc.firefox());
		WebDriverWait wait = new WebDriverWait(driver,30);
		for(int i =1 ;i<5;i++){
			System.out.println("visibility : "+wait.until(ExpectedConditions.visibilityOf(element)));
			System.out.println("Clickable  : "+wait.until(ExpectedConditions.elementToBeClickable(element)));
			element.click();
			Thread.sleep(3000);
			element2.click();
			Thread.sleep(3000);
			element1.click();
			element11.click();
			Thread.sleep(3000);
		}
	}
	////@Test
	public void testAlertTreeStructureCode() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/sbheemireddy/Desktop/frame/A%20Tree%20from%20HTML%20Lists.htm");
		driver.findElement(By.id("Folder1")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("checkbox4")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Folder1")).click();
	}
	public static WebDriver _driver = null;
	public static WebDriverWait wait = null;
	public static int frameFlag =0;
	////@Test
	public static void takeActionMain(){

	}
	public static boolean takeaction(String methodName,By target,String value,String selectType) throws Exception{
		WebElement element = null;
		_driver = new FirefoxDriver();
		wait = new WebDriverWait(_driver,60);
		try{
			isElementExists(target);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		try{
			if(methodName.equalsIgnoreCase("click")){
				element = _driver.findElement(target);
				scrollToView(element);
				element.click();
			}else if(methodName.equalsIgnoreCase("clickAndWait")){
				element = _driver.findElement(target);
				scrollToView(element);
				element.click();
				Thread.sleep(5000);
			}else if(methodName.equalsIgnoreCase("checkboxClick")){
				element = _driver.findElement(target);
				scrollToView(element);
				if(selectType.equalsIgnoreCase("Y")){
					if(!element.isSelected())
						element.click();
				}else{
					if(element.isSelected())
						element.click();
				}
			}else if(methodName.equalsIgnoreCase("sendKeys")){
				element = _driver.findElement(target);
				scrollToView(element);
				element.clear();
				element.sendKeys(value);
			}else if(methodName.equalsIgnoreCase("select")){
				element = _driver.findElement(target);
				scrollToView(element);
				Select option = new Select(element);
				option.selectByValue(value);
			}else if(methodName.equalsIgnoreCase("multiSelect")){
				element = _driver.findElement(target);
				scrollToView(element);
				Select droplist = new Select(element);
				String[] listValues = value.split("\\|");
				for (int i = 0; i < listValues.length; i++){
					try{				
						droplist.selectByVisibleText(listValues[i]);
					}catch(Exception e){
						System.out.println("Exception in multiselect method");
						return false;
					}
				}
			}
		}catch(Exception e){
			return false;
		}
		return true;
	}
	public static void isElementExists(By target) throws Exception{
		try{
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(target));
		}catch(Exception e){
			throw new Exception("Element not found");
		}
	}
	public static void scrollToView(WebElement element) throws InterruptedException{
		Point loc = element.getLocation();
		int yLoc = loc.y;
		int xLoc = loc.x;
		yLoc = yLoc - 200;
		if (frameFlag == 1) {
			_driver.switchTo().defaultContent();
			((JavascriptExecutor) _driver).executeScript("scrollTo(" + xLoc
					+ "," + yLoc + ")");
			_driver.switchTo().frame(0);
		} else {
			((JavascriptExecutor) _driver).executeScript("scrollTo(" + xLoc
					+ "," + yLoc + ")");
		}
		Thread.sleep(2000);
	}
	public static void switchToLatestiFrame() throws InterruptedException {
		Thread.sleep(10000);
		_driver.switchTo().defaultContent();
		try {
			frameFlag = _driver.findElements(By.tagName("iframe")).size();
			System.out.println("frame size : " + frameFlag);
			_driver.switchTo().frame(
					(_driver.findElements(By.tagName("iframe")).size()) - 1);
			int buttonCount = _driver.findElements(By.tagName("input")).size(); 
			System.out.println("button size:"+buttonCount);
			if(buttonCount>0)
				//_driver.findElement(By.cssSelector(ObjectRepository.getValueFromGlobalRepository("setup.button.cancel"))).isDisplayed();
				_driver.findElement(By.tagName("input")).isDisplayed();	
		} catch (Exception e) {
			System.out.println("Exception in swithToLatestiFrame");
		}
		Thread.sleep(5000);
	}
	public static void switchToDefaultPage() {
		try {
			Thread.sleep(2000);
			_driver.switchTo().defaultContent();
			frameFlag = 0;
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("exception in default window");
		}
	}
	//@Test
	public static void waitElementPresent(){
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.ndtv.com/");
		WebDriver wait = (WebDriver) new WebDriverWait(driver,60);
		
		((FluentWait<WebDriver>) wait).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='feat_topnews']")));
	}
	public static void browserCredentialPrompt() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		driver.get("http://se:newyear@prod.exacly.me/lc/");
		Thread.sleep(20000);
		((JavascriptExecutor)driver).executeScript("scroll(0,750);");
		//Thread.sleep(10000);
		((JavascriptExecutor)driver).executeScript("scroll(0,750);");
		//Thread.sleep(10000);
		((JavascriptExecutor)driver).executeScript("scroll(0,750);");
		//Thread.sleep(10000);
		((JavascriptExecutor)driver).executeScript("scroll(0,750);");
		//Thread.sleep(10000);
		((JavascriptExecutor)driver).executeScript("scroll(0,750);");
		//Thread.sleep(10000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		List<String> productList = new ArrayList<String>();
		int j=0;
		
		for(int i =0; i<list.size();i++){
			String temp1 = list.get(i).getAttribute("onclick");
			//System.out.println(i+"="+temp1);
			if(temp1 != null){
				if(temp1.contains("EItemType")){
					String temp2[] = temp1.split("itemId:");
					String temp3[]=temp2[1].split(",");
					String temp4[]=temp3[0].split("'");
					productList.add(temp4[1]);
				}
			}
		}
		Set<String> unique = new HashSet<String>();
		List<String> duplicates = new ArrayList<String>();
		for( String n : productList ) {
		    if( !unique.add( n ) ) {
		        duplicates.add( n );
		    }
		}
		
		System.out.println("duplicate size"+duplicates.size());
		
		if(unique.size()>0){
			for(String n : unique){
				if(n.contains("P")){
					System.out.println("http://dev.exacly.me/lc/product.seam?id="+n);
				}else if(n.contains("D")){
					System.out.println("http://dev.exacly.me/lc/deal.seam?id="+n);
				}else if(n.contains("V")){
					System.out.println("http://dev.exacly.me/lc/video.seam?id="+n);
				}
				
					
							
			}
		}else{
			System.out.println("there is no duplicates");
		}
		
		driver.quit();
	}
	////@Test
	public void script() throws InterruptedException{
		System.setProperty("webdriver.ie.driver","E:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver	=	new InternetExplorerDriver();
		driver.get("http://192.168.172.141:8080/AlertEnterprise");
		Thread.sleep(40000);
		WebElement element =driver.findElement(By.cssSelector("table[class='fab-form-table']"));

		List<WebElement> list1 = element.findElements(By.tagName("tr"));
		System.out.println("size1"+list1.size());
		List<String> row1 = new ArrayList<String>();
		row1.add("Badging");
		row1.add("Alias 1");
		List<String> row2 = new ArrayList<String>();
		row2.add("BadgeValidFrom");
		row2.add("First Name");
		//System.out.println("size2"+list2.size());
		List<WebElement> list2 = null;

		for(int i=0;i<row1.size();i++){
			for(int j=0;j<list1.size();j++){
				list2 = list1.get(j).findElements(By.tagName("td"));
				for(int k=0;k<list2.size();k++){
					if(k%2 == 0){
						System.out.println(list2.get(k).getText());
						System.out.println("checkpoint 1"+row1.get(i)+":"+row2.get(i));
						if(row1.get(i).equalsIgnoreCase(list2.get(k).getText().trim())){
							System.out.println("checkpoint 2:"+row2.get(i));
							System.out.println("before for");
							j++;
							for(;j<list1.size();j++){
								list2 = list1.get(j).findElements(By.tagName("td"));
								for(k=0;k<list2.size();k++){
									System.out.println("for-4:"+list2.get(k).getText().trim()+":");
									if(row2.get(i).equalsIgnoreCase(list2.get(k).getText().trim())){
										System.out.println("checkpoint 3:"+list2.get(k+1).findElements(By.tagName("input")).size());
										WebElement element1 = null;
										if(list2.get(k+1).findElements(By.tagName("span")).size()>0){
											element1 = list2.get(k+1).findElement(By.tagName("input"));
											element1.sendKeys("abc");
										}else if(list2.get(k+1).findElements(By.tagName("select")).size()>0){
											element1 = list2.get(k+1).findElement(By.tagName("select"));
											element1.sendKeys("INDIA");

										}else if(list2.get(k+1).findElements(By.tagName("input")).size()>0){
											System.out.println("checkpoint4");
											element1 = list2.get(k+1).findElement(By.tagName("input"));
											element1.sendKeys("abc");
										}
										k=list2.size();
										j=list1.size();
									}
								}
							}
						}
					}	
				}
			}
		}
	}

	
}











*/