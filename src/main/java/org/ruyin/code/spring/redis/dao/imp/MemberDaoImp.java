package org.ruyin.code.spring.redis.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.ruyin.code.spring.redis.bean.Member;
import org.ruyin.code.spring.redis.dao.MemberDao;
import org.ruyin.code.spring.redis.dao.RedisTemplateSupport;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

@Repository("memberDao")
public class MemberDaoImp extends RedisTemplateSupport<String, Member> implements MemberDao{

	@Override
	public boolean add(Member member) {
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = getRedisSerializer();
				byte[] key = serializer.serialize(member.getId());
				byte[] value = serializer.serialize(member.getNickname());
				System.out.println(key+":"+value);
				return connection.setNX(key, value);
			}
		});
		return result;
	}

	@Override
	public boolean add(List<Member> list) {
		Assert.notEmpty(list);
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = getRedisSerializer();
				for(Member member : list){
					byte[] key = serializer.serialize(member.getId());
					byte[] value = serializer.serialize(member.getNickname());
					connection.setNX(key, value);
				}
				return true;
			}
		},false,true);
		return result;
	}

	@Override
	public void delete(String key) {
		List<String> list = new ArrayList<>();
		list.add(key);
		delete(list);
	}

	@Override
	public void delete(List<String> keys) {
		redisTemplate.delete(keys);
	}

	@Override
	public boolean update(Member member) {
		String key = member.getId();
		if(get(key) == null){
			throw new NullPointerException("不存在对应的数据"+key);
		}
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = getRedisSerializer();
				byte[] key = serializer.serialize(member.getId());
				byte[] value = serializer.serialize(member.getNickname());
				connection.set(key, value);
				return true;
			}
		});
		return result;
	}

	@Override
	public Member get(String key) {
		Member result = redisTemplate.execute(new RedisCallback<Member>() {
			@Override
			public Member doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = getRedisSerializer();
				byte[] keyId = serializer.serialize(key);
				byte[] value = connection.get(keyId);
				if(value == null){
					return null;
				}
				String nickname = serializer.deserialize(value);
				return new Member(key, nickname);
			}
		});
		return result;
	}

}
