package com.mertapp.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.mertapp.util.Constants;;

public class DateUtils {
	/**
	 * @author Mert
	 * @date May 2018
	 */
	public static Date getCurrentDate() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}

	/**
	 * @author Mert
	 * @date May 2018
	 * @param inputDate
	 * @param dayCount
	 */
	public static Date addDay(Date inputDate, Integer dayCount) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		calendar.add(Calendar.DATE, dayCount);
		return calendar.getTime();
	}

	/**
	 * @author Mert
	 * @date May 2018
	 * @param inputDate
	 */
	public static Calendar toCalendar(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		return calendar;
	}

	/**
	 * @author Mert
	 * @date May 2018
	 * @param inputDate_1
	 * @param inputDate_2
	 */
	public static boolean smallerThan(Date inputDate_1, Date inputDate_2) {
		return inputDate_1.compareTo(inputDate_2) < Constants.INT_ZERO;
	}

	/**
	 * @author Mert
	 * @date May 2018
	 * @param inputDate_1
	 * @param inputDate_2
	 */
	public static boolean biggerThan(Date inputDate_1, Date inputDate_2) {
		return inputDate_1.compareTo(inputDate_2) > Constants.INT_ZERO;
	}

	/**
	 * @author Mert
	 * @date May 2018
	 * @param inputDate_1
	 * @param inputDate_2
	 */
	public static boolean equalTo(Date inputDate_1, Date inputDate_2) {
		return inputDate_1.compareTo(inputDate_2) == Constants.INT_ZERO;
	}

	/**
	 * @author Mert
	 * @date May 2018
	 * @param inputDate
	 * @param dateFormat
	 */
	public static String DateToString(Date inputDate, String dateFormat) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(inputDate);
	}

	/**
	 * @author Mert
	 * @date May 2018
	 * @param inputDate
	 * @param minDate
	 * @param maxDate
	 * @param isLimitDateIncluded
	 */
	public static Boolean isBetween(Date inputDate, Date minDate, Date maxDate, Boolean isLimitDateIncluded) {
		if (isLimitDateIncluded == Boolean.TRUE) {
			if (equalTo(inputDate, minDate) || equalTo(inputDate, maxDate)
					|| (smallerThan(inputDate, maxDate) && biggerThan(inputDate, minDate))) {
				return Boolean.TRUE;
			}
		} else if (isLimitDateIncluded == Boolean.FALSE) {
			if (smallerThan(inputDate, maxDate) && biggerThan(inputDate, minDate)) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

	/**
	 * @author Mert
	 * @date May 2018
	 * @param inputDate
	 */
	public static Boolean isWeekend(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
				|| calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
