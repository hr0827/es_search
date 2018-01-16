package com.elastic.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

public class DateUtil {

	private static Logger logger = Logger.getLogger(DateUtil.class);
	public static final String DATETIME = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE = "yyyy-MM-dd";

	public static String datetimeToStr(final Date date, final String format) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	public static String dateTimeToStr(final Date date) {
		return DateUtil.datetimeToStr(date, "yyyy-MM-dd HH:mm:ss");
	}

	public static String dateToStr(final Date date) {
		return DateUtil.datetimeToStr(date, "yyyy-MM-dd");
	}

	public static String dateToStr(final Date date, String format) {
		return DateUtil.datetimeToStr(date, format);
	}

	public static String getCurrentDate() {
		return new SimpleDateFormat(DATE).format(new Date());
	}

	public static String getCurrentDate(String format) {
		return new SimpleDateFormat(format).format(new Date());
	}

	public static String getCurrentDatetime() {
		return new SimpleDateFormat(DATETIME).format(new Date());
	}

	public static String getCurrentDatetime(String format) {
		return new SimpleDateFormat(format).format(new Date());
	}

	public static int getCurrentTimeHashCode() {
		return String.valueOf(System.currentTimeMillis()).hashCode();
	}

	/**
	 * 获得当前时间当天的开始时间，即当前给出的时间那一天的00:00:00的时间
	 * 
	 * @param date
	 *            当前给出的时间
	 * @return 当前给出的时间那一天的00:00:00的时间的日期对象
	 */
	public static Date getDateBegin(final Date date) {
		SimpleDateFormat ymdFormat = new SimpleDateFormat("yyyy-MM-dd");
		if (date != null) {
			try {
				return DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.CHINA).parse(ymdFormat.format(date));
			} catch (ParseException e) {
				logger.error("DataFromat error");
			}
		}
		return null;
	}

	public static Date getDateEnd(Date date) {
		SimpleDateFormat ymdFormat = new SimpleDateFormat("yyyy-MM-dd");
		if (date != null) {
			try {
				Date endDate = strToDate(ymdFormat.format(new Date(date.getTime() + 24 * 60 * 60 * 1000)));
				endDate = new Date(endDate.getTime() - 1000);
				return endDate;
			} catch (Exception e) {
				logger.error("DataFromat error");
			}
		}
		return null;
	}

	public static long getNow() {
		return System.currentTimeMillis();
	}

	public static String getTime() {
		Date d = new Date();
		String re = datetimeToStr(d, "yyyyMMddHHmmssSSS");
		return re;
	}

	
	public static String getTime(String format) {
		Date d = new Date();
		String re = datetimeToStr(d, format);
		return re;
	}

	public static Date strToFormatDate(final String date, final String format) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(date, new ParsePosition(0));
	}

	public static Date strToDate(final String date) {
		return DateUtil.strToFormatDate(date, "yyyy-MM-dd");
	}

	public static final Date strToDate(final String dateStr, final String format) {
		return DateUtil.strToFormatDate(dateStr, format);
	}

	public static Date strToDateTime(final String date) {
		return DateUtil.strToFormatDate(date, "yyyy-MM-dd HH:mm:ss");
	}

	public static Date strToDateTime(final String date, final String format) {
		return DateUtil.strToFormatDate(date, format);
	}

	public static Timestamp strToTimestamp(String str) throws Exception {
		if (StringUtils.isEmpty(str)) {
			throw new Exception("转换错误");
		}
		if (str.trim().length() > 10) {
			return new Timestamp(new SimpleDateFormat(DATETIME).parse(str).getTime());
		} else {
			return new Timestamp(new SimpleDateFormat(DATE).parse(str).getTime());
		}
	}

	public static Timestamp strToTimestamp(String sDate, String sFormat) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
		Date t = sdf.parse(sDate);
		return new Timestamp(t.getTime());

	}

	public static boolean validateExpireDate(final long timeMillis, final long expireTimeMillis) {
		return (getNow() - timeMillis) > expireTimeMillis;
	}
}
