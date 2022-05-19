package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.dao.DpPackageDAO;
import com.web.vo.DpPackageVO;

public class DpPackageServiceImpl implements DpPackageService {
	
	@Autowired
	private DpPackageDAO packageDao;
	
	@Override
	public int getInsertResult(Object obj) {
		DpPackageVO vo = (DpPackageVO)obj;
		return packageDao.insert(vo);
	}
	
	@Override
	public int getListCount() {
		return packageDao.execTotalCount();
	}
	
	@Override
	public void getUpdateHits(String bnum) {
		packageDao.updateHits(bnum);
	}
	
	@Override
	public List<Object> getListResult(int startCount, int endCount){
		return packageDao.select(startCount, endCount);
	}
	
	@Override
	public Object getContent(String bnum) {
		return packageDao.select(bnum);
	}
	
	@Override
	public int getUpdateResult(Object obj) {
		DpPackageVO vo = (DpPackageVO)obj;
		return packageDao.update(vo);
	}
	
	@Override public int getDeleteResult(String bnum) {
		return packageDao.delete(bnum);
	}
	
	@Override
	public String getFilename(String bnum) {
		return packageDao.selectFile(bnum);
	}

	@Override
	public List<Object> getListResult(int startCount, int endCount, String cate) {
		// TODO Auto-generated method stub
		return null;
	}
}
