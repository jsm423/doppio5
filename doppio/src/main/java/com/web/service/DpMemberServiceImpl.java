package com.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.DpMemberDAO;
import com.web.vo.DpMemberVO;

public class DpMemberServiceImpl extends DpObjectServiceAdapter implements DpMemberService{
	@Autowired
	private DpMemberDAO memberDao;
	
	@Override	// ȸ������
	public int getInsertResult(Object obj) {
		DpMemberVO vo = (DpMemberVO)obj;
		return memberDao.insert(vo);
	}
	
	@Override // ȸ�����Խ� ���̵� �ߺ�üũ
	public int getIdCheckResult(String id) {
		return memberDao.idCheck(id);
	}
	
	@Override	//�α���
	public Map<String,Object> getLoginResult(DpMemberVO vo) {
		System.out.println("getLoginResult ------> " +  memberDao.select(vo));
		return memberDao.select(vo);
	}
	
	@Override //ȸ�� Ż�� ��û ����
	public int getStatusUpdate(String mnum, String status) {
		return memberDao.updateJoinStatus(mnum, status);
	}
	
	@Override //ȸ�� ��������
	public Object getContent(String mnum) {
		return memberDao.select(mnum);
	}
	
	@Override //ȸ������Ʈ ��������ȣ
	public int getListCount() {
		return memberDao.execTotalCount();
	}
	
	@Override //ȸ�� ����Ʈ
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
