package com.web.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.vo.DpCommentVO;

public class DpCommentDAO implements DpObjectDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String namespace="mapper.comment";
	
	//��� ���
	@Override
	public int insert(Object obj) {
		DpCommentVO vo = (DpCommentVO)obj;
		return sqlSession.insert(namespace+".insert", vo);
	}
	
	//��� ����Ʈ
	public List<Object> select(int startCount, int endCount){
		Map param = new HashMap<String, String>();
		param.put("start", startCount);
		param.put("end", endCount);
		
		return sqlSession.selectList(namespace+".list", param);
	}
	
	
	//��� ����
	@Override
	public int update(Object obj) {
		DpCommentVO vo = (DpCommentVO)obj;
		return sqlSession.update(namespace+".update", vo);
	}
	
	
	//��� ����
	@Override
	public int delete(String cmnum) {
		return sqlSession.delete(namespace+".delete", cmnum);
	}
	
	
	//������ ��ȣ
	@Override
	public int execTotalCount() {
		return sqlSession.selectOne(namespace+".count");
	}
	
	@Override
	public void updateHits(String num) {}
	
	@Override
	public Object select(String num) { return null;}
	
	@Override
	public String selectFile(String id) { return "";}

	@Override
	public List<Object> select(int startCount, int endCount, String rcate) {return null;}

	@Override
	public int execTotalCount(String rcate) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
