package com.ydsoft.web.spring.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ydsoft.web.spring.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO { 
    @Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.ydsoft.web.mapper.memberMapper";

	@Override
	public List<MemberVO> selectMember() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Namespace+".selectMember");
	}

	@Override
	public MemberVO selectMember(String sId) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Namespace+".select", sId);
	}
}
