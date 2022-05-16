package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.service.DpMemberServiceImpl;
import com.web.vo.DpMemberVO;

@Controller
public class LoginController {
	
	@Autowired
	private DpMemberServiceImpl memberService;
	
	/**
	 * 로그인 화면
	 */	
	@RequestMapping(value = "/login/doppio_login.th", method = RequestMethod.GET)
	public String doppio_login() {
		return "/login/doppio_login";    
	}
	
	
	/**
	 * 로그인 처리
	 */
	@RequestMapping(value="/login/doppio_login.th", method=RequestMethod.POST)
	public ModelAndView login(DpMemberVO vo) {
		ModelAndView mv = new ModelAndView();
		int result = memberService.getLoginResult(vo);
		
		if(result == 1) {
			mv.addObject("login_result", "succ");
			mv.setViewName("doppio_main");
		}else {
			mv.addObject("login_result","fail");
			mv.setViewName("/login/doppio_login");
		}
		return mv;
	}
	
	
	
	
	
	
	
	
	
}
