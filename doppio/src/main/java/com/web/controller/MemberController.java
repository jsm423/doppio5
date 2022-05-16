package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@RequestMapping(value="/member.th", method=RequestMethod.GET)
	public String member_list() {
		return "/admin/member/member_list";
	}
	
	@RequestMapping(value="/member_content.th", method=RequestMethod.GET)
	public String member_content() {
		return "/admin/member/member_content";
	}
}
