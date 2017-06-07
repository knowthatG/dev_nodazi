package com.kedu.nodazi.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kedu.nodazi.dto.PaymentDto;
import com.kedu.nodazi.dto.SearchCriteria;

public class ManagerDaoImpl implements ManagerDao {
	 
	@Inject
	private SqlSession session;

	private static Logger logger = LoggerFactory.getLogger(ManagerDaoImpl.class);
	
	private static String namespace = "com.kedu.nodazi.mapper.RecStockMapper";	
	
	@Override
	public List<PaymentDto> paymentListSearch(SearchCriteria sc) throws Exception{
		return session.selectList(namespace + ".paymentListSearch", sc);
	}
	
	@Override
	public int paymentListSearchCount(SearchCriteria sc) throws Exception {
		return session.selectOne(namespace + ".listSearchCount", sc);
	}
	
}
