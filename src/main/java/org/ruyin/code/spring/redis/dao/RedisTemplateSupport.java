package org.ruyin.code.spring.redis.dao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * 提供 RedisTemplate
 */
public abstract class RedisTemplateSupport<K extends Serializable,V extends Serializable> {

	@Autowired
	protected RedisTemplate<K, V> redisTemplate ;
	
	public void setRedisTemplate(RedisTemplate<K, V> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	protected RedisSerializer<String> getRedisSerializer(){
		return redisTemplate.getStringSerializer();
	}
}
