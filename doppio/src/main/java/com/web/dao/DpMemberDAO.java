package com.web.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.vo.DpMemberVO;

public class DpMemberDAO implements DpObjectDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String namespace = "mapper.member";
	
	/**
	 * ȸ������ - INSERT
	 */
	@Override
	public int insert(Object obj) {
		DpMemberVO vo = (DpMemberVO)obj;
		return sqlSession.insert(namespace+".insert", vo);
	}
	/**
	 * ȸ�����Խ� ���̵� �ߺ� üũ
	 */
	public int idCheck(String id) {
		return sqlSession.selectOne(namespace+".id_check", id);
	}

	/**
	 * �α��� - select(DpMemberVO vo)
	 */

	public int select(DpMemberVO vo) {
		return sqlSession.selectOne(namespace+".login", vo);
	}
	
	/**
	 * ����¡ ó��
	 */
	public int execTotalCount() {
		return sqlSession.selectOne(namespace+".count");
	}
	
	/**
	 * ȸ�� Ż�� ��û/���
	 */
	public int updateJoinStatus(String id, String status) {
		int result = 0;
		int value = Integer.parseInt(status);
		if(value==0) {
			//��û
			result = sqlSession.update(namespace+".status1", id);			
		}else {
			//���
			result = sqlSession.update(namespace+".status2", id);
		}
		return result;
	}
	
	/**	 *  ȸ�� ��ü ����Ʈ + (����¡ó��)	 */
	@Override
	public List<Object> select(int startCount, int endCount){ 
		Map param = new HashMap<String, String>();
		param.put("start", startCount);
		param.put("end", endCount);
		
		return sqlSession.selectList(namespace+".list", param);
	}
	
	
	/**
	 * ȸ�� �� ����
	 */
	@Override
	public Object select(String mnum) { 
		
		return sqlSession.selectOne(namespace+".content", mnum);
	}
	
	/**
	 * ȸ������ ����
	 */
	@Override
	public int update(Object obj){ 
		DpMemberVO vo = (DpMemberVO)obj;
		return sqlSession.update(namespace+".update", vo);
	}
	
	
	@Override
	public void updateHits(String num) {}	
	
	
	@Override
	public int delete(String num) {return 0;}
	
	@Override
	public String selectFile(String id) { return "";}
	@Override
	public List<Object> select(int startCount, int endCount, String cate) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int execTotalCount(String rcate) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int execTotalCount1(String pcate) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}
