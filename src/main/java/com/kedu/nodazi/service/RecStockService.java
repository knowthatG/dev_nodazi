package com.kedu.nodazi.service;

import java.util.List;

import com.kedu.nodazi.dto.PricesDto;

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
	 * @return		: List<String>
	 * @throws		  Exception
	 *****************************************************/
	public List<String> readRecStock() throws Exception;
	
	/*****************************************************
	 * <pre>
	 * 1. 개요	: 종목의 주가정보를 조회
	 * 2. 처리내용	: 종목코드와 조회할 기간을 받아서 주가데이터를 조회
	 * </pre>
	 * @Method Name : readStockPrice
	 * @param		  code
	 * @param		  term
	 * @return		  List<PricesDto>
	 * @throws		  Exception
	 *****************************************************/
	public List<PricesDto> readStockPrice(String code, int term) throws Exception;
	
}
