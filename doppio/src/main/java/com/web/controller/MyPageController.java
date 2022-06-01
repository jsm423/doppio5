package com.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.dao.DpMemberDAO;
import com.web.service.DpCartServiceImpl;
import com.web.service.DpMemberServiceImpl;
import com.web.service.DpPageServiceImpl;
import com.web.vo.DpCartVO;
import com.web.vo.DpMemberVO;

@Controller
public class MyPageController {
	
	@Autowired
	private DpMemberServiceImpl memberService;
	
	@Autowired
	private DpCartServiceImpl cartService;
	
	@Autowired
	private DpPageServiceImpl pageService;
	
	@Autowired
	private DpMemberDAO memberDao;
	
	//회원 탈퇴 신청
	@ResponseBody
	@RequestMapping(value="/mypage/doppio_mypage_info_out.th", method=RequestMethod.POST)
	public Map<String,Object> join_status(@RequestBody String vo) throws JsonParseException, JsonMappingException, IOException {

		Map<String,Object> rMap = new HashMap<String,Object>();
		//ModelAndView mv = new ModelAndView();

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> param = mapper.readValue(vo, Map.class);
		
		System.out.println("out param ----> " + param);
		
		if(param.get("service").equals("infoOut")){
			param.put("mapperName","status1");						
		}else {
			param.put("mapperName","status2");
		}
		
		
		int s = memberDao.update(param);

		System.out.println("s ------->" +s);
		
		 if (s >= 1) {
			 
			 rMap.put("res", "success");
			  
		 }else {
			 
			 rMap.put("res", "fail");
		 }
		 
		 		
		
		return rMap;
	}
	
	
	//회원수정 페이지 폼
	@RequestMapping(value = "/mypage/doppio_mypage_info.th", method = RequestMethod.GET)
	public ModelAndView doppio_mypage_info(String mnum) {/* String mnum */
		ModelAndView mv = new ModelAndView();
		DpMemberVO vo = (DpMemberVO)memberService.getContent(mnum); //mnum기준

		mv.addObject("vo",vo);
		mv.setViewName("/mypage/doppio_mypage_info");
		return mv;
	}
	
	//회원수정 페이지 처리
	@RequestMapping(value = "/mypage/doppio_mypage_info.th", method = RequestMethod.POST)
	public ModelAndView doppio_mypage_info(DpMemberVO vo, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = memberService.getUpdateResult(vo);
		
		if(result ==1) {
			mv.setViewName("redirect:/doppio_main.th");
		}else {
			//에러페이지 호출
		}

		return mv;
	}
	
	
	

	
	/*
	 * 		장바구니 리스트 
	 * */
	
	@RequestMapping(value="/mypage/doppio_mypage_basket.th", method=RequestMethod.GET)
		public ModelAndView cart_list(String rpage) {
			ModelAndView mv = new ModelAndView();
			Map<String, String> param = pageService.getPageResult(rpage, "cart_list", cartService);
			
			int startCount = Integer.parseInt(param.get("start"));
			int endCount = Integer.parseInt(param.get("end"));
			
			List<Object> olist = cartService.getListResult(startCount, endCount);
			ArrayList<DpCartVO> list = new ArrayList<DpCartVO>();
			
			for(Object obj : olist) {
				list.add((DpCartVO)obj);
			}
			mv.addObject("list", list);
			mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
			mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
			mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
			
			mv.setViewName("/mypage/doppio_mypage_basket");
			return mv;
	}
	
	
	/* 장바구니 삭제 */
	@ResponseBody
	@RequestMapping(value = "/mypage/doppio_mypage_basketDelete.th", method = RequestMethod.POST)
	public String qna_delete(
		@RequestParam(value="list[]") List<String> list) {

		String result = "fail";
		
		//list에 담겨진 데이터를 서비스와 매퍼를 이용하여 DB에서 삭제하고 그 결과가 참이면 result를 리턴합니다.
		
		/*
		 * System.out.println(1111); System.out.println(list.size());
		 * 
		 * for(String canum : list){ System.out.println(canum); }
		 */

		return result;

	}
	
	/* error */
	@RequestMapping(value = "/doppio_error.th", method = RequestMethod.GET)
	public String doppio_error() {
		return "/doppio_error"; 
	}
}
