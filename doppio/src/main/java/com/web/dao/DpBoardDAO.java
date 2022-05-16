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

	@Override //bs����
	public String selectFile(String bnum) {
		return sqlSession.selectOne(namespace+".bsfile", bnum);		
	}
	
	@Override //�Խñ� ���
	public int insert(Object obj) {
		DpBoardVO vo = (DpBoardVO)obj;
		return sqlSession.insert(namespace+".insert", vo);
	}

	@Override //����¡ ó��
	public int execTotalCount() {
		return sqlSession.selectOne(namespace+".count");
	}

	@Override //�Խñ� ����Ʈ
	public List<Object> select(int startCount, int endCount) {
		Map param = new HashMap<String, String>();
		param.put("start", startCount);
		param.put("end", endCount);
		
		return sqlSession.selectList(namespace+".list", param);
	}

	@Override //��ȸ�� ������Ʈ
	public void updateHits(String bnum) {
		sqlSession.update(namespace+".update_hits", bnum);
		
	}

	@Override //�Խñ� �󼼺���
	public Object select(String bnum) {
		return sqlSession.selectOne(namespace+".content", bnum);
	}

	@Override //�Խñ� ����
	public int update(Object obj) {
		DpBoardVO vo = (DpBoardVO)obj;
		return sqlSession.update(namespace+".update", vo);
	}

	@Override //�Խñ� ����
	public int delete(String bnum) {
		return sqlSession.delete(namespace+".delete", bnum);
	}

}