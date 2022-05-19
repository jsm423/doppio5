package com.web.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.vo.DpBoardVO;

public class DpBoardDAO implements DpObjectDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String namespace="mapper.board";

	@Override //bs파일
	public String selectFile(String bnum) {
		return sqlSession.selectOne(namespace+".bsfile", bnum);		
	}
	
	@Override //게시글 등록
	public int insert(Object obj) {
		DpBoardVO vo = (DpBoardVO)obj;
		return sqlSession.insert(namespace+".insert", vo);
	}

	@Override //페이징 처리
	public int execTotalCount() {
		return sqlSession.selectOne(namespace+".count");
	}

	@Override //게시글 리스트
	public List<Object> select(int startCount, int endCount) {
		Map param = new HashMap<String, String>();
		param.put("start", startCount);
		param.put("end", endCount);
		
		return sqlSession.selectList(namespace+".list", param);
	}

	@Override //조회수 업데이트
	public void updateHits(String bnum) {
		sqlSession.update(namespace+".update_hits", bnum);
		
	}

	@Override //게시글 상세보기
	public Object select(String bnum) {
		return sqlSession.selectOne(namespace+".content", bnum);
	}

	@Override //게시글 수정
	public int update(Object obj) {
		DpBoardVO vo = (DpBoardVO)obj;
		return sqlSession.update(namespace+".update", vo);
	}

	@Override //게시글 삭제
	public int delete(String bnum) {
		return sqlSession.delete(namespace+".delete", bnum);
	}

	@Override
	public List<Object> select(int startCount, int endCount, String cate) {
		// TODO Auto-generated method stub
		return null;
	}

}
