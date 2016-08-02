package org.selenium.program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BBC {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bbc.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[text()='News']")).click();
		//driver.findElement(By.linkText("News")).click();
		//driver.findElement(By.partialLinkText("Ne")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
		}
		
	}

}
