package com.web.dao;

import java.util.List;

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
	
	@Override
	public List<Object> select(int startCount, int endCount){ 
		return null;
	}
	
	@Override
	public void updateHits(String num) {}
	
	@Override
	public Object select(String num) { return null;}
	
	@Override
	public int update(Object obj){ return 0; }
	
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
	
	
	
	
	
	
}
