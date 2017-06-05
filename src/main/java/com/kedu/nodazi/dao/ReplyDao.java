package com.kedu.nodazi.dao;

import java.util.List;

import com.kedu.nodazi.dto.ReplyDto;

/*****************************************************
 * <pre>
 * com.kedu.nodazi.dao
 * ReplyDao.java
 * </pre>
 * @author	: 김윤화
 * @Date	: 2017. 6. 5.
 * @Version	: 
 *****************************************************/
public interface ReplyDao {
	public List<ReplyDto> list(int b_no) throws Exception;
	
	public void create(ReplyDto rDto) throws Exception;
	
	public void update(ReplyDto rDto) throws Exception;
	
	public void delete(int b_no) throws Exception;
}
