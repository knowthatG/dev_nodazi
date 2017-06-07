package com.kedu.nodazi.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kedu.nodazi.dto.Criteria;
import com.kedu.nodazi.dto.ReplyDto;

@Repository
public class ReplyDaoImpl implements ReplyDao{

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.kedu.nodazi.mapper.ReplyMapper";
	
	@Override
	public List<ReplyDto> list(int b_no) throws Exception {
		return session.selectList(namespace + ".lsit", b_no);
	}

	@Override
	public void create(ReplyDto rDto) throws Exception {
		session.insert(namespace + ".create", rDto);
	}

	@Override
	public void update(ReplyDto rDto) throws Exception {
		session.update(namespace + ".update", rDto);
	}

	@Override
	public void delete(int r_no) throws Exception {
		session.delete(namespace + ".delete", r_no);
	}

	@Override
	public List<ReplyDto> listPage(int b_no, Criteria cri) throws Exception {
		Map<String, Object> paramMap = new HashMap<>();
		
		paramMap.put("b_no", b_no);
		paramMap.put("cri", cri);
		
		return session.selectList(namespace + ".listPage", paramMap);
	}

	@Override
	public int count(int b_no) throws Exception {
		return session.selectOne(namespace + ".count", b_no);
	}

	@Override
	public int getB_no(int r_no) throws Exception {
		return session.selectOne(namespace + ".getB_no", r_no);
	}
	
}
