package org.ruyin.code.spring.redis.service.imp;

import java.util.List;

import org.ruyin.code.spring.redis.bean.Member;
import org.ruyin.code.spring.redis.dao.MemberDao;
import org.ruyin.code.spring.redis.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("memberService")
@Transactional
public class MemberServiceImp implements MemberService{
	
	@Autowired
	@Qualifier("memberDao")
	private MemberDao memberDao;
	
	@Transactional(readOnly=true)
	@Override
	public boolean add(Member member) {
		return memberDao.add(member);
	}

	@Override
	public boolean add(List<Member> list) {
		return memberDao.add(list);
	}

	@Override
	public void delete(String key) {
		memberDao.delete(key);
	}

	@Override
	public void delete(List<String> keys) {
		memberDao.delete(keys);
	}

	@Override
	public boolean update(Member member) {
		return memberDao.update(member);
	}

	@Override
	public Member get(String key) {
		return memberDao.get(key);
	}

}
