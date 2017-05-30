package com.kedu.nodazi.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kedu.nodazi.dao.RecStockDao;
import com.kedu.nodazi.dto.RecStockDto;

@Service
public class RecStockServiceImpl implements RecStockService{

	@Inject
	private RecStockDao dao;

	@Override
	public Map<Integer, HashMap<Integer, RecStockDto>> readRecStock() throws Exception {
		
		return dao.readRecStock();
	}
	
}
