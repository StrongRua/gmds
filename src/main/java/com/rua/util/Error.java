/*
 * Error.java
 * Copyright(C) 2013-2016 JackyYang Personal
 * All rights reserved.
 * -----------------------------------------------
 * 2015年5月25日 Created
 */
package com.rua.util;

/**
 * 错误常量
 * 
 * @author Jacky
 * @version v1.0
 * @date 2015年9月11日
 * 
 */
public interface Error
{
	int			SUCCESS		= 0;
	int			FAILED		= 1; 
	int           RESUCCESS = 2;
	int           REFAILED = 3;
	int           ERRORURL = 4;


	String[]	MSG			= { "操作成功", "操作失败","发布成功","发布失败","错误Url"};
}
