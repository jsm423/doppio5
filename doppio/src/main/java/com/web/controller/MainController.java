package com.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.service.DpBoardServiceImpl;
import com.web.service.DpPageServiceImpl;
import com.web.vo.DpBoardVO;



@Controller
public class MainController {
		
	@Autowired
	private DpPageServiceImpl pageService;
	
	@Autowired
	private DpBoardServiceImpl boardService;
	
	@RequestMapping(value="/doppio_main", method=RequestMethod.GET)

	public ModelAndView doppio_main() {
		ModelAndView mv = new ModelAndView();
		
		
		List<Object> vo  = boardService.getListResult(1, 3);
		ArrayList<DpBoardVO> list = new ArrayList<DpBoardVO>();
		for(Object obj : vo) {
			list.add((DpBoardVO)obj);
		}
		
		mv.addObject("list", list);
		mv.addObject("vo", vo);
		mv.setViewName("/doppio_main");
		return mv;
	}
	
	
	
}
