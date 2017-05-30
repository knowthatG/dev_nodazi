package com.kedu.nodazi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kedu.nodazi.dto.RecStockDto;
import com.kedu.nodazi.service.RecStockService;

@Controller
@RequestMapping("/stock")
public class StockController {
	
	private static final Logger logger = LoggerFactory.getLogger(StockController.class);
	
	@Inject
	private RecStockService service;
	
	@RequestMapping(value = "/recommend", method = RequestMethod.GET)
	public void recommend() throws Exception{
		
		Map<Integer, HashMap<Integer, RecStockDto>> recStockList = new HashMap<Integer, HashMap<Integer, RecStockDto>>();
		recStockList = service.readRecStock();
		
		logger.info("제발 됬으면 조켔다");
		
		logger.info("/stock/recommend.GET.......................................");
		logger.info("recStockList : " + recStockList);
	}
	
}
