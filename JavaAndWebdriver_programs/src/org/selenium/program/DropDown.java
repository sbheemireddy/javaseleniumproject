package org.selenium.program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qtpselenium.com/home/contact_trainer");
		
		WebElement dropList = driver.findElement(By.name("country_id"));
		List<WebElement> options = dropList.findElements(By.tagName("option"));
		
		System.out.println(options.size());
		
		Select select = new Select(dropList);
		
	}

}
