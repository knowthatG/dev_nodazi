package com.kedu.nodazi.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kedu.nodazi.dao.ManagerDao;
import com.kedu.nodazi.dto.PaymentDto;
import com.kedu.nodazi.dto.SearchCriteria;

@Service
public class ManagerServiceImpl implements ManagerService {
	
	@Inject 
	private ManagerDao dao;
	
	@Override
	public List<PaymentDto> getPaymentListSearch(SearchCriteria sc) throws Exception {
		return dao.paymentListSearch(sc);
	}
	
	@Override
	public int getPaymentListSearchCount(SearchCriteria sc) throws Exception{
		return dao.paymentListSearchCount(sc);
	}

}
