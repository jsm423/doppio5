package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class orderController {
	
	@RequestMapping(value="/mypage/doppio_mypage_order_history.th", method=RequestMethod.GET)
	public String order_history() {
	
		return "/mypage/doppio_mypage_order_history";
	
	}
}
