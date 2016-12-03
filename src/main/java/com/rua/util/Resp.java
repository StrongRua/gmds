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
 */
public class Resp<T> {
    public Resp() {

    }

    public Resp(int code) {
        this(code, Error.MSG[code]);
    }

    public Resp(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
