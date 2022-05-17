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
	
	@Override //rs파일
	public String selectFile(String rnum) {
		return sqlSession.selectOne(namespace+".rsfile", rnum);		
	}
	
	@Override //리스트
	public List<Object> select(int startCount, int endCount){
		Map param = new HashMap<String, String>();
		param.put("start", startCount);
		param.put("end", endCount);
		
		return sqlSession.selectList(namespace+".list", param);
	}
	
	@Override //등록
	public int insert(Object obj) {
		DpRecipeVO vo = (DpRecipeVO)obj;
		return sqlSession.insert(namespace+".insert", vo);
	}
	
	@Override //페이지 처리
	public int execTotalCount() {
		return sqlSession.selectOne(namespace+".count");
	}
	
	@Override //조회수 업데이트
	public void updateHits(String rnum) {
		sqlSession.update(namespace+".update_hits", rnum);
	}
	
	@Override // 레시피 상세보기
	public Object select(String rnum) {
		return sqlSession.selectOne(namespace+".content", rnum);
	}
	
	@Override // 레시피 수정
	public int update(Object obj) {
		DpRecipeVO vo = (DpRecipeVO)obj;
		return sqlSession.update(namespace+".update", vo);
	}
	
	@Override //레시피 삭제
	public int delete(String rnum) {
		return sqlSession.delete(namespace+".delete",rnum);
	}
	 
	
	
	
}
