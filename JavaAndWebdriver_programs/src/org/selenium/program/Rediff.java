package org.selenium.program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
		WebElement element = driver.findElement(By.xpath("//div[@id='popular_cat']"));
		List<WebElement> links = element.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
			links.get(i).click();
		}
		
		//pending taks:navigates to the all links in 3 ways
		
	}

}
