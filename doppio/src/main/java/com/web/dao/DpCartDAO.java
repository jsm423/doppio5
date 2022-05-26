package com.web.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.vo.DpCartVO;

public class DpCartDAO implements DpObjectDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String namespace="mapper.cart";
	
	//장바구니 추가
		@Override
		public int insert(Object obj) {
			return 0;			
		}
	
		@Override
		public int insert(Map<String, Object> param) {
			
			return sqlSession.insert(namespace+".insert", param);
		}
	
		@Override
		public int execTotalCount() {
			// TODO Auto-generated method stub
			return 0;
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
	
		@Override
		public List<Object> select(int startCount, int endCount) {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public List<Object> select(int startCount, int endCount, String cate) {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public void updateHits(String num) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public Object select(String num) {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public int update(Object obj) {
			// TODO Auto-generated method stub
			return 0;
		}
	
		@Override
		public int delete(String num) {
			// TODO Auto-generated method stub
			return 0;
		}
	
		@Override
		public String selectFile(String id) {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public List<Object> select1(int startCount, int endCount, String num) {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public List<Object> oplist(String popid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int update(Map<String, Object> param) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int delete(Map<String, Object> param) {
			// TODO Auto-generated method stub
			return 0;
		}

}
