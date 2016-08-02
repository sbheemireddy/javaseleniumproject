package org.selenium.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip_dateSelection {

	public static void main(String[] args) throws ParseException {

		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.makemytrip.com");
		
		String date = "15/8/2019";
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		Date d =df.parse(date);
		
		String month=new SimpleDateFormat("dd").format(d);
		System.out.println(month);
		
		Date currentDate = new Date();
		
		System.out.println("");
		
		
		
		
	}

}
