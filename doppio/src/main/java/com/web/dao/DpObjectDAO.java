package com.web.dao;

import java.util.List;

public interface DpObjectDAO {
	int insert(Object obj);
	int execTotalCount(); 
	List<Object> select(int startCount, int endCount); //list
	void updateHits(String num);
	Object select(String num);
	int update(Object obj);
	int delete(String num);
	String selectFile(String id);
}
