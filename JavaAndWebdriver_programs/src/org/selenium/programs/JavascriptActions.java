package org.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Browsers_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com");
		Thread.sleep(20000);
		//WebElement element1 = driver.findElement(By.cssSelector("p[class='overlay_heading clearfix']"));
		//WebElement element2 = element1.findElement(By.tagName("a"));
		WebElement element = driver.findElement(By.cssSelector("a[class='close_overlay pull-right']"));
		System.out.println(element.getTagName());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}

}
