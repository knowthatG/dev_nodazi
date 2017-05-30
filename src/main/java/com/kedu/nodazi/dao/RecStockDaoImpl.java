package com.kedu.nodazi.dao;

import java.text.SimpleDateFormat;
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

import com.kedu.nodazi.dto.RecStockDto;

@Repository
public class RecStockDaoImpl implements RecStockDao{

	@Inject
	private SqlSession session;
	
	private static Logger logger = LoggerFactory.getLogger(RecStockDaoImpl.class);
	
	private static String namespace = "com.kedu.nodazi.mapper.RecStockMapper";
	
	@Override
	public Map<Integer, HashMap<Integer, RecStockDto>> readRecStock() throws Exception {
		
		String today = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		List<String> recList = new ArrayList<String>();
		RecStockDto rsDto;
		
		Map<Integer, HashMap<Integer, RecStockDto>> recStock = new HashMap<Integer, HashMap<Integer, RecStockDto>>();
		
//		Map<Integer, RecStockDto> recStock1 = new HashMap<Integer, RecStockDto>();
//		Map<Integer, RecStockDto> recStock2 = new HashMap<Integer, RecStockDto>();
//		Map<Integer, RecStockDto> recStock3 = new HashMap<Integer, RecStockDto>();
//		Map<Integer, RecStockDto> recStock4 = new HashMap<Integer, RecStockDto>();
//		Map<Integer, RecStockDto> recStock5 = new HashMap<Integer, RecStockDto>();
		
		Map<String, Integer> listMap  = new HashMap<String, Integer>();
//		Map<String, String>  stockMap = new HashMap<String, String>();
		
		
//		지금은 오늘의 값이 없음, 오늘 값으로 select가 잘되는 것을 확인
		
//		오늘 날짜 생성
		Calendar day = Calendar.getInstance();
		
		int year = day.get(Calendar.YEAR);
		int month = day.get(Calendar.MONTH) + 1;
		int date = day.get(Calendar.DATE);
		
		day.set(year, month, date);
		today = sdf.format(day);
		
		logger.info("today : " + today);
		
//		오늘의 추천종목 5개의 종목코드를 가져온다.
		listMap.put("today", Integer.parseInt(today));
		listMap.put("seq", 0);
		
//		seq는 1부터 시작하기에 i=1
		for(int i=1; i<=5; i++){
			listMap.replace("seq", i);
			recList.add(session.selectOne(namespace+".readRecList", listMap).toString());
		}
		
		logger.info("recList : " + recList);
		
//		종목코드로 일주일치 주가데이터를 가져온다.
//		list는 index임으로 0부터 시작
		for(int seq=1; seq<=5; seq++){

//			stockMap.put("code", recList.get(seq));
//			stockMap.put("week", "");
			
			String code = recList.get(seq-1);
			
			recStock.put(seq, new HashMap<Integer, RecStockDto>());
			HashMap<Integer, RecStockDto> price = recStock.get(seq);
//			price.put(week, (RecStockDto)session.selectOne(namespace + ".readRecStock", code));
			
			for(int week=1; week<=7; week++){
			}
			
		}
		
		
		
		
		return recStock;
	}

}
