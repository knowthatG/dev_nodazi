package com.kedu.nodazi.service;

import java.util.List;

import com.kedu.nodazi.dto.ReplyDto;

public interface ReplyService {
	public void addReply(ReplyDto rDto) throws Exception;
	
	public List<ReplyDto> listReply(int b_no) throws Exception;
	
	public void modifyReply(ReplyDto rDto) throws Exception;
	
	public void removeReply(int r_no) throws Exception;
}
