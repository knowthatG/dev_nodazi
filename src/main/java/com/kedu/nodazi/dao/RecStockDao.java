package com.kedu.nodazi.dao;

import java.util.Date;

import com.kedu.nodazi.dto.RecStockDto;

/*****************************************************
 * <pre>
 * com.kedu.nodazi.dao
 * RecStockDao.java
 * </pre>
 * @author	: 오윤진
 * @Date	: 2017. 5. 25.
 * @Version	: 1.0
 *****************************************************/
public interface RecStockDao {

	/*****************************************************
	 * <pre>
	 * 1. 개요	: 오늘 추천될 종목을 조회
	 * 2. 처리내용	: rec_stock 디비에서 오늘 날짜로 추천될 종목을 조회
	 * </pre>
	 * @Method Name : readRecStock
	 * @param		  today
	 * @return		  RecStockDto
	 * @throws		  Exception
	 *****************************************************/
	public RecStockDto readRecStock(Date today) throws Exception;
	
}
