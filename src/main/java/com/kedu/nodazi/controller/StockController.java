package com.kedu.nodazi.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/stock")
public class StockController {
	
	private static final Logger logger = LoggerFactory.getLogger(StockController.class);
	
	@RequestMapping(value = "/recommend", method = RequestMethod.GET)
	public void recommend() throws Exception{
		
		logger.info("/stock/recommend.GET.......................................");
		
	}
	
}
