package org.selenium.programs;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCode1 {

	
	public static void main(String[] args) throws InterruptedException{
		
		String str="sai baba";
		char[] arr=str.toCharArray();
		System.out.println();
		boolean flag =Arrays.equals(arr, arr);
		System.out.println(flag);
			
		/*//System.setProperty("webdriver.chrome.driver", "D:\\Browsers_Drivers\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver","D:\\Browsers_Drivers\\IEDriverServer.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(30000);
		
		List<WebElement> list=driver.findElements(By.cssSelector("p[class='price_info RobotoRegular ng-binding']"));
		int value =100000;
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
			String[] str=list.get(i).getText().split("\\.");
			int price=Integer.parseInt(str[1].replaceAll(",", ""));
			if(value>price){
				value=price;
				
			}
		}
		System.out.println("value : "+value);
		WebDriverWait wait = new WebDriverWait(driver,20);*/
		/*try{
			
		WebElement inputElement = driver.findElement(By.cssSelector("span[class='checkbox_state pull-left disable_popup']"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", inputElement);
		System.out.println("check box :"+inputElement.getTagName());
		}catch(Exception e){
		}
		//WebElement ele = driver.findElement(By.cssSelector("a[class='close_overlay pull-right']"));
		WebElement ele = driver.findElement(By.cssSelector("div[class='modal fade hard_interstial_2_sec in']"));
		ele.click();
		
		Actions builder = new Actions(driver);
	     builder.moveToElement( ele ).click( ele );
	     builder.perform();
		Thread.sleep(10000);
		System.out.println("ele : "+ele.getTagName());
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", 
                ele, "aria-hidden", "false");
		ele = driver.findElement(By.cssSelector("a[class='close_overlay pull-right']"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.document.getElementsByClassName('close_overlay pull-right').click();");
		System.out.println("text : "+ele.getSize());
		System.out.println("value : "+driver.findElement(By.cssSelector("a[class='close_overlay pull-right']")).getTagName());
		System.out.println("value1 : "+driver.findElement(By.cssSelector("a[class='close_overlay pull-right']")).isDisplayed());
		driver.findElement(By.cssSelector("a[class='close_overlay pull-right']")).click();
		//List<WebElement> list =driver.findElements(By.cssSelector("[href*='selectors']"));
		
		//System.out.println(list.size());
		
		//driver.close();
		String str="abnc";
		char[] arr = str.toCharArray();
		char[] arr1 = str.toCharArray();
		System.out.println(str.length());
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			System.out.println(arr1[i]);
		}
		boolean flag = Arrays.equals(arr, arr1);
		System.out.println(flag);
		
	}
	static int i=0;
	static TestCode obj = null;
	void method1(){
		System.out.println(i);
	}
	public static void method2(){
		obj =new TestCode();
		System.out.println(i);
	}*/
}
}
