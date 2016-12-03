/*
 * JsonMessage.java
 * Copyright(C) 2013-2015 成都PLZT科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2015年5月21日 Created
 */
package com.rua.json;

import com.rua.util.Resp;

/**
 * JSON消息
 *
 * @author Jacky
 * @version v1.0
 * @date 2015年5月21日
 */
public class JsonMessage {

    /**
     * 返回带数据的的JSON消息
     *
     * @param resp 消息数据对象
     * @return String
     */
    public static String getJsonMsg(Resp resp) {
        return JsonTools.toJson(resp);
    }

    /**
     * 返回JsonString
     *
     * @param object 对象
     * @return String Json数据
     */
    public static String getJsonObject(Object object) {
        return JsonTools.toJson(object);
    }

}
