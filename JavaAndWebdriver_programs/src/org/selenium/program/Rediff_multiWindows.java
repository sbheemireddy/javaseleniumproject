package org.selenium.program;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff_multiWindows {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://in.rediff.com");
		
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds.size());
		Iterator<String> itr = windowIds.iterator();
		String mainWindow = itr.next();
		String secondWindow = itr.next();
		
		driver.switchTo().window(secondWindow);
		driver.close();
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Lifestyle")).click();
	}

}
