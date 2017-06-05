package com.kedu.nodazi.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

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

}
