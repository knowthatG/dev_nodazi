package com.kedu.nodazi.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedu.nodazi.dto.PricesDto;
import com.kedu.nodazi.service.RecStockService;

@Controller
@RequestMapping("/stock")
public class StockController {
	
	private static final Logger logger = LoggerFactory.getLogger(StockController.class);
	
	@Inject
	private RecStockService service;
	
	@RequestMapping(value = "/recommend", method = RequestMethod.GET)
	public void recommend(Model model) throws Exception{
		
		logger.info("/stock/recommend.GET.......................................");
				
		List<String> recStockList = service.readRecStock();
		
		model.addAttribute("recStockList", recStockList);
		
	}
	
	@ResponseBody
	@RequestMapping(value="/chartAjax", method=RequestMethod.GET)
	public List<PricesDto> chartAjax(/*@RequestParam int term, */@RequestParam String code, Model model) throws Exception{
		
		
//		code = 241180
		logger.info("code : " + code);
		List<PricesDto> recStock = service.readStockPrice(code, 5/*term*/);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("MM.dd");
//		
//		for(PricesDto dto : recStock){
//			dto.setPrice_date(sdf.format(dto.getPrice_date()));
//		}
		
		logger.info("recStock : " + recStock);
		
		return recStock;
		
/*		List<PricesDto> recStrock1 = service.readStockPrice(recStockList.get(0), 5);
		List<PricesDto> recStrock2 = service.readStockPrice(recStockList.get(1), 5);
		List<PricesDto> recStrock3 = service.readStockPrice(recStockList.get(2), 5);
		List<PricesDto> recStrock4 = service.readStockPrice(recStockList.get(3), 5);
		List<PricesDto> recStrock5 = service.readStockPrice(recStockList.get(4), 5);
		
		logger.info("recStockList : " + recStockList);
		logger.info("recStrock1 : " + recStrock1.toString());
		logger.info("recStrock2 : " + recStrock2);
		logger.info("recStrock3 : " + recStrock3);
		logger.info("recStrock4 : " + recStrock4);
		logger.info("recStrock5 : " + recStrock5);
		
		model.addAttribute("recStockList", recStockList);
		model.addAttribute("recStock1", recStrock1);
		model.addAttribute("recStock2", recStrock2);
		model.addAttribute("recStock3", recStrock3);
		model.addAttribute("recStock4", recStrock4);
		model.addAttribute("recStock5", recStrock5);*/
	}
	
}
