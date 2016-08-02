package org.java.programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProgram {

	public static void main(String[] args) throws InterruptedException {

		Date bDate = new Date();
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.after(bDate));
		System.out.println(date.before(bDate));
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println(sdf.format(date));
		
		long time1 = System.currentTimeMillis();
		Thread.sleep(100);
		long time2 = System.currentTimeMillis();
		System.out.println(time2-time1);
		
		
		
	}

}
