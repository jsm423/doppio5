package com.web.service;

import com.web.vo.DpMemberVO;

public interface DpMemberService {
	int getInsertResult(DpMemberVO vo); //ȸ������
	int getLoginResult(DpMemberVO vo); //�α���
	int getIdCheckResult(String id); //ȸ������-���̵� �ߺ�üũ
}
