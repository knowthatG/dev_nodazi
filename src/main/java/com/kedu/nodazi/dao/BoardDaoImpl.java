package com.kedu.nodazi.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kedu.nodazi.dto.BoardDto;
import com.kedu.nodazi.dto.Criteria;
import com.kedu.nodazi.dto.SearchCriteria;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.kedu.nodazi.mapper.BoardMapper";
	
	@Override
	public void create(BoardDto bDto) throws Exception {
		session.insert(namespace + ".create", bDto);
	}

	@Override
	public BoardDto read(int b_no) throws Exception {
		return session.selectOne(namespace + ".read", b_no);
	}

	@Override
	public void update(BoardDto bDto) throws Exception {
		session.update(namespace + ".update", bDto);
	}

	@Override
	public void delete(int b_no) throws Exception {
		session.delete(namespace + ".delete", b_no);
	}

	@Override
	public List<BoardDto> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<BoardDto> listPage(int page) throws Exception {
		if(page <= 0) {
			page = 1;
		}
		
		page = (page - 1) * 10;
		
		return session.selectList(namespace + ".listPage", page);
	}

	@Override
	public List<BoardDto> listCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<BoardDto> listSearch(SearchCriteria cri) throws Exception {
		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return session.selectOne(namespace + ".listSearchCount", cri);
	}

	@Override
	public void updateReplyCnt(int b_no, int amount) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("b_no", b_no);
		paramMap.put("amount", amount);
		
		session.update(namespace + ".updateReplyCnt", paramMap);
	}

	@Override
	public void updateViewCnt(int b_no) throws Exception {
		session.update(namespace + ".updateViewCnt", b_no);
	}
	
}
