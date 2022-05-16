package com.web.service;

import com.web.vo.DpMemberVO;

public interface DpMemberService {
	int getInsertResult(DpMemberVO vo); //회원가입
	int getLoginResult(DpMemberVO vo); //로그인
	int getIdCheckResult(String id); //회원가입-아이디 중복체크
}
