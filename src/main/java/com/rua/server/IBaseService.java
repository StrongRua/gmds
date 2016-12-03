/*
 * IBaseService.java
 * Copyright(C) 2013-2015 东方瑞呈科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2015-05-20 Created
 */
package com.rua.server;

import java.util.List;

/**
 * 基础服务类
 *
 * @param <T>
 * @author Jacky
 * @version v1.0
 * @date 2015年9月11日
 */
public interface IBaseService<T> {
    /**
     * 增加一个对象
     *
     * @param t
     * @return
     */
    int add(T t);

    /**
     * 删除一个对象
     *
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 更新一个对象
     *
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 查找对象
     *
     * @param id
     * @return
     */
    T find(int id);

    /**
     * 获取数据条数
     *
     * @return 总条数
     */
    long getCount();

    /**
     * 获取指定外键值的数据总条数
     *
     * @param key   外键
     * @param value 键值
     * @return 总条数
     */
    long getCount(int key, int value);

    /**
     * 获取指定条数的数据
     *
     * @param limit 前几条
     */
    List<T> initTop(int limit);

    /**
     * 分页获取 数据集
     *
     * @param start 数据起始位置 0为第一条
     * @param limit 限制的条数 取几条
     * @return
     */
    List<T> paginate(int start, int limit);

    /**
     * 分页获取 指定外键的数据集
     *
     * @param key   外键名
     * @param value 外键值
     * @param start 起始位置 0为第一条
     * @param limit 限制的条数 取几条
     * @return 数据集
     */
    List<T> paginate(int key, int value, int start, int limit);

}
