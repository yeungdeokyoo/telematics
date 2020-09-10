package com.ydsoft.web.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalendarController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public String calendar(Locale locale, Model model) {
		logger.info("Welcome calendar! The client locale is {}.", locale);
		
		
		model.addAttribute("paramValue", "Call Google Calendar API" );
		
		return "calendar";
	}
}
