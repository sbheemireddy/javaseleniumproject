package org.selenium.programs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateProgram {

	/**
	 * @param args
	 */
	public static void date() {
		Date date = new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//System.out.println(sdf.format(date));
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		boolean monday = cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY;
		System.out.println("value : "+monday);

	}

}
