package com.kedu.nodazi.service;

import java.util.List;

import com.kedu.nodazi.dto.PaymentDto;
import com.kedu.nodazi.dto.SearchCriteria;

public interface ManagerService {
	
	public List<PaymentDto> getPaymentListSearch(SearchCriteria sc) throws Exception;
	
	public int getPaymentListSearchCount(SearchCriteria sc) throws Exception;
	
}
