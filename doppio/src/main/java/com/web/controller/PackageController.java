package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PackageController {
	
	/*
	 * 		package_list_de
	 * */
	
	@RequestMapping(value="/package/package_list_de.th", method=RequestMethod.GET)
	public String package_list_de() {
	
		return "/package/package_list_de";
	}
	
	/*
	 * 		package_list_cf
	 * */
	
	@RequestMapping(value="/package/package_list_cf.th", method=RequestMethod.GET)
	public String package_list_cf() {
	
		return "/package/package_list_cf";
	}
	
	/*
	 * 		package_list_ncf
	 * */
	
	@RequestMapping(value="/package/package_list_ncf.th", method=RequestMethod.GET)
	public String package_list_ncf() {
	
		return "/package/package_list_ncf";
	}
	
	/*
	 * 		package_content_de
	 * */
	
	@RequestMapping(value="/package/package_content_de.th", method=RequestMethod.GET)
	public String package_content_de() {
	
		return "/package/package_content_de";
	}
	
	/*
	 * 		package_content_cf
	 * */
	
	@RequestMapping(value="/package/package_content_cf.th", method=RequestMethod.GET)
	public String package_content_cf() {
	
		return "/package/package_content_cf";
	}
	
	/*
	 * 		package_content_ncf
	 * */
	
	@RequestMapping(value="/package/package_content_ncf.th", method=RequestMethod.GET)
	public String package_content() {
	
		return "/package/package_content_ncf";
	}
}
