package com.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.service.DpPackageServiceImpl;
import com.web.service.DpPageServiceImpl;
import com.web.vo.DpPackageVO;

@Controller
public class PackageController {
	
	@Autowired
	private DpPageServiceImpl pageService;
	
	@Autowired
	private DpPackageServiceImpl packageService;
	
	/*
	 * 		package_list_de
	 * */
	
	@RequestMapping(value="/package/package_list_de.th", method=RequestMethod.GET)
		public ModelAndView package_list_de(String rpage) {
			ModelAndView mv = new ModelAndView();
			Map<String, String> param = pageService.getPageResult2(rpage, "package_de", packageService);
			
			int startCount = Integer.parseInt(param.get("start"));
			int endCount = Integer.parseInt(param.get("end"));
			
			List<Object> olist = packageService.getListResult(startCount, endCount, "de");
			ArrayList<DpPackageVO> list = new ArrayList<DpPackageVO>();
			
			for(Object obj : olist) {
				list.add((DpPackageVO)obj);
			}
			mv.addObject("list", list);
			mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
			mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
			mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
			
			mv.setViewName("/package/package_list_de");
			return mv;
	}
	
	/*
	 * 		package_list_cf
	 * */
	
	@RequestMapping(value="/package/package_list_cf.th", method=RequestMethod.GET)
		public ModelAndView package_list_cf(String rpage) {
			ModelAndView mv = new ModelAndView();
			Map<String, String> param = pageService.getPageResult2(rpage, "package_cf", packageService);
			
			int startCount = Integer.parseInt(param.get("start"));
			int endCount = Integer.parseInt(param.get("end"));
			
			List<Object> olist = packageService.getListResult(startCount, endCount, "cf");
			ArrayList<DpPackageVO> list = new ArrayList<DpPackageVO>();
			
			for(Object obj : olist) {
				list.add((DpPackageVO)obj);
			}
			mv.addObject("list", list);
			mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
			mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
			mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
			
			mv.setViewName("/package/package_list_cf");
			return mv;
	}
	
	/*
	 * 		package_list_ncf
	 * */
	
	@RequestMapping(value="/package/package_list_ncf.th", method=RequestMethod.GET)
		public ModelAndView package_list_ncf(String rpage) {
			ModelAndView mv = new ModelAndView();
			Map<String, String> param = pageService.getPageResult2(rpage, "package_ncf", packageService);
			
			int startCount = Integer.parseInt(param.get("start"));
			int endCount = Integer.parseInt(param.get("end"));
			
			List<Object> olist = packageService.getListResult(startCount, endCount, "ncf");
			ArrayList<DpPackageVO> list = new ArrayList<DpPackageVO>();
			
			for(Object obj : olist) {
				list.add((DpPackageVO)obj);
			}
			mv.addObject("list", list);
			mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
			mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
			mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
			
			mv.setViewName("/package/package_list_ncf");
			return mv;
	}
	
	/*
	 * 		package_content_de
	 * */
	
	@RequestMapping(value="/package/package_content_de.th", method=RequestMethod.GET)
		public ModelAndView recipe_content_de(String pnum, String rno) {
		
			ModelAndView mv = new ModelAndView();
			packageService.getUpdateHits(pnum);
			DpPackageVO vo = (DpPackageVO)packageService.getContent(pnum);
			
			mv.addObject("pnum", pnum);
			mv.addObject("vo", vo);
			mv.addObject("rno", rno);
			mv.setViewName("/package/package_content_de");
			
			return mv;
	}
	
	/*
	 * 		package_content_cf
	 * */
	
	@RequestMapping(value="/package/package_content_cf.th", method=RequestMethod.GET)
		public ModelAndView recipe_content_cf(String pnum, String rno) {
		
			ModelAndView mv = new ModelAndView();
			packageService.getUpdateHits(pnum);
			DpPackageVO vo = (DpPackageVO)packageService.getContent(pnum);
			
			mv.addObject("pnum", pnum);
			mv.addObject("vo", vo);
			mv.addObject("rno", rno);
			mv.setViewName("/package/package_content_cf");
			
			return mv;
	}
	
	/*
	 * 		package_content_ncf
	 * */
	
	@RequestMapping(value="/package/package_content_ncf.th", method=RequestMethod.GET)
		public ModelAndView recipe_content_ncf(String pnum, String rno) {
			
			ModelAndView mv = new ModelAndView();
			packageService.getUpdateHits(pnum);
			DpPackageVO vo = (DpPackageVO)packageService.getContent(pnum);
			
			mv.addObject("pnum", pnum);
			mv.addObject("vo", vo);
			mv.addObject("rno", rno);
			mv.setViewName("/package/package_content_ncf");
			
			return mv;
	}
}
