package org.selenium.program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("Email"));
		element.sendKeys("sbheemireddy");
		String text = element.getAttribute("value");
		System.out.println(text);
		driver.findElement(By.name("signIn")).click();
		driver.findElement(By.id("Passwd")).sendKeys("abcd");
		driver.findElement(By.id("signIn")).click();
		
		
	}

}
