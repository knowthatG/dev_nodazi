package com.kedu.nodazi.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.kedu.nodazi.dto.PricesDto;

@Repository
public class RecStockDaoImpl implements RecStockDao{

	@Inject
	private SqlSession session;
	
	private static Logger logger = LoggerFactory.getLogger(RecStockDaoImpl.class);
	
	private static String namespace = "com.kedu.nodazi.mapper.RecStockMapper";
	

	@Override
	public List<String> readRecStock() throws Exception {
		
		Calendar day   = Calendar.getInstance();
		String	 today = "";
		
		Map<String, Integer> listMap  = new HashMap<String, Integer>();
		List<String>		 recList  = new ArrayList<String>();
		
//		오늘 날짜 생성
		int year = day.get(Calendar.YEAR);
		int month = day.get(Calendar.MONTH) + 1;
		int date = day.get(Calendar.DATE);
		
		today += year;
		if(month < 10){
			today += 0;
		}
		today += month;
		if(date < 10){
			today += 0;
		}
		today += date;
		
//		logger.info("today : " + today);
		
//		오늘의 추천종목 5개의 종목코드를 가져온다.
		listMap.put("today", Integer.parseInt(today));
		listMap.put("seq", 0);
		
//		seq는 1부터 시작하기에 i=1
		for(int i=1; i<=5; i++){
			listMap.replace("seq", i);
			recList.add(session.selectOne(namespace+".readRecList", listMap).toString());
		}
		
//		logger.info("recList : " + recList);
		
		return recList;
	}

	@Override
	public List<PricesDto> readStockPrice(String code, int term) throws Exception {
		
//		code는 String으로 받아야 하지만 term이 int여야 함으로 sql문에서 cast(#{code} as char)를 해준다.
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("code", Integer.parseInt(code, 10));
		map.put("term", term);
		
		return session.selectList(namespace + ".readRecStock", map);
		
//		List<Object>	stock  = new ArrayList<Object>();
//		String[] stockDate = new String[term];
//		int[] stockPrices = new int[term];
//		 
//		List<PricesDto> prices  = session.selectList(namespace + ".readRecStock", map);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		
//		for(int num = 0; num < prices.size(); num++){
//			PricesDto dto = prices.get(num);
//
//			Object[] price = new Object[5];
//			List<Object> price = new ArrayList<Object>();
//			price[0] = sdf.format(dto.getPrice_date());
//			price[1] = dto.getPrice_low();
//			price[2] = dto.getPrice_open();
//			price[3] = dto.getPrice_close();
//			price[4] = dto.getPrice_high();
//			
//			price.add(sdf.format(dto.getPrice_date()));
//			price.add(dto.getPrice_low());
//			price.add(dto.getPrice_open());
//			price.add(dto.getPrice_close());
//			price.add(dto.getPrice_high());
//			
//			Object[] priceArray = price.toArray(new Object[price.size()]);
//
//			stock[num] = price;
//			stock[num] = price;
//		}
		
	}

}
