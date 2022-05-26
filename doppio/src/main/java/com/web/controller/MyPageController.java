package com.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	//ȸ�� Ż�� ��û
	@ResponseBody
	@RequestMapping(value="/join_status.th", method=RequestMethod.GET)
	public String join_status(String mnum, String status) {
		int result = memberService.getStatusUpdate(mnum,status);
		
		return String.valueOf(result);
	}
	
	//ȸ������ ������ ��
	@RequestMapping(value = "/mypage/doppio_mypage_info.th", method = RequestMethod.GET)
	public ModelAndView doppio_mypage_info() {/* String mnum */
		ModelAndView mv = new ModelAndView();
		DpMemberVO vo = (DpMemberVO)memberService.getContent("m_24"); //mnum����

		mv.addObject("vo",vo);
		mv.setViewName("/mypage/doppio_mypage_info");
		return mv;
	}
	
	//ȸ������ ������ ó��
	@RequestMapping(value = "/mypage/doppio_mypage_info.th", method = RequestMethod.POST)
	public ModelAndView doppio_mypage_info(DpMemberVO vo, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = memberService.getUpdateResult(vo);
		
		if(result ==1) {
			mv.setViewName("redirect:/doppio_main.th");
		}else {
			//���������� ȣ��
		}

		return mv;
	}
	
	
	
	
	
	
	/*
	 * 		���������� - ��ٱ���
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
