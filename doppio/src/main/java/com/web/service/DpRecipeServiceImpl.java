package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.DpRecipeDAO;
import com.web.vo.DpRecipeVO;

public class DpRecipeServiceImpl implements DpRecipeService{
	@Autowired
	private DpRecipeDAO recipeDao;
	
	@Override
	public String getFilename(String rnum) {
		return recipeDao.selectFile(rnum);
	}
	
	@Override
	public int getListCount() {
		return recipeDao.execTotalCount();
	}
	
	@Override
	public void getUpdateHits(String rnum) {
		recipeDao.updateHits(rnum);
	}
	
	@Override
	public List<Object> getListResult(int startCount, int endCount){
		return recipeDao.select(startCount, endCount);
	}
	
	@Override
	public int getInsertResult(Object obj) {
		DpRecipeVO vo = (DpRecipeVO)obj;
		return recipeDao.insert(vo);
	}
	
	@Override
	public Object getContent(String rnum) {
		return recipeDao.select(rnum);
	}
	
	@Override
	public int getUpdateResult(Object obj) {
		DpRecipeVO vo = (DpRecipeVO)obj;
		return recipeDao.update(vo);
	}
	
	@Override
	public int getDeleteResult(String rnum) {
		return recipeDao.delete(rnum);
	}

	@Override
	public List<Object> getListResult(int startCount, int endCount, String cate) {
		return recipeDao.select(startCount, endCount, cate);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
