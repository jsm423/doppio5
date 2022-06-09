package com.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.service.DpBoardServiceImpl;
import com.web.service.DpPageServiceImpl;
import com.web.service.DpRecipeServiceImpl;
import com.web.vo.DpBoardVO;
import com.web.vo.DpRecipeVO;



@Controller
public class MainController {
		
	
	@Autowired
	private DpBoardServiceImpl boardService;
	
	@Autowired
	private DpRecipeServiceImpl recipeService;
	
	@Autowired
	private DpPageServiceImpl pageService;
	
	@RequestMapping(value="/doppio_main", method=RequestMethod.GET)

	public ModelAndView doppio_main() {
		ModelAndView mv = new ModelAndView();		
		
		//Ŀ��
		List<Object> olist = recipeService.getListResult(1, 1, "cf");
		ArrayList<DpRecipeVO> klist = new ArrayList<DpRecipeVO>();
		for(Object obj : olist) {
			klist.add((DpRecipeVO)obj);
		}
		mv.addObject("klist", klist);
		mv.addObject("olist", olist);
		
		//��Ŀ��
		List<Object> alist = recipeService.getListResult(1, 1,"ncf");
		ArrayList<DpRecipeVO> nlist = new ArrayList<DpRecipeVO>();
		for(Object obj : alist) {
			nlist.add((DpRecipeVO)obj);
		}
		mv.addObject("nlist", nlist);
		mv.addObject("alist", alist);
		
		//����Ʈ
		List<Object> blist = recipeService.getListResult(1, 1,"de");
		ArrayList<DpRecipeVO> dlist = new ArrayList<DpRecipeVO>();
		for(Object obj : blist) {
			dlist.add((DpRecipeVO)obj);
		}
		mv.addObject("dlist", dlist);
		mv.addObject("alist", blist);
		
		
		//�Խ���
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
