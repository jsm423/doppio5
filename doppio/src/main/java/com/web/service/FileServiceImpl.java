package com.web.service;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.web.vo.DpBoardVO;

public class FileServiceImpl {
	
	
	/**
	 * ���� üũ �� bsfile ���� ---> VO ����
	 */
	public DpBoardVO fileCheck(DpBoardVO vo) {
		
		UUID uuid = UUID.randomUUID();		
		
		if(vo != null) {
			if(!vo.getFile1().getOriginalFilename().equals("")) { //�������� �ϴ� ���	
				vo.setBfile(vo.getFile1().getOriginalFilename());
				vo.setBsfile(uuid + "_" + vo.getFile1().getOriginalFilename());
			}
		}
				
		return vo;
	}
	
	/**
	 * ���� ����
	 */
	public void fileSave(DpBoardVO vo, HttpServletRequest request) throws Exception{
		
		if(!vo.getFile1().getOriginalFilename().equals("")) {
		
			//�������� ��ġ Ȯ��
			String root_path = request.getSession().getServletContext().getRealPath("/");
			root_path += "resources\\upload\\";
			System.out.println(root_path);
			
			//��������
			File file = new File(root_path + vo.getBsfile());			
			vo.getFile1().transferTo(file);
		}
			
	}
	
	/**
	 * ���� ���� - ���� ���� ����
	 */
	public void fileSave(DpBoardVO vo, HttpServletRequest request, String fname) throws Exception{
		
		if(!vo.getFile1().getOriginalFilename().equals("")) {
		
			//�������� ��ġ Ȯ��
			String root_path = request.getSession().getServletContext().getRealPath("/");
			root_path += "resources\\upload\\";
			System.out.println(root_path);
			
			//��������
			File file = new File(root_path + vo.getBsfile());			
			vo.getFile1().transferTo(file);
			
			//���� ������ �����ϴ� ��� ����ó��
			File ofile = new File(root_path+fname);
			if(ofile.exists()) {
				ofile.delete();
			}
		}
	}
}

