/*
 * Msg.java
 * Copyright(C) 2013-2016 JackyYang Personal
 * All rights reserved.
 * -----------------------------------------------
 * 2016-2-2 Created
 */
package com.rua.util;

import java.io.Serializable;
import java.lang.*;

/**
 * 基础消息
 * 
 * @author Jacky
 * @version v1.0.0
 * @date 2016-2-2
 * 
 */
public class Msg implements Serializable
{

	/** */
	private static final long	serialVersionUID	= -5073292544070519673L;

	private int					code;
	private String				msg;

	public Msg()
	{

	}

	public Msg(int code)
	{
		this(code, Error.MSG[code]);
	}

	public Msg(int code, String msg)
	{
		this.code = code;
		this.msg = msg;
	}

	public int getCode()
	{
		return code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

}
