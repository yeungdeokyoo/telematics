package com.ydsoft.web.spring.service;

import java.util.List;

import com.ydsoft.web.spring.vo.MemberVO;

public interface MemberService {
	public List<MemberVO> selectMember() throws Exception;
	public MemberVO selectMember(String sId) throws Exception;
}
