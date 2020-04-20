package com.ydx.shop.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static final String DD_MM_YYYY = "dd/MM/yyyy";
	public static final String DD_MM_YYYY_SCORE = "dd-MM-yyyy";
	public static final String YYYYMMDDHH = "yyyyMMddHH";
	public static final String YYYY_MM_DD = "yyyy/MM/dd";
	public static final String YYYYMMDD = "yyyyMMdd";
	public static final String YYYYMM = "yyyyMM";
	public static final String MMYYYY = "MM/yyyy";
	public static final String YYYY = "yyyy";
	public static final String DDMMMYYYY_BY_SPACE = "dd MMM yyyy";
	public static final String MMMMMYYYY_BY_SPACE = "MMMMM yyyy";
	public static final String MMMYYYY_BY_SPACE = "MMM yyyy";
	public static final String DDMMMYYYYHHMMA_BY_SPACE = "dd MMM yyyy/ hh:mm a";
	public static final String DDMMYYYYHHMMA_BY_SPACE = "dd/MM/yyyy hh:mm a";
	public static final String MMDDYYHHMMA_BY_SLASH = "MM/dd/yy hh:mm a";
	public static final String DDMMYYYYHHMM_BY_SPACE = "dd/MM/yyyy HH:mm";
	public static final String DD_MM_YYYYA = "dd/MM/yyyy a";
	public static final String DDMMYYYY_HHMMSS = "dd/MM/yyyy HH:mm:ss";
	public static final String DDMMYYYY_HHMMSS_BY_COMMA = "dd/MM/yyyy,HH:mm:ss";
	public static final String YYYYMMDD_HHMMSS = "yyyy/MM/dd HH:mm:ss";
	public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
	public static final String YYYYMMDDHHMMSS_SSS = "yyyy-MM-dd HH:mm:ss.SSS";
	public static final String DDMMMYYYYA = "dd/MM/yyyy a";
	public static final String A = "a";
	public static final String DD_MM_YYYY_STRIKETHROUGH = "dd-MM-yyyy";
	public static final String HHMMSS = "HH:mm:ss";
	public static final String HHMMA = "hh:mm a";
	public static final String DDMMYYYYHHMMSSA = "dd-MMM-yyyy hh:mm:ss a";

	public static Date getTodayDay() {
		return Calendar.getInstance().getTime();
	}

	public static Date parseToDate(String dateStr, String dateFormat) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		try {
			return simpleDateFormat.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String toString(Date date, String strDateFormat) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strDateFormat);
		return simpleDateFormat.format(date);
	}
	
	
}
