package com.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.dao.DpQnaDAO;
import com.web.service.DpPageServiceImpl;
import com.web.service.DpQnaServiceImpl;
import com.web.vo.DpQnaVO;

@Controller
public class QnaController {
	
	@Autowired
	private DpQnaServiceImpl qnaService;
	
	@Autowired
	private DpQnaDAO qnaDao;
	
	@Autowired
	private DpPageServiceImpl pageService;
	
	
	//qna 등록폼
		@RequestMapping(value="/qna/qna_write.th", method=RequestMethod.GET)
		public ModelAndView qna_write() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("/qna/qna_write");
			return mv;
		}
	//qna 등록처리
		@RequestMapping(value="/qna/qna_write.th", method=RequestMethod.POST)
		public ModelAndView qna_write(DpQnaVO vo, HttpServletRequest request)
																throws Exception{
			
			ModelAndView mv = new ModelAndView();
			
			int result = qnaService.getInsertResult(vo);
			if(result == 1) {
				mv.setViewName("redirect:/qna/qna_list.th");
			}else {
				//에러페이지
			}
			
			return mv;
		}
		
	//qna 리스트
	@RequestMapping(value="/qna/qna_list.th", method=RequestMethod.GET)
	public ModelAndView qna_lis(String rpage) {
		ModelAndView mv = new ModelAndView();
		
		Map<String, String> param = pageService.getPageResult(rpage, "qna", qnaService);
		int startCount = Integer.parseInt(param.get("start"));
		int endCount = Integer.parseInt(param.get("end"));
		
		List<Object> olist = qnaService.getListResult(startCount, endCount);
		ArrayList<DpQnaVO> list = new ArrayList<DpQnaVO>();
		for(Object obj : olist) {
			list.add((DpQnaVO)obj);
		}
		
		mv.addObject("list", list);
		mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
		mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
		mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
		
		mv.setViewName("/qna/qna_list");
		return mv;
	}
	
	
	
	//qna 수정폼
	@RequestMapping(value="/qna/qna_update.th", method=RequestMethod.GET)
	public ModelAndView qna_update(String qnum, String rno) {
		ModelAndView mv = new ModelAndView();
		DpQnaVO vo = (DpQnaVO)qnaService.getContent(qnum);
		
		mv.addObject("vo",vo);
		mv.addObject("rno",rno);
		mv.setViewName("/qna/qna_update");
		
		return mv;
	}
	
	//qna 수정(업데이트)처리
	@RequestMapping(value="/qna/qna_update.th", method=RequestMethod.POST)
	public ModelAndView qna_update(DpQnaVO vo, HttpServletRequest request) throws Exception{
		
		
		ModelAndView mv = new ModelAndView();
		int result = qnaService.getUpdateResult(vo);

		System.out.println("update qunum ------ " + vo.getId());
		
		
		if(result == 1) {
			mv.setViewName("redirect:/qna/qna_list.th");
		}else {
			//에러페이지 호출
		}
		
		return mv;
	}
	
	
	
	
	
	//qna 상세내용 
	@RequestMapping(value="/qna/qna_content.th", method=RequestMethod.GET)
	public ModelAndView qna_content(String qnum, String rno) {
		ModelAndView mv = new ModelAndView();
		qnaService.getUpdateHits(qnum);
		DpQnaVO vo = (DpQnaVO)qnaService.getContent(qnum);
		
		mv.addObject("vo", vo);
		mv.addObject("rno", rno);
		mv.setViewName("/qna/qna_content");
		return mv;
	}
	
	
	// qna 글 삭제
	@RequestMapping(value="/qna/qna_content.th", method=RequestMethod.POST)
	public ModelAndView qna_delete(DpQnaVO vo, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = qnaService.getDeleteResult(vo.getQnum());
		if(result == 1) {
			mv.setViewName("redirect:/qna/qna_list.th");
		}else {
			//에러페이지 호출
		}
		
		return mv;
		
	}
	
	
	
	
	
	
	
	
}
