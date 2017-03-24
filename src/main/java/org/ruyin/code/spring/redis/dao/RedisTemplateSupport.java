package org.ruyin.code.spring.redis.dao;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.io.Serializable;

/**
 * 提供 RedisTemplate
 */
public abstract class RedisTemplateSupport<K extends Serializable,V extends Serializable> {

	protected RedisTemplate<K, V> redisTemplate ;
	
	public void setRedisTemplate(RedisTemplate<K, V> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	protected RedisSerializer<String> getRedisSerializer(){
		return redisTemplate.getStringSerializer();
	}
}
