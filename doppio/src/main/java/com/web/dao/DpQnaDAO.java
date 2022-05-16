package com.web.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.vo.DpQnaVO;

public class DpQnaDAO implements DpObjectDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String namespace="mapper.qna";
	
	/**
	 * ����¡ ó��
	 */
	@Override
	public int execTotalCount() {
		return sqlSession.selectOne(namespace+".count");
	}
	/**
	 * ��ȸ�� ������Ʈ 
	 */
	@Override
	public void updateHits(String qnum) {
		sqlSession.update(namespace+".update_hits", qnum);
	}
	
	/**
	 * 1. qna ���
	 */
	@Override
	public int insert(Object obj) {
		DpQnaVO vo = (DpQnaVO)obj;
		return sqlSession.insert(namespace+".insert", vo);
	}
	
	/**
	 * 2. qna ����Ʈ
	 */
	public List<Object> select(int startCount, int endCount){
		Map param = new HashMap<String, String>();
		param.put("start", startCount);
		param.put("end", endCount);
		
		return sqlSession.selectList(namespace+".list", param);
	}
	
	/**
	 *  3. qna �󼼺���
	 */
	@Override
	public Object select(String qnum) {
		return sqlSession.selectOne(namespace+".content", qnum);
	}
	
	/**
	 *  4. qna ����(������Ʈ)
	 */
	@Override
	public int update(Object obj) {
		
		DpQnaVO vo = (DpQnaVO)obj;
		return sqlSession.update(namespace+".update", vo);
	}
	
	
	/**
	 * 5. �Խñ� ����
	 */
	@Override
	public int delete(String qnum) {
		return sqlSession.delete(namespace+".delete", qnum);
	}
	
	@Override
	public String selectFile(String id) { return "";}
}