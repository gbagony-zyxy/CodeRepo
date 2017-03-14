package org.ruyin.code.spring.redis.dao;

import java.util.List;

import org.ruyin.code.spring.redis.bean.Member;

public interface MemberDao {
	
	/**
	 * 添加对象
	 */
	public boolean add(Member member);
	/**
	 * 添加集合
	 */
	public boolean add(List<Member> list);
	/**
	 * 删除对象
	 */
	public void delete(String key);
	/**
	 * 删除集合
	 */
	public void delete(List<String> keys);
	/**
	 * 修改对象
	 */
	public boolean update(Member member);
	/**
	 * 根据key获取对象
	 */
	public Member get(String key);
}
