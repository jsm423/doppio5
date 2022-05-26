package com.web.controller;

import javax.servlet.http.HttpSession;

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
	public ModelAndView doppio_login(String auth_result) {
		ModelAndView mv = new ModelAndView("/login/doppio_login");
		mv.addObject("auth_result", auth_result);
		return mv;    
	}
	
	
	/**
	 * 로그인 처리
	 */
	@RequestMapping(value="/login/doppio_login.th", method=RequestMethod.POST)
	public ModelAndView login(DpMemberVO vo, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		int result = memberService.getLoginResult(vo);
		
		if(result == 1) {
			session.setAttribute("sid",vo.getId());
			
			mv.addObject("login_result", "succ");
			mv.setViewName("doppio_main");
		}else {
			mv.addObject("login_result","fail");
			mv.setViewName("/login/doppio_login");
		}
		return mv;
	}
	
	/**
	 * 로그아웃 처리
	 */
	@RequestMapping(value="/login/doppio_logout.th", method=RequestMethod.GET)
	public ModelAndView logout(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		String sid = (String)session.getAttribute("sid");
		
		if(sid != null) {
			session.invalidate();
			mv.addObject("sid", sid);
			
			mv.addObject("logout_result", "succ");
		}
		mv.setViewName("/doppio_main");
		
		return mv;
	}
	
	
	
	
	
	
	
}
