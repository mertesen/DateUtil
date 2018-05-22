package com.mertapp.test;

import java.util.Date;

import com.mertapp.util.DateUtils;

public class DateTest {
	public static void main(String[] args) {
		Date today = DateUtils.getCurrentDate();
		if (DateUtils.isWeekend(today)) {
			System.out.println("Bugün haftasonu.");
		} else {
			System.out.println("Bugün haftasonu deðil!");
		}
	}
}
