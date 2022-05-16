package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

	@RequestMapping(value="/admin/admin.th", method=RequestMethod.GET)
	public String admin() {
	
		return "/admin/admin";
	}
	
	/* 관리자 레시피 */
	@RequestMapping(value="/admin/admin_recipe/recipe_update.th", method=RequestMethod.GET)
	public String recipe_update() {
		return "/admin/admin_recipe/recipe_update";
	}
	@RequestMapping(value="/admin/admin_recipe/recipe_write.th", method=RequestMethod.GET)
	public String recipe_write() {
		return "/admin/admin_recipe/recipe_write";
	}
	@RequestMapping(value="/admin/admin_recipe/recipe_list.th", method=RequestMethod.GET)
	public String recipe_list() {
		return "/admin/admin_recipe/recipe_list";
	}
	@RequestMapping(value="/admin/admin_recipe/recipe_content.th", method=RequestMethod.GET)
	public String recipe_content() {
		return "/admin/admin_recipe/recipe_content";
	}
	
	
	/* 관리자 패키지 */
	@RequestMapping(value="/admin/admin_package/package_update.th", method=RequestMethod.GET)
	public String package_update() {
		return "/admin/admin_package/package_update";
	}
	@RequestMapping(value="/admin/admin_package/package_write.th", method=RequestMethod.GET)
	public String package_write() {
		return "/admin/admin_package/package_write";
	}
	@RequestMapping(value="/admin/admin_package/package_list.th", method=RequestMethod.GET)
	public String package_list() {
		return "/admin/admin_package/package_list";
	}
	@RequestMapping(value="/admin/admin_package/package_content.th", method=RequestMethod.GET)
	public String package_content() {
		return "/admin/admin_package/package_content";
	}
}