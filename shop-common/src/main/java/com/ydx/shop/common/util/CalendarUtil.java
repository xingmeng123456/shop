package com.ydx.shop.common.util;

import java.util.Calendar;
import java.util.Date;

public class CalendarUtil {
  
	public static Date getDate(final int year, final int month, final int date) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, date, 0, 0, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	/**
	 * get Date after(before) a count of (Day,Month,Year,...)
	 * 
	 * @param date
	 * @param field
	 *            eg:Calendar.MONTH Calendar.YEAR Calendar.DATE .....
	 * @param count
	 *            eg: 1 2 3 -1 -2 -3
	 * @return
	 */
	public static Date getDifferDate(final Date date, final int field, final int count) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(field, count);
		return calendar.getTime();
	}
	
	/**
	 * get Previous Date
	 * 
	 * @param date
	 * @return
	 */
	public static Date getPrevDay(final Date date) {
		return getDifferDate(date, Calendar.DATE, 1);
	}

	/**
	 * get Next Date
	 * 
	 * @param date
	 * @return
	 */
	public static Date getNextDay(final Date date) {
		return getDifferDate(date, Calendar.DATE, 1);
	}
	
	/**
	 * get Previous Month
	 * 
	 * @param date
	 * @return
	 */
	public static Date getPrevMonth(final Date date) {
		return getDifferDate(date, Calendar.MONTH, -1);
	}

	/**
	 * get Next Month
	 * 
	 * @param date
	 * @return
	 */
	public static Date getNextMonth(final Date date) {
		return getDifferDate(date, Calendar.MONTH, 1);
	}

	/**
	 * get Previous Year
	 * 
	 * @param date
	 * @return
	 */
	public static Date getPrevYear(final Date date) {
		return getDifferDate(date, Calendar.YEAR, -1);
	}

	/**
	 * get Next Year
	 * 
	 * @param date
	 * @return
	 */
	public static Date getNextYear(final Date date) {
		return getDifferDate(date, Calendar.YEAR, 1);
	}
}
