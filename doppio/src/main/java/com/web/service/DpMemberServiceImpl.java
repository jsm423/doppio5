package com.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.DpMemberDAO;
import com.web.vo.DpMemberVO;

public class DpMemberServiceImpl extends DpObjectServiceAdapter implements DpMemberService{
	@Autowired
	private DpMemberDAO memberDao;
	
	@Override	// 회원가입
	public int getInsertResult(Object obj) {
		DpMemberVO vo = (DpMemberVO)obj;
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
	
	@Override //회원 탈퇴 신청 상태
	public int getStatusUpdate(String mnum, String status) {
		return memberDao.updateJoinStatus(mnum, status);
	}
	
	@Override //회원 상세페이지
	public Object getContent(String mnum) {
		return memberDao.select(mnum);
	}
	
	@Override //회원리스트 페이지번호
	public int getListCount() {
		return memberDao.execTotalCount();
	}
	
	@Override //회원 리스트
	public List<Object> getListResult(int startCount, int endCount){
		List<Object> olist = memberDao.select(startCount, endCount);
		List<DpMemberVO> list = new ArrayList<DpMemberVO>();
		for(Object obj : olist) {
			list.add((DpMemberVO)obj);
		}
		return memberDao.select(startCount, endCount);
	}
	
	@Override
	public int getUpdateResult(Object obj) {
		DpMemberVO vo = (DpMemberVO)obj;
		return memberDao.update(vo);
	}
	
	
	
	
	
	
}
