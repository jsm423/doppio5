package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyPageController {
	
	@RequestMapping(value = "/mypage/doppio_mypage_info.th", method = RequestMethod.GET)
	public String doppio_mypage_info() {
		return "/mypage/doppio_mypage_info";
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
