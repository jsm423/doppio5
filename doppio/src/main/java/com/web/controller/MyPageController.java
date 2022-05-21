package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.web.service.DpMemberServiceImpl;
import com.web.vo.DpMemberVO;

@Controller
public class MyPageController {
	
	@Autowired
	private DpMemberServiceImpl memberService;
	
	//회원 탈퇴 신청
	@ResponseBody
	@RequestMapping(value="/join_status.th", method=RequestMethod.GET)
	public String join_status(String mnum, String status) {
		int result = memberService.getStatusUpdate(mnum,status);
		
		return String.valueOf(result);
	}
	
	//회원수정 페이지
	@RequestMapping(value = "/mypage/doppio_mypage_info.th", method = RequestMethod.GET)
	public ModelAndView doppio_mypage_info() {
		ModelAndView mv = new ModelAndView();
		DpMemberVO vo = (DpMemberVO)memberService.getContent("m_101"); //mnum기준
		
		mv.addObject("vo",vo);
		mv.setViewName("/mypage/doppio_mypage_info");
		return mv;
	}
	
	/*
	 * 		마이페이지 - 장바구니
	 * */
	@RequestMapping(value = "/mypage/doppio_mypage_basket.th", method = RequestMethod.GET)
	public String doppio_mypage_basket() {
		return "/mypage/doppio_mypage_basket"; 
	}
	
	/* error */
	@RequestMapping(value = "/doppio_error.th", method = RequestMethod.GET)
	public String doppio_error() {
		return "/doppio_error"; 
	}
}
