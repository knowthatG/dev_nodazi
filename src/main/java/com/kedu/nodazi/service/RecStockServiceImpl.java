package com.kedu.nodazi.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kedu.nodazi.dao.RecStockDao;
import com.kedu.nodazi.dto.PricesDto;

@Service
public class RecStockServiceImpl implements RecStockService{

	@Inject
	private RecStockDao dao;

	@Override
	public List<String> readRecStock() throws Exception {
		
		return dao.readRecStock();
	}

	@Override
	public List<PricesDto> readStockPrice(String code, int term) throws Exception {
		
		return dao.readStockPrice(code, term);
	}

	
}
