package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.web.dao.DpMemberDAO;
import com.web.service.DpMemberServiceImpl;
import com.web.vo.DpMemberVO;

@Controller
public class JoinController {
	
	@Autowired
	private DpMemberServiceImpl memberService;
	
	@Autowired
	private DpMemberDAO memberDao;
	
	/**
	 * 회원가입 화면 
	 */
	@RequestMapping(value = "/join/doppio_join.th", method = RequestMethod.GET)
	public String doppio_join() {
		return "/join/doppio_join";
	}
	
	/**
	 * 회원가입 처리
	 */
	@RequestMapping(value="/join/doppio_join.th", method = RequestMethod.POST)
	public ModelAndView Join(DpMemberVO vo) {
		ModelAndView mv = new ModelAndView();
		int result = memberService.getInsertResult(vo);
		
		if(result == 1) {
			mv.addObject("join_result","succ");
			mv.setViewName("/login/doppio_login");
		}else {
			//에러페이지
		}
		return mv;
	
	}	
	
	/**
	 * 아이디 중복체크 처리
	 */
	@ResponseBody
	@RequestMapping(value="/join/idCheck.th", method=RequestMethod.GET)
	public String idCheck(String id) {
		int result = memberService.getIdCheckResult(id);
		
		return String.valueOf(result);
	}
	
		
		
		
}
