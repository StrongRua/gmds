/*
 * Time.java
 * Copyright(C) 2013-2016 JackyYang Personal
 * All rights reserved.
 * -----------------------------------------------
 * 2015年5月25日 Created
 */
package com.rua.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

/**
 * 时间工具类
 * 
 * @author Jacky @version v1.0.0
 * @date 2014年12月18日
 * 
 */
public class Time
{
	public final static String	DEFAULT_PATTERN		= "yyyy-MM-dd";
	public final static String	TIMESTAMP_PATTERN	= "yyyy-MM-dd HH:mm:ss";

	/**
	 * 当前时间
	 * 
	 * @return
	 */
	public static final Date now()
	{
		return new Date();
	}

	/**
	 * 格式化时间戳
	 * 
	 * @param ts
	 * @return
	 */
	public static final String toString(Timestamp ts)
	{
		return ts != null ? format(new Date(ts.getTime()), TIMESTAMP_PATTERN)
				: StringUtils.EMPTY;
	}

	/**
	 * 格式化时间
	 * 
	 * @param date
	 * @return
	 */
	public static final String toString(Date date)
	{
		return format(date, TIMESTAMP_PATTERN);
	}

	/**
	 * 格式化unixTime
	 * 
	 * @param unixTime
	 * @return
	 */
	public static final String toString(int unixTime)
	{
		return unixTime > 0 ? format(new Date(unixTime * 1000),
				TIMESTAMP_PATTERN) : StringUtils.EMPTY;
	}

	/**
	 * 格式化时间
	 * 
	 * @param date
	 * @return
	 */
	private static final String format(Date date, String pattern)
	{
		return date != null ? new SimpleDateFormat(pattern).format(date)
				: StringUtils.EMPTY;
	}

	/**
	 * 转换当前时间为UnixTime
	 * 
	 * @param date
	 * @return
	 */
	public static final int toUnixTime(Date date)
	{
		if (date == null)
		{
			return 0;
		}
		return (int) (date.getTime() / 1000);
	}

	/**
	 * 当前UnixTime
	 * @return int
	 */
	public static final int currentUnixTime()
	{
		return toUnixTime(now());
	}

	/**
	 * 转换为时间类型
	 * 
	 * @param source
	 *            字符串时间
	 * @return
	 */
	public static final Date toDate(String source)
	{
		if (StringUtils.isEmpty(source))
		{
			return null;
		}
		try
		{
			return new SimpleDateFormat(DEFAULT_PATTERN).parse(source);
		} catch (ParseException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
