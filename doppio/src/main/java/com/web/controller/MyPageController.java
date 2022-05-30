package com.web.controller;

import java.io.IOException;
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

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.dao.DpMemberDAO;
import com.web.service.DpCartServiceImpl;
import com.web.service.DpMemberServiceImpl;
import com.web.service.DpPageServiceImpl;
import com.web.vo.DpCartVO;
import com.web.vo.DpMemberVO;

@Controller
public class MyPageController {
	
	@Autowired
	private DpMemberServiceImpl memberService;
	
	@Autowired
	private DpCartServiceImpl cartService;
	
	@Autowired
	private DpPageServiceImpl pageService;
	
	@Autowired
	private DpMemberDAO memberDao;
	
	//ȸ�� Ż�� ��û
	@ResponseBody
	@RequestMapping(value="/mypage/doppio_mypage_info_out.th", method=RequestMethod.POST)
	public ModelAndView join_status(@RequestBody String vo, HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {
		ModelAndView mv = new ModelAndView();

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> param = mapper.readValue(vo, Map.class);
		
		System.out.println("out param ----> " + param);
		
		int s = memberDao.update(param);

		/*
		 * if (s >= 1) { mv.setViewName("/mypage/doppio_mypage_info"); }
		 */		
		
		return mv;
	}
	
	//ȸ������ ������ ��
	@RequestMapping(value = "/mypage/doppio_mypage_info.th", method = RequestMethod.GET)
	public ModelAndView doppio_mypage_info(String mnum) {/* String mnum */
		ModelAndView mv = new ModelAndView();
		DpMemberVO vo = (DpMemberVO)memberService.getContent(mnum); //mnum����

		mv.addObject("vo",vo);
		mv.setViewName("/mypage/doppio_mypage_info");
		return mv;
	}
	
	//ȸ������ ������ ó��
	@RequestMapping(value = "/mypage/doppio_mypage_info.th", method = RequestMethod.POST)
	public ModelAndView doppio_mypage_info(DpMemberVO vo, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = memberService.getUpdateResult(vo);
		
		if(result ==1) {
			mv.setViewName("redirect:/doppio_main.th");
		}else {
			//���������� ȣ��
		}

		return mv;
	}
	
	
	

	
	/*
	 * 		��ٱ��� ����Ʈ 
	 * */
	
	@RequestMapping(value="/mypage/doppio_mypage_basket.th", method=RequestMethod.GET)
		public ModelAndView cart_list(String rpage) {
			ModelAndView mv = new ModelAndView();
			Map<String, String> param = pageService.getPageResult(rpage, "cart_list", cartService);
			
			int startCount = Integer.parseInt(param.get("start"));
			int endCount = Integer.parseInt(param.get("end"));
			
			List<Object> olist = cartService.getListResult(startCount, endCount);
			ArrayList<DpCartVO> list = new ArrayList<DpCartVO>();
			
			for(Object obj : olist) {
				list.add((DpCartVO)obj);
			}
			mv.addObject("list", list);
			mv.addObject("dbCount", Integer.parseInt(param.get("dbCount")));
			mv.addObject("pageSize", Integer.parseInt(param.get("pageSize")));
			mv.addObject("reqPage", Integer.parseInt(param.get("reqPage")));
			
			mv.setViewName("/mypage/doppio_mypage_basket");
			return mv;
	}
	
	
	/* error */
	@RequestMapping(value = "/doppio_error.th", method = RequestMethod.GET)
	public String doppio_error() {
		return "/doppio_error"; 
	}
}
