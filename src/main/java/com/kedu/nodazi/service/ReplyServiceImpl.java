package com.kedu.nodazi.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kedu.nodazi.dao.BoardDao;
import com.kedu.nodazi.dao.ReplyDao;
import com.kedu.nodazi.dto.Criteria;
import com.kedu.nodazi.dto.ReplyDto;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDao rDao;
	
	@Inject
	private BoardDao bDao;
	
	@Transactional
	@Override
	public void addReply(ReplyDto rDto) throws Exception {
		rDao.create(rDto);
		bDao.updateReplyCnt(rDto.getB_no(), 1);
	}

	@Override
	public List<ReplyDto> listReply(int b_no) throws Exception {
		return rDao.list(b_no);
	}

	@Override
	public void modifyReply(ReplyDto rDto) throws Exception {
		rDao.update(rDto);
	}

	@Transactional
	@Override
	public void removeReply(int r_no) throws Exception {
		int b_no = rDao.getB_no(r_no);
		rDao.delete(r_no);
		bDao.updateReplyCnt(b_no, -1);
	}

	@Override
	public List<ReplyDto> listReplyPage(int b_no, Criteria cri) throws Exception {
		return rDao.listPage(b_no, cri);
	}

	@Override
	public int count(int b_no) throws Exception {
		return rDao.count(b_no);
	}
	
}
