package com.kedu.nodazi.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.kedu.nodazi.dao.BoardDao;
import com.kedu.nodazi.dto.BoardDto;
import com.kedu.nodazi.dto.Criteria;
import com.kedu.nodazi.dto.SearchCriteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDao dao;
	
	@Override
	public void regist(BoardDto board) throws Exception {
		dao.create(board);
	}

	@Transactional(isolation=Isolation.READ_COMMITTED)
	@Override
	public BoardDto read(int b_no) throws Exception {
		dao.updateViewCnt(b_no);
		return dao.read(b_no);
	}

	@Override
	public void modify(BoardDto board) throws Exception {
		dao.update(board);
	}

	@Override
	public void remove(int b_no) throws Exception {
		dao.delete(b_no);
	}

	@Override
	public List<BoardDto> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<BoardDto> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}

	@Override
	public List<BoardDto> listSearchCriteria(SearchCriteria cri) throws Exception {
		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return dao.listSearchCount(cri);
	}

}
