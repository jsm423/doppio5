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

import com.web.dao.DpBoardDAO;
import com.web.service.DpBoardServiceImpl;
import com.web.service.DpPageServiceImpl;
import com.web.service.FileServiceImpl;
import com.web.vo.DpBoardVO;
import com.web.vo.DpQnaVO;

@Controller
public class BoardController {

	@Autowired
	private DpBoardServiceImpl boardService;
	
	@Autowired
	private DpBoardDAO boardDao;
	
	@Autowired
	private DpPageServiceImpl pageService;
	
	@Autowired
	private FileServiceImpl fileService;
	
	//게시글 리스트
	@RequestMapping(value="/board/board_list.th", method=RequestMethod.GET)
		public ModelAndView board_lis(String rpage) {
			ModelAndView mv = new ModelAndView();
			
			Map<String, String> param = pageService.getPageResult(rpage, "board", boardService);
			int startCount = Integer.parseInt(param.get("start"));
			int endCount = Integer.parseInt(param.get("end"));
			
			List<Object> olist = boardService.getListResult(startCount, endCount);
			ArrayList<DpBoardVO> list = new ArrayList<DpBoardVO>();
			for(Object obj : olist) {
				list.add((DpBoardVO)obj);
			}
			
			mv.addObject("list", list);
			mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
			mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
			mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
			
			mv.setViewName("/board/board_list");
			return mv;
	}
	
	//게시글 상세보기
	@RequestMapping(value="/board/board_content.th", method=RequestMethod.GET)
		public ModelAndView board_content(String bnum, String rno) {
			ModelAndView mv = new ModelAndView();
			boardService.getUpdateHits(bnum);
			DpBoardVO vo = (DpBoardVO)boardService.getContent(bnum);
			
			mv.addObject("bnum", bnum);
			mv.addObject("vo", vo);
			mv.addObject("rno", rno);
			mv.setViewName("/board/board_content");
			return mv;
	}
	
	//게시글 등록폼
			@RequestMapping(value="/board/board_write.th", method=RequestMethod.GET)
			public ModelAndView board_write() {
				ModelAndView mv = new ModelAndView();
				mv.setViewName("/board/board_write");
				return mv;
			}
	
	//게시글 등록 처리
	@RequestMapping(value="/board/board_write.th", method=RequestMethod.POST)
		public String board_write(DpBoardVO vo, HttpServletRequest request) throws Exception{
				
				String result_page = "";		
				
				vo = fileService.fileCheck(vo);
				int result = boardService.getInsertResult(vo);
				
				if(result == 1) {
					fileService.fileSave(vo,request);					
					result_page = "redirect:board_list.th";
					
				}else {
					//에러페이지 호출
				}		
				
				return result_page;
	}
	
	
	//게시글 수정폼
	@RequestMapping(value="/board/board_update.th", method=RequestMethod.GET)
		public ModelAndView board_update(String bnum, String rno) {
			ModelAndView mv = new ModelAndView();
			DpBoardVO vo = (DpBoardVO)boardService.getContent(bnum);
			
			mv.addObject("vo",vo);
			mv.addObject("rno",rno);
			mv.setViewName("/board/board_update");
			
			return mv;
	}
	
	//게시글 수정 처리
	@RequestMapping(value="/board/board_update.th", method=RequestMethod.POST)
		public ModelAndView board_update(DpBoardVO vo, HttpServletRequest request) throws Exception{
		
			ModelAndView mv = new ModelAndView();
			String oldFile = vo.getBsfile();
			
			vo = fileService.fileCheck(vo);
			
			int result = boardService.getUpdateResult(vo);
	
			System.out.println("update bnum ------ " + vo.getId());
			
			if(result == 1) {
				fileService.fileSave(vo, request, oldFile);
				mv.setViewName("redirect:/board/board_list.th");
			}else {
				//에러페이지 호출
			}
			
			return mv;
	}
//		//게시글 삭제
//		@RequestMapping(value="/board/board_content.th", method=RequestMethod.GET)
//		public ModelAndView board_delete(String bnum, String rno) {
//			ModelAndView mv = new ModelAndView();
//			mv.addObject("bnum", bnum);
//			mv.addObject(rno);
//			mv.setViewName("/board/board_list.th");
//			
//			return mv;
//		}
	
		//게시글 삭제처리
		@RequestMapping(value="/board/board_content.th", method=RequestMethod.POST)
		public ModelAndView board_delete(DpBoardVO vo, HttpServletRequest request)
														throws Exception{
			ModelAndView mv = new ModelAndView();
			String bsfile = boardService.getFilename(vo.getBnum());
			int result = boardService.getDeleteResult(vo.getBnum());
		
			if(result == 1) {
				if(bsfile != null) {
					String path = request.getSession().getServletContext().getRealPath("/");
					path += "resources\\upload\\";
					File file = new File(path + bsfile);
					if(file.exists()) file.delete();
				}
				mv.setViewName("redirect:/board/board_list.th");			
			}else {
				//에러페이지 호출
			}		
			
			return mv;
	}
}
