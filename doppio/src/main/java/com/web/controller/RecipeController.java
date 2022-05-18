package com.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.service.DpPageServiceImpl;
import com.web.service.DpRecipeServiceImpl;
import com.web.vo.DpRecipeVO;
 

	@Controller
	public class RecipeController { 
		 
		@Autowired
		private DpRecipeServiceImpl recipeService;
		
		@Autowired
		private DpPageServiceImpl pageService;
	
		/*
		 * 		recipe_list_de
		 * */
		
		
		@RequestMapping(value="/recipe/recipe_list_de.th", method=RequestMethod.GET)
		public ModelAndView recipe_list(String rpage) {
			ModelAndView mv = new ModelAndView();
			Map<String, String> param = pageService.getPageResult2(rpage, "recipe", recipeService);
			int startCount = Integer.parseInt(param.get("start"));
			int endCount = Integer.parseInt(param.get("end"));
			List<Object> olist = recipeService.getListResult(startCount, endCount);
			ArrayList<DpRecipeVO> list = new ArrayList<DpRecipeVO>();
			for(Object obj : olist) {
				list.add((DpRecipeVO)obj);
			}
			mv.addObject("list", list);
			mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
			mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
			mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
			
			mv.setViewName("/recipe/recipe_list_de");
			return mv;
		}
		
		
		
		
		/*
		 * 		recipe_list_cf
		 * */
		
		@RequestMapping(value="/recipe/recipe_list_cf.th", method=RequestMethod.GET)
		public String recipe_list_cf() {
		
			return "/recipe/recipe_list_cf";
		}
		
		/*
		 * 		recipe_list_ncf
		 * */
		
		@RequestMapping(value="/recipe/recipe_list_ncf.th", method=RequestMethod.GET)
		public String recipe_list_ncf() {
		
			return "/recipe/recipe_list_ncf";
		}
		
		/*
		 * 		recipe_content_de
		 * */
		
		@RequestMapping(value="/recipe/recipe_content_de.th", method=RequestMethod.GET)
		public String recipe_content_de() {
		
			return "/recipe/recipe_content_de";
		}
		
		/*
		 * 		recipe_content_cf
		 * */
		
		@RequestMapping(value="/recipe/recipe_content_cf.th", method=RequestMethod.GET)
		public String recipe_content_cf() {
		
			return "/recipe/recipe_content_cf";
		}
		
		/*
		 * 		recipe_content_ncf
		 * */
		
		@RequestMapping(value="/recipe/recipe_content_ncf.th", method=RequestMethod.GET)
		public String recipe_content_ncf() {
		
			return "/recipe/recipe_content_ncf";
		}
		
	
		
		
			
	}
