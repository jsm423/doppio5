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
import com.web.service.DpCommentServiceImpl;
import com.web.service.DpPackageServiceImpl;
import com.web.service.DpPageServiceImpl;
import com.web.service.DpRecipeServiceImpl;
import com.web.service.FileServiceImpl;
import com.web.vo.DpCommentVO;
import com.web.vo.DpPackageVO;
import com.web.vo.DpRecipeVO;

@Controller
public class AdminController {
	
	@Autowired
	private DpRecipeServiceImpl recipeService;
	
	@Autowired
	private DpRecipeDAO recipeDao;
	
	@Autowired
	private DpPackageServiceImpl packageService;
	
	@Autowired
	private DpPageServiceImpl pageService;
	
	@Autowired
	private FileServiceImpl fileService;
	
	@Autowired
	private DpCommentServiceImpl commentService;
	
	
	@RequestMapping(value="/admin/admin.th", method=RequestMethod.GET)
	public String admin() {
	
		return "/admin/admin";
	}
	
	/* ������ ������ */
	//������ ����ó�� - Ŀ��
	@RequestMapping(value="/admin/admin_recipe/recipe_content_cf.th", method=RequestMethod.POST)
	public ModelAndView recipe_delete_cf(DpRecipeVO vo, HttpServletRequest request) throws Exception{
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
			mv.setViewName("redirect:/admin/admin_recipe/recipe_list_cf.th");
		}
		return mv;
		
	}
	//������ ����ó�� - ��Ŀ��
	@RequestMapping(value="/admin/admin_recipe/recipe_content_ncf.th", method=RequestMethod.POST)
	public ModelAndView recipe_delete_ncf(DpRecipeVO vo, HttpServletRequest request) throws Exception{
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
			mv.setViewName("redirect:/admin/admin_recipe/recipe_list_ncf.th");
		}
		return mv;
		
	}
	
	//������ ����ó�� - ����Ʈ
	@RequestMapping(value="/admin/admin_recipe/recipe_content_de.th", method=RequestMethod.POST)
	public ModelAndView recipe_delete_de(DpRecipeVO vo, HttpServletRequest request) throws Exception{
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
			mv.setViewName("redirect:/admin/admin_recipe/recipe_list_de.th");
		}
		return mv;
		
	}
	
	
	//������ ������Ʈ �� - Ŀ��
	@RequestMapping(value="/admin/admin_recipe/recipe_update_cf.th", method=RequestMethod.GET)
	public ModelAndView recipe_update_cf(String rnum, String rno) {
		ModelAndView mv = new ModelAndView();
		DpRecipeVO vo = (DpRecipeVO)recipeService.getContent(rnum);
		
		mv.addObject("vo",vo);
		mv.addObject("rno",rno);
		mv.setViewName("/admin/admin_recipe/recipe_update_cf");
		return mv;
	}
	
	//������ ������Ʈ �� - ��Ŀ��
	@RequestMapping(value="/admin/admin_recipe/recipe_update_ncf.th", method=RequestMethod.GET)
	public ModelAndView recipe_update_ncf(String rnum, String rno) {
		ModelAndView mv = new ModelAndView();
		DpRecipeVO vo = (DpRecipeVO)recipeService.getContent(rnum);
		
		mv.addObject("vo",vo);
		mv.addObject("rno",rno);
		mv.setViewName("/admin/admin_recipe/recipe_update_ncf");
		return mv;
	}
	
	//������ ������Ʈ �� - ����Ʈ
	@RequestMapping(value="/admin/admin_recipe/recipe_update_de.th", method=RequestMethod.GET)
	public ModelAndView recipe_update_de(String rnum, String rno) {
		ModelAndView mv = new ModelAndView();
		DpRecipeVO vo = (DpRecipeVO)recipeService.getContent(rnum);
		
		mv.addObject("vo",vo);
		mv.addObject("rno",rno);
		mv.setViewName("/admin/admin_recipe/recipe_update_de");
		return mv;
	}
	
	//������ ������Ʈ ó�� - Ŀ��
	@RequestMapping(value="/admin/admin_recipe/recipe_update_cf.th", method=RequestMethod.POST)
	public ModelAndView recipe_update_cf(DpRecipeVO vo, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		String oldFile = vo.getRsfile();
		vo = fileService.fileCheck(vo);
		
		int result = recipeService.getUpdateResult(vo); 
		if(result == 1) {
			fileService.fileSave(vo, request, oldFile);
			mv.setViewName("redirect:/admin/admin_recipe/recipe_list_cf.th");
		}else {
			//���������� ȣ��
		}
		
		return mv;
	}
		
	//������ ������Ʈ ó�� - ��Ŀ��
	@RequestMapping(value="/admin/admin_recipe/recipe_update_ncf.th", method=RequestMethod.POST)
	public ModelAndView recipe_update_ncf(DpRecipeVO vo, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		String oldFile = vo.getRsfile();
		vo = fileService.fileCheck(vo);
		
		int result = recipeService.getUpdateResult(vo); 
		if(result == 1) {
			fileService.fileSave(vo, request, oldFile);
			mv.setViewName("redirect:/admin/admin_recipe/recipe_list_ncf.th");
		}else {
			//���������� ȣ��
		}
		
		return mv;
	}
				
	//������ ������Ʈ ó�� - ����Ʈ
	@RequestMapping(value="/admin/admin_recipe/recipe_update_desert.th", method=RequestMethod.POST)
	public ModelAndView recipe_update_desert(DpRecipeVO vo, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		String oldFile = vo.getRsfile();
		vo = fileService.fileCheck(vo);
		
		int result = recipeService.getUpdateResult(vo); 
		if(result == 1) {
			fileService.fileSave(vo, request, oldFile);
			mv.setViewName("redirect:/admin/admin_recipe/recipe_list_desert.th");
		}else {
			//���������� ȣ��
		}
		
		return mv;
	}

	
	
	
	//������ ����� - Ŀ��
	@RequestMapping(value="/admin/admin_recipe/recipe_write_cf.th", method=RequestMethod.GET)
	public ModelAndView recipe_write_cf() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/admin_recipe/recipe_write_cf");
		return mv;
	}
	
	//������ ����� - ��Ŀ��
		@RequestMapping(value="/admin/admin_recipe/recipe_write_ncf.th", method=RequestMethod.GET)
		public ModelAndView recipe_write_ncf() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("/admin/admin_recipe/recipe_write_ncf");
			return mv;
		}
		
	//������ ����� - ����Ʈ
	@RequestMapping(value="/admin/admin_recipe/recipe_write_de.th", method=RequestMethod.GET)
	public ModelAndView recipe_write_de() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/admin/admin_recipe/recipe_write_de");
		return mv;
	}
	
	//������ ���ó�� - Ŀ��
	@RequestMapping(value="/admin/admin_recipe/recipe_write_cf.th", method=RequestMethod.POST)
	public String recipe_write_cf(DpRecipeVO vo, HttpServletRequest request) throws Exception{
		
		String result_page = "";
		
		vo = fileService.fileCheck(vo);
		int result = recipeService.getInsertResult(vo);
		
		if(result == 1) {
			fileService.fileSave(vo, request);
			result_page = "redirect:/admin/admin_recipe/recipe_list_cf.th";
		}else {
			//���������� ȣ��
		}
		return result_page;
	}	
	
		//������ ���ó�� - ��Ŀ��
		@RequestMapping(value="/admin/admin_recipe/recipe_write_ncf.th", method=RequestMethod.POST)
		public String recipe_write_ncf(DpRecipeVO vo, HttpServletRequest request) throws Exception{
			
			String result_page = "";
			
			vo = fileService.fileCheck(vo);
			int result = recipeService.getInsertResult(vo);
			
			if(result == 1) {
				fileService.fileSave(vo, request);
				result_page = "redirect:/admin/admin_recipe/recipe_list_ncf.th";
			}else {
				//���������� ȣ��
			}
			return result_page;
	}
		//������ ���ó�� - ����Ʈ
		@RequestMapping(value="/admin/admin_recipe/recipe_write_de.th", method=RequestMethod.POST)
		public String recipe_write_de(DpRecipeVO vo, HttpServletRequest request) throws Exception{
			
			String result_page = "";
			
			vo = fileService.fileCheck(vo);
			int result = recipeService.getInsertResult(vo);
			
			if(result == 1) {
				fileService.fileSave(vo, request);
				result_page = "redirect:/admin/admin_recipe/recipe_list_de.th";
			}else {
				//���������� ȣ��
			}
			return result_page;		
		
	}
		
		
	/*recipe_list ������ ����Ʈ  - ����Ʈ*/		
	@RequestMapping(value="/admin/admin_recipe/recipe_list_de.th", method=RequestMethod.GET)
	public ModelAndView recipe_list(String rpage) {
		ModelAndView mv = new ModelAndView();
		Map<String, String> param = pageService.getPageResult2(rpage, "recipe_de", recipeService);
		int startCount = Integer.parseInt(param.get("start"));
		int endCount = Integer.parseInt(param.get("end"));
		List<Object> olist = recipeService.getListResult(startCount, endCount, "de");
		ArrayList<DpRecipeVO> list = new ArrayList<DpRecipeVO>();
		for(Object obj : olist) {
			list.add((DpRecipeVO)obj);
		}
		mv.addObject("list", list);
		mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
		mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
		mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
		
		mv.setViewName("/admin/admin_recipe/recipe_list_de");
		return mv;
	}
	/*recipe_list ������ ����Ʈ - Ŀ��*/		
	@RequestMapping(value="/admin/admin_recipe/recipe_list_cf.th", method=RequestMethod.GET)
	public ModelAndView recipe_list_cf(String rpage) {
		ModelAndView mv = new ModelAndView();
		Map<String, String> param = pageService.getPageResult2(rpage, "recipe_cf", recipeService);
		int startCount = Integer.parseInt(param.get("start"));
		int endCount = Integer.parseInt(param.get("end"));
		List<Object> olist = recipeService.getListResult(startCount, endCount, "cf");
		ArrayList<DpRecipeVO> list = new ArrayList<DpRecipeVO>();
		for(Object obj : olist) {
			list.add((DpRecipeVO)obj);
		}
		mv.addObject("list", list);
		mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
		mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
		mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
		
		mv.setViewName("/admin/admin_recipe/recipe_list_cf");
		return mv;
	}
	/*recipe_list ������ ����Ʈ - ��Ŀ��*/		
	@RequestMapping(value="/admin/admin_recipe/recipe_list_ncf.th", method=RequestMethod.GET)
	public ModelAndView recipe_list_ncf(String rpage) {
		ModelAndView mv = new ModelAndView();
		Map<String, String> param = pageService.getPageResult2(rpage, "recipe_ncf", recipeService);
		int startCount = Integer.parseInt(param.get("start"));
		int endCount = Integer.parseInt(param.get("end"));
		List<Object> olist = recipeService.getListResult(startCount, endCount,"ncf");
		ArrayList<DpRecipeVO> list = new ArrayList<DpRecipeVO>();
		for(Object obj : olist) {
			list.add((DpRecipeVO)obj);
		}
		mv.addObject("list", list);
		mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
		mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
		mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
		
		mv.setViewName("/admin/admin_recipe/recipe_list_ncf");
		return mv;
	}
	
	//������ �������� - ����Ʈ
	@RequestMapping(value="/admin/admin_recipe/recipe_content_de.th", method=RequestMethod.GET)
	public ModelAndView recipe_content(String rnum, String rno) {
		ModelAndView mv = new ModelAndView();
		/* recipeService.getUpdateHits(rnum); */
		DpRecipeVO vo = (DpRecipeVO)recipeService.getContent(rnum);
		
		mv.addObject("rnum", rnum);
		mv.addObject("vo", vo);
		mv.addObject("rno", rno);
		mv.setViewName("/admin/admin_recipe/recipe_content_de");
		return mv;
	}
	
	//������ �������� - Ŀ��
		@RequestMapping(value="/admin/admin_recipe/recipe_content_cf.th", method=RequestMethod.GET)
		public ModelAndView recipe_content_cf(String rnum, String rno) {
			ModelAndView mv = new ModelAndView();
			/* recipeService.getUpdateHits(rnum); */
			DpRecipeVO vo = (DpRecipeVO)recipeService.getContent(rnum);
			
			mv.addObject("rnum", rnum);
			mv.addObject("vo", vo);
			mv.addObject("rno", rno);
			mv.setViewName("/admin/admin_recipe/recipe_content_cf");
			return mv;
		}
		
		//������ �������� - ��Ŀ��
		@RequestMapping(value="/admin/admin_recipe/recipe_content_ncf.th", method=RequestMethod.GET)
		public ModelAndView recipe_content_ncf(String rnum, String rno) {
			ModelAndView mv = new ModelAndView();
			/* recipeService.getUpdateHits(rnum); */
			DpRecipeVO vo = (DpRecipeVO)recipeService.getContent(rnum);
			
			mv.addObject("rnum", rnum);
			mv.addObject("vo", vo);
			mv.addObject("rno", rno);
			mv.setViewName("/admin/admin_recipe/recipe_content_ncf");
			return mv;
		}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/* ������ ��Ű�� */
		
		//��Ű�� ������Ʈ ��
		@RequestMapping(value="/admin/admin_package/package_update.th", method=RequestMethod.GET)
		public ModelAndView package_update(String pnum, String rno) {
				
				ModelAndView mv = new ModelAndView();
				DpPackageVO vo = (DpPackageVO)packageService.getContent(pnum);
					
				mv.addObject("vo",vo);
				mv.addObject("rno",rno);
				mv.setViewName("/admin/admin_package/package_update");
					
					return mv;
				}
		
		//��Ű�� ������Ʈ ó��
		@RequestMapping(value="/admin/admin_package/package_update.th", method=RequestMethod.POST)
		public ModelAndView recipe_package(DpPackageVO vo, HttpServletRequest request) throws Exception{
				ModelAndView mv = new ModelAndView();
				String oldFile = vo.getPsfile();
				vo = fileService.fileCheck(vo);
				
				int result = packageService.getUpdateResult(vo); 
				if(result == 1) {
					fileService.fileSave(vo, request, oldFile);
					mv.setViewName("redirect:/admin/admin_package/package_list.th");
				}else {
					//���������� ȣ��
				}
				
				return mv;
			}
	
		//��Ű�� �����
		@RequestMapping(value="/admin/admin_package/package_write.th", method=RequestMethod.GET)
		public ModelAndView package_write() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("/admin/admin_package/package_write");
			return mv;
		}
		
		//��Ű�� ���ó��
		@RequestMapping(value="/admin/admin_package/package_write.th", method=RequestMethod.POST)
		public String package_write(DpPackageVO vo, HttpServletRequest request) throws Exception{
			
			String result_page = "";
			
			vo = fileService.fileCheck(vo);
			int result = packageService.getInsertResult(vo);
			
			if(result == 1) {
				fileService.fileSave(vo, request);
				result_page = "redirect:/admin/admin_package/package_list.th";
			}else {
				//���������� ȣ��
			}
			return result_page;
		}
			
	
		//��Ű�� ����Ʈ
		@RequestMapping(value="/admin/admin_package/package_list.th", method=RequestMethod.GET)
	
		public ModelAndView package_list(String rpage) {
			ModelAndView mv = new ModelAndView();
			Map<String, String> param = pageService.getPageResult2(rpage, "package", packageService);
				
				int startCount = Integer.parseInt(param.get("start"));
				int endCount = Integer.parseInt(param.get("end"));
			
			List<Object> olist = packageService.getListResult(startCount, endCount);
			ArrayList<DpPackageVO> list = new ArrayList<DpPackageVO>();
			
			for(Object obj : olist) {
				list.add((DpPackageVO)obj);
			}
				mv.addObject("list", list);
				mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
				mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
				mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
			
				mv.setViewName("/admin/admin_package/package_list");
			return mv;
	}
		
		//��Ű�� �󼼺���
		@RequestMapping(value="/admin/admin_package/package_content.th", method=RequestMethod.GET)
		public ModelAndView package_content(String pnum, String rno) {
			ModelAndView mv = new ModelAndView();
			/* packageService.getUpdateHits(pnum); */
			DpPackageVO vo = (DpPackageVO)packageService.getContent(pnum);
			
			mv.addObject("pnum", pnum);
			mv.addObject("vo", vo);
			mv.addObject("rno", rno);
			mv.setViewName("/admin/admin_package/package_content");
			return mv;
		}
		
		//��Ű�� ����ó��
		@RequestMapping(value="/admin/admin_package/package_content.th", method=RequestMethod.POST)
		public ModelAndView package_delete(DpPackageVO vo, HttpServletRequest request) throws Exception{
			ModelAndView mv = new ModelAndView();
			String psfile = packageService.getFilename(vo.getPnum());
			int result = packageService.getDeleteResult(vo.getPnum());
			
			if(result == 1) {
				if(psfile != null) {
					String path = request.getSession().getServletContext().getRealPath("/");
					path += "resources\\upload\\";
					File file = new File(path + psfile);
					if(file.exists()) file.delete();
				}
				mv.setViewName("redirect:/admin/admin_package/package_list.th");
			}
			return mv;
		}
		
		
		
//		
//		
//		//��� ����� - Ŀ��
//		@RequestMapping(value="/admin/admin_recipe/recipe_write_cf.th", method=RequestMethod.GET)
//		public ModelAndView comment_write_cf() {
//			ModelAndView mv = new ModelAndView();
//			mv.setViewName("/admin/admin_recipe/recipe_write_cf");
//			return mv;
//		}
//		
//
//		//��� ��� ��� - Ŀ��
//		 @RequestMapping(value="/admin/admin_recipe/recipe_content_cf.th",method=RequestMethod.POST) 
//		 public ModelAndView comment_write_cf(DpCommentVO vo,	 HttpServletRequest request) throws Exception{
//		  
//			 ModelAndView mv = new ModelAndView();
//			 
//			 int result = commentService.getInsertResult(vo); 
//			 if(result == 1) {
//			 mv.setViewName("redirect:/admin/admin_recipe/recipe_content_cf.th"); 
//			 }else {
//			 //���������� 
//			 } return mv;
//		  
//		  }
//		
//		//��� ����Ʈ - Ŀ��
//		@RequestMapping(value = "/admin/admin_recipe/recipe_content_cf.th", method = RequestMethod.GET)
//		public ModelAndView comment_list_cf(String rpage) {
//			ModelAndView mv = new ModelAndView();
//			Map<String, String> param = pageService.getPageResult3(rpage, "comment", commentService);
//			int startCount = Integer.parseInt(param.get("start"));
//			int endCount = Integer.parseInt(param.get("end"));
//			List<Object> olist = commentService.getListResult(startCount, endCount);
//			ArrayList<DpCommentVO> list = new ArrayList<DpCommentVO>();
//			for (Object obj : olist) {
//				list.add((DpCommentVO) obj);
//			}
//
//			mv.addObject("list", list);
//			mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
//			mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
//			mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
//
//			mv.setViewName("/admin/admin_recipe/recipe_content_cf");
//			return mv;
//		}
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
}