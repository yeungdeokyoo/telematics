package com.ydsoft.web.spring.dao;

import java.util.List;

import com.ydsoft.web.spring.vo.MemberVO;

public interface MemberDAO {
	public List<MemberVO> selectMember() throws Exception;
	public MemberVO selectMember(String sId) throws Exception;
}
