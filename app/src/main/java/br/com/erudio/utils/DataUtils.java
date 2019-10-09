package br.com.erudio.utils;

import java.util.Calendar;

public class DataUtils {

	public static Calendar addDays(Calendar calendar, int days){
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return calendar;
	}
}
