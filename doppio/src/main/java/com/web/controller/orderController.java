package com.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.dao.DpOrderDAO;
import com.web.service.DpOrderServiceImpl;
import com.web.service.DpPageServiceImpl;
import com.web.vo.DpCartVO;
import com.web.vo.DpOrderVO;

@Controller
public class orderController {
	
	@Autowired
	private DpOrderDAO orderDao;
	
	@Autowired
	private DpPageServiceImpl pageService;
	
	@Autowired
	private DpOrderServiceImpl orderService;
	
	
	
	
	
	//주문 내역
	@RequestMapping(value="/mypage/doppio_mypage_order_history.th", method=RequestMethod.GET)
	public ModelAndView order_list(String rpage) {
		ModelAndView mv = new ModelAndView();
		Map<String, String> param = pageService.getPageResult(rpage, "order_list", orderService);
		
		int startCount = Integer.parseInt(param.get("start"));
		int endCount = Integer.parseInt(param.get("end"));
		
		List<Object> olist = orderService.getListResult(startCount, endCount);
		ArrayList<DpOrderVO> list = new ArrayList<DpOrderVO>();
		
		for(Object obj : olist) {
			list.add((DpOrderVO)obj);
		}
		mv.addObject("list", list);
		mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
		mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
		mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
		
		mv.setViewName("/mypage/doppio_mypage_order_history");
		return mv;
	}
}
