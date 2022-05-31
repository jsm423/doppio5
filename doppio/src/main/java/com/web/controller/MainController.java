package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.service.DpBoardServiceImpl;
import com.web.service.DpPageServiceImpl;



@Controller
public class MainController {
		
	@Autowired
	private DpPageServiceImpl pageService;
	
	@Autowired
	private DpBoardServiceImpl boardService;
	
	@RequestMapping(value="/doppio_main", method=RequestMethod.GET)
//	public ModelAndView board_lis(String rpage) {
//		ModelAndView mv = new ModelAndView();
//		
//		Map<String, String> param = pageService.getPageResult(rpage, "main", boardService);
//		int startCount = Integer.parseInt(param.get("start"));
//		int endCount = Integer.parseInt(param.get("end"));
//		
//		List<Object> olist = boardService.getListResult(startCount, endCount);
//		ArrayList<DpBoardVO> list = new ArrayList<DpBoardVO>();
//		for(Object obj : olist) {
//			list.add((DpBoardVO)obj);
//		}
//		
//		mv.addObject("list", list);
//		mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
//		mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
//		mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
//		
//		mv.setViewName("/doppio_main");
//		return mv;
//	
	
	
	public ModelAndView doppio_main() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("/doppio_main");
		return mv;
	}
	
	
	
}
