package com.kedu.nodazi.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kedu.nodazi.dto.RecStockDto;

/*****************************************************
 * <pre>
 * com.kedu.nodazi.service
 * RecStockService.java
 * </pre>
 * @author	: 오윤진
 * @Date	: 2017. 5. 26.
 * @Version	: 1.0
 *****************************************************/
public interface RecStockService {

	/*****************************************************
	 * <pre>
	 * 1. 개요	: 오늘 추천될 종목을 조회
	 * 2. 처리내용	: 오늘 날짜로 추천될 종목을 조회
	 * </pre>
	 * @Method Name : readRecStock
	 * @return		: Map<Integer, HashMap<Integer, RecStockDto>>
	 * @throws		  Exception
	 *****************************************************/
	public Map<Integer, HashMap<Integer, RecStockDto>> readRecStock() throws Exception;
}
