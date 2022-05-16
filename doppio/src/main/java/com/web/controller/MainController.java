package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value="/doppio_main.th", method=RequestMethod.GET)
	public String doppio_main() {
		return "/doppio_main";
	}
}
