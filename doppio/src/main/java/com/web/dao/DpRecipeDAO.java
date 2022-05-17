package com.web.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.vo.DpRecipeVO;

public class DpRecipeDAO implements DpObjectDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String namespace="mapper.recipe";
	
	@Override //rs����
	public String selectFile(String rnum) {
		return sqlSession.selectOne(namespace+".rsfile", rnum);		
	}
	
	@Override //����Ʈ
	public List<Object> select(int startCount, int endCount){
		Map param = new HashMap<String, String>();
		param.put("start", startCount);
		param.put("end", endCount);
		
		return sqlSession.selectList(namespace+".list", param);
	}
	
	@Override //���
	public int insert(Object obj) {
		DpRecipeVO vo = (DpRecipeVO)obj;
		return sqlSession.insert(namespace+".insert", vo);
	}
	
	@Override //������ ó��
	public int execTotalCount() {
		return sqlSession.selectOne(namespace+".count");
	}
	
	@Override //��ȸ�� ������Ʈ
	public void updateHits(String rnum) {
		sqlSession.update(namespace+".update_hits", rnum);
	}
	
	@Override // ������ �󼼺���
	public Object select(String rnum) {
		return sqlSession.selectOne(namespace+".content", rnum);
	}
	
	@Override // ������ ����
	public int update(Object obj) {
		DpRecipeVO vo = (DpRecipeVO)obj;
		return sqlSession.update(namespace+".update", vo);
	}
	
	@Override //������ ����
	public int delete(String rnum) {
		return sqlSession.delete(namespace+".delete",rnum);
	}
	 
	
	
	
}
