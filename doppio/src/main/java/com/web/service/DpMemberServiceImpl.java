package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.DpMemberDAO;
import com.web.vo.DpMemberVO;

public class DpMemberServiceImpl implements DpMemberService{
	@Autowired
	private DpMemberDAO memberDao;
	
	@Override	// ȸ������
	public int getInsertResult(DpMemberVO vo) {
		return memberDao.insert(vo);
	}
	
	@Override // ȸ�����Խ� ���̵� �ߺ�üũ
	public int getIdCheckResult(String id) {
		return memberDao.idCheck(id);
	}
	
	@Override	//�α���
	public int getLoginResult(DpMemberVO vo) {
		return memberDao.select(vo);
	}
}
