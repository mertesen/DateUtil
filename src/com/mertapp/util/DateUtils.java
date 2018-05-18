package com.mertapp.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.mertapp.util.Constants;;

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
	
	public static Calendar toCalendar(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		return calendar;
	}
	
	public static boolean smallerThan(Date inputDate_1, Date inputDate_2) {
		return inputDate_1.compareTo(inputDate_2) < Constants.INT_ZERO;
	}
	
	public static boolean biggerThan(Date inputDate_1, Date inputDate_2) {
		return inputDate_1.compareTo(inputDate_2) > Constants.INT_ZERO;
	}
	
	public static boolean equalTo(Date inputDate_1, Date inputDate_2) {
		return inputDate_1.compareTo(inputDate_2) == Constants.INT_ZERO;
	}
	
	public static String DateToString(Date inputDate, String dateFormat) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(inputDate);
	}
	
	public static Boolean between(Date inputDate, Date minDate, Date maxDate, Boolean isLimitDateIncluded) {
		return null;
	}
}
