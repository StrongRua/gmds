package com.rua.redis.dao;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by Jacky on 2016/4/9.
 */
public interface IBaseDao<T> {
	/**
	 * Spring
	 * 
	 * @param redisTemplate
	 */
	// void setRedisTemplate(RedisTemplate<String, String> redisTemplate);

	/**
	 * 保存对象
	 *
	 * @param t
	 * @return
	 */
	int save(T t);

	/**
	 * 删除指定的对象
	 *
	 * @param key
	 * @return
	 */
	int delete(String key);

	/**
	 * 修改对象
	 *
	 * @param t
	 */
	int update(T t);

	/**
	 * 查询指定的对象
	 *
	 * @param key
	 * @return
	 */
	T get(String key);

	/**
	 * 查询数据条数
	 *
	 * @return 总条数
	 */
	long getCount();
}
