/*
 * MsgData.java
 * Copyright(C) 2013-2016 JackyYang Personal
 * All rights reserved.
 * -----------------------------------------------
 * 2016-2-2 Created
 */
package com.rua.util;

/**
 * 数据消息
 * 
 * @author Jacky
 * @version v1.0.0
 * @date 2016-2-2
 * 
 */
public class MsgData extends Msg
{

	/** */
	private static final long	serialVersionUID	= 6645292069785324851L;

	public MsgData(int code)
	{
		super(code);
	}

	private Object	data;

	public Object getData()
	{
		return data;
	}

	public void setData(Object data)
	{
		this.data = data;
	}
}
