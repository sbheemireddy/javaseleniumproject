package org.selenium.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class InterviewQuestions {

	public static void main(String[] args) throws InterruptedException {

		//stringReverseUingCharArray();
		//stringComparisonUingCharArray();
		displayWebElementMethods();
	}
	public static void stringReverseUingCharArray(){

		String str = "computer" ;
		String str1 = "computer";

		char[] arr = str.toCharArray();
		int aa=432;
		int n=arr.length;
		for(int i=n;i>0;i--){
			//System.out.print(arr[i-1]);
		}

		char[] arr1 = new char[8];
		for(int i=0;i<str.length();i++){
			arr1[i] = str.charAt(i);
		}
		System.out.println(arr);
		System.out.println(arr1);
		boolean blnResult = Arrays.equals(arr, arr1);
		System.out.println(blnResult);
	}
	public static void stringComparisonUingCharArray(){
		String str1 = "selenium";
		String str2 = "qtp";
	}
	public static void displayWebElementMethods() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.googl.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.name("q"));
		//element.sendKeys("aab");
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.sendKeys("abc").perform();
		System.out.println("getSize : "+element.getSize());
		System.out.println("getLocation : " + element.getLocation());
		System.out.println("getClass : "+element.getClass());
		System.out.println("getText : "+element.getText());
		System.out.println("getTagName " + element.getTagName());
		System.out.println("getCssValue : "+element.getAttribute(""));
		System.out.println("getCssValue : "+element.getCssValue("color"));
		System.out.println("getAttribute " +element.getAttribute("name"));
		System.out.println("isDisplayed : "+element.isDisplayed());
		System.out.println("isEnabled : "+element.isEnabled());
		System.out.println("isSelected : "+element.isSelected());
						
	}
	
}
class Temp{
	public void abc() throws ClassNotFoundException{
		Class.forName("FirefoxDriver");
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("aaa");
		Iterator itr = al.iterator();
		String str = (String) itr.next();
		System.out.println(al.get(0));
		
	}
	
}
