package com.ydsoft.web.spring.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ydsoft.web.spring.service.MemberService;
import com.ydsoft.web.spring.vo.MemberVO;

@Controller
public class MemberController {

	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
    @Inject
    private MemberService service;

	
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member(Locale locale, Model model) {
		logger.info("Welcome Member! The client locale is {}.", locale);
		
		try {
			
	        List<MemberVO> memberList;
			memberList = service.selectMember();
	        
	        model.addAttribute("memberList", memberList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "member";
	}
	
	@RequestMapping(value = "/memberDetail", method = RequestMethod.GET)
	public ModelAndView memberDetail(@RequestParam String sId) {
		logger.info("Welcome Member! sId {}.", sId);
		ModelAndView mav = new ModelAndView();
		
		try {
			
	        MemberVO memberDetail;
	        memberDetail = service.selectMember(sId);
	        mav.addObject("memberDetail",memberDetail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mav;
	}
}
