package org.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePage {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		driver.findElement(By.id("sbtc")).sendKeys("selenium");
		driver.findElement(By.cssSelector("div[id='sbtc'] div:nth-child(2) ul li:nth-child(3)")).click();
		
	}

}
