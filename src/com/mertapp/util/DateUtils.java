package com.mertapp.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	public static Date getCurrentDate() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
	
	public static Date addDay(Date inputDate, Integer dayCount) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		calendar.add(Calendar.DATE, dayCount);
		return calendar.getTime();
	}
}
