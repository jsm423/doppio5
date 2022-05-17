package com.web.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.dao.DpRecipeDAO;
import com.web.service.DpPageServiceImpl;
import com.web.service.DpRecipeServiceImpl;
import com.web.service.FileServiceImpl;
import com.web.vo.DpRecipeVO;

@Controller
public class AdminController {
	
	@Autowired
	private DpRecipeServiceImpl recipeService;
	
	@Autowired
	private DpRecipeDAO recipeDao;
	
	@Autowired
	private DpPageServiceImpl pageService;
	
	@Autowired
	private FileServiceImpl fileService;
	
	
	@RequestMapping(value="/admin/admin.th", method=RequestMethod.GET)
	public String admin() {
	
		return "/admin/admin";
	}
	
	/* 관리자 레시피 */
	//레시피 삭제처리
	@RequestMapping(value="/admin/admin_recipe/recipe_content.th", method=RequestMethod.POST)
	public ModelAndView recipe_delete(DpRecipeVO vo, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		String rsfile = recipeService.getFilename(vo.getRnum());
		int result = recipeService.getDeleteResult(vo.getRnum());
		
		if(result == 1) {
			if(rsfile != null) {
				String path = request.getSession().getServletContext().getRealPath("/");
				path += "resources\\upload\\";
				File file = new File(path + rsfile);
				if(file.exists()) file.delete();
			}
			mv.setViewName("redirect:/admin/admin_recipe/recipe_list.th");
		}
		return mv;
		
	}
	
	
	//레시피 업데이트 폼
	@RequestMapping(value="/admin/admin_recipe/recipe_update.th", method=RequestMethod.GET)
	public ModelAndView recipe_update(String rnum, String rno) {
		ModelAndView mv = new ModelAndView();
		DpRecipeVO vo = (DpRecipeVO)recipeService.getContent(rnum);
		
		mv.addObject("vo",vo);
		mv.addObject("rno",rno);
		mv.setViewName("/admin/admin_recipe/recipe_update");
		return mv;
	}
	
	//레시피 업데이트 처리
		@RequestMapping(value="/admin/admin_recipe/recipe_update.th", method=RequestMethod.POST)
		public ModelAndView recipe_update(DpRecipeVO vo, HttpServletRequest request) throws Exception{
			ModelAndView mv = new ModelAndView();
			String oldFile = vo.getRsfile();
			vo = fileService.fileCheck(vo);
			
			int result = recipeService.getUpdateResult(vo); 
			if(result == 1) {
				fileService.fileSave(vo, request, oldFile);
				mv.setViewName("redirect:/admin/admin_recipe/recipe_list.th");
			}else {
				//에러페이지 호출
			}
			
			return mv;
		}
	
	//레시피 등록폼
	@RequestMapping(value="/admin/admin_recipe/recipe_write.th", method=RequestMethod.GET)
	public ModelAndView recipe_write() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/admin_recipe/recipe_write");
		return mv;
	}
	
	//레시피 등록처리
	@RequestMapping(value="/admin/admin_recipe/recipe_write.th", method=RequestMethod.POST)
	public String recipe_write(DpRecipeVO vo, HttpServletRequest request) throws Exception{
		
		String result_page = "";
		
		vo = fileService.fileCheck(vo);
		int result = recipeService.getInsertResult(vo);
		
		if(result == 1) {
			fileService.fileSave(vo, request);
			result_page = "redirect:/admin/admin_recipe/recipe_list.th";
		}else {
			//에러페이지 호출
		}
		return result_page;
		
		
		
	}
	/*recipe_list 레시피 리스트*/		
	@RequestMapping(value="/admin/admin_recipe/recipe_list.th", method=RequestMethod.GET)
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
		
		mv.setViewName("/admin/admin_recipe/recipe_list");
		return mv;
	}
	
	
	@RequestMapping(value="/admin/admin_recipe/recipe_content.th", method=RequestMethod.GET)
	public ModelAndView recipe_content(String rnum, String rno) {
		ModelAndView mv = new ModelAndView();
		recipeService.getUpdateHits(rnum);
		DpRecipeVO vo = (DpRecipeVO)recipeService.getContent(rnum);
		
		mv.addObject("rnum", rnum);
		mv.addObject("vo", vo);
		mv.addObject("rno", rno);
		mv.setViewName("/admin/admin_recipe/recipe_content");
		return mv;
	}
	
	
	/* 관리자 패키지 */
	@RequestMapping(value="/admin/admin_package/package_update.th", method=RequestMethod.GET)
	public String package_update() {
		return "/admin/admin_package/package_update";
	}
	@RequestMapping(value="/admin/admin_package/package_write.th", method=RequestMethod.GET)
	public String package_write() {
		return "/admin/admin_package/package_write";
	}
	@RequestMapping(value="/admin/admin_package/package_list.th", method=RequestMethod.GET)
	public String package_list() {
		return "/admin/admin_package/package_list";
	}
	@RequestMapping(value="/admin/admin_package/package_content.th", method=RequestMethod.GET)
	public String package_content() {
		return "/admin/admin_package/package_content";
	}
}