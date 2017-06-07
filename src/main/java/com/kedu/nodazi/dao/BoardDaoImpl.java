package com.kedu.nodazi.dao;

import java.util.List;

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
	
}
