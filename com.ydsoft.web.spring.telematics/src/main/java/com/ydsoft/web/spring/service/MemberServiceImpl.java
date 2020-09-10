package com.ydsoft.web.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ydsoft.web.spring.dao.MemberDAO;
import com.ydsoft.web.spring.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
    @Inject
    private MemberDAO dao;
    
	@Override
	public List<MemberVO> selectMember() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMember();
	}

	@Override
	public MemberVO selectMember(String sId) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMember(sId);
	}
}
