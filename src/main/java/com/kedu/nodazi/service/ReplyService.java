package com.kedu.nodazi.service;

import java.util.List;

import com.kedu.nodazi.dto.Criteria;
import com.kedu.nodazi.dto.ReplyDto;

public interface ReplyService {
	public void addReply(ReplyDto rDto) throws Exception;
	
	public List<ReplyDto> listReply(int b_no) throws Exception;
	
	public void modifyReply(ReplyDto rDto) throws Exception;
	
	public void removeReply(int r_no) throws Exception;
	
	public List<ReplyDto> listReplyPage(int b_no, Criteria cri) throws Exception;
	
	public int count(int b_no) throws Exception;
}
