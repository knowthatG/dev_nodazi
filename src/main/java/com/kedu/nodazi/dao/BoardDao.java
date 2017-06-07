package com.kedu.nodazi.dao;

import java.util.List;

import com.kedu.nodazi.dto.BoardDto;
import com.kedu.nodazi.dto.Criteria;
import com.kedu.nodazi.dto.SearchCriteria;

/*****************************************************
 * <pre>
 * com.kedu.nodazi.dao
 * BoardDao.java
 * </pre>
 * @author	: 김윤화
 * @Date	: 2017. 5. 30.
 * @Version	: 1.0
 *****************************************************/
public interface BoardDao {
	
	/*****************************************************
	 * <pre>
	 * 1. 개요	: 게시글 작성
	 * 2. 처리내용	: 
	 * </pre>
	 * @Method Name : create
	 * @param bDto
	 * @throws Exception
	 *****************************************************/
	public void create(BoardDto bDto) throws Exception;
	
	/*****************************************************
	 * <pre>
	 * 1. 개요	: 
	 * 2. 처리내용	: 
	 * </pre>
	 * @Method Name : read
	 * @param b_no
	 * @return
	 * @throws Exception
	 *****************************************************/
	public BoardDto read(int b_no) throws Exception;
	
	/*****************************************************
	 * <pre>
	 * 1. 개요	: 
	 * 2. 처리내용	: 
	 * </pre>
	 * @Method Name : update
	 * @param bDto
	 * @throws Exception
	 *****************************************************/
	public void update(BoardDto bDto) throws Exception;
	
	/*****************************************************
	 * <pre>
	 * 1. 개요	: 
	 * 2. 처리내용	: 
	 * </pre>
	 * @Method Name : delete
	 * @param b_no
	 * @throws Exception
	 *****************************************************/
	public void delete(int b_no) throws Exception;
	
	/*****************************************************
	 * <pre>
	 * 1. 개요	: 
	 * 2. 처리내용	: 
	 * </pre>
	 * @Method Name : listAll
	 * @return
	 * @throws Exception
	 *****************************************************/
	public List<BoardDto> listAll() throws Exception;
	
	/*****************************************************
	 * <pre>
	 * 1. 개요	: 
	 * 2. 처리내용	: 
	 * </pre>
	 * @Method Name : listPage
	 * @param page
	 * @return
	 * @throws Exception
	 *****************************************************/
	public List<BoardDto> listPage(int page) throws Exception;
	
	/*****************************************************
	 * <pre>
	 * 1. 개요	: 
	 * 2. 처리내용	: 
	 * </pre>
	 * @Method Name : listCriteria
	 * @param cri
	 * @return
	 * @throws Exception
	 *****************************************************/
	public List<BoardDto> listCriteria(Criteria cri) throws Exception;
	
	/*****************************************************
	 * <pre>
	 * 1. 개요	: 
	 * 2. 처리내용	: 
	 * </pre>
	 * @Method Name : countPaging
	 * @param cri
	 * @return
	 * @throws Exception
	 *****************************************************/
	public int countPaging(Criteria cri) throws Exception;
	
	public List<BoardDto> listSearch(SearchCriteria cri) throws Exception;
	
	public int listSearchCount(SearchCriteria cri) throws Exception;
	
	public void updateReplyCnt(int b_no, int amount) throws Exception;
	
	public void updateViewCnt(int b_no) throws Exception;
	
}
