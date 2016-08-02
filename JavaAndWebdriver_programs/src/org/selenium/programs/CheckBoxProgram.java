package org.selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxProgram {

	public static int abc =3;
	public static final int bcd=8;
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.uat1.carezen.net/b/l/smbpetcare-lxylb/waltham-ma");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*WebElement checkbox = driver.findElement(By.xpath("//table[@class='checkBoxGroup']"));
		WebElement checkbox1 = checkbox.findElement(By.tagName("tr"));
		WebElement checkbox2 = checkbox1.findElement(By.tagName("input"));*/
		//checkbox2.click();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox' and starts-with(@value,'PCSMBCAT00')]")).size());
		System.out.println("first debug");
		//driver.findElement(By.xpath("//input[@type='checkbox'and starts-with(@value,'PCSMBCAT00')]")).click();
		 
		 String typeOfCare1checkbox = "//input[@type='checkbox' and starts-with(@value,'PCSMBCAT00')]";
		 
		 driver.findElement(By.xpath(typeOfCare1checkbox)).click();
		
		System.out.println("last statement");
		
		//driver.get("file:///C:/Srikanth/htmlPage.html");
		//driver.findElement(By.xpath("//input[@type='checkbox' and starts-with(@value,'PCSMBCAT00')]")).click();
		
	}

}
