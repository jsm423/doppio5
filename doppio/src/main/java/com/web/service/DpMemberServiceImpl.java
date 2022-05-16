package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.DpMemberDAO;
import com.web.vo.DpMemberVO;

public class DpMemberServiceImpl implements DpMemberService{
	@Autowired
	private DpMemberDAO memberDao;
	
	@Override	// 회원가입
	public int getInsertResult(DpMemberVO vo) {
		return memberDao.insert(vo);
	}
	
	@Override // 회원가입시 아이디 중복체크
	public int getIdCheckResult(String id) {
		return memberDao.idCheck(id);
	}
	
	@Override	//로그인
	public int getLoginResult(DpMemberVO vo) {
		return memberDao.select(vo);
	}
}
