package com.kedu.nodazi.service;

import java.util.List;

import javax.inject.Inject;

import com.kedu.nodazi.dao.ReplyDao;
import com.kedu.nodazi.dto.ReplyDto;

public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDao dao;
	
	@Override
	public void addReply(ReplyDto rDto) throws Exception {
		dao.create(rDto);
	}

	@Override
	public List<ReplyDto> listReply(int b_no) throws Exception {
		return dao.list(b_no);
	}

	@Override
	public void modifyReply(ReplyDto rDto) throws Exception {
		dao.update(rDto);
	}

	@Override
	public void removeReply(int r_no) throws Exception {
		dao.delete(r_no);
	}
	
}
