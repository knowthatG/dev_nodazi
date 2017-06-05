package com.kedu.nodazi.service;

import java.util.List;

import com.kedu.nodazi.dto.BoardDto;
import com.kedu.nodazi.dto.Criteria;
import com.kedu.nodazi.dto.SearchCriteria;

/*****************************************************
 * <pre>
 * com.kedu.nodazi.service
 * BoardService.java
 * </pre>
 * @author	: 김윤화
 * @Date	: 2017. 5. 30.
 * @Version	: 
 *****************************************************/
public interface BoardService {
	/*****************************************************
	 * <pre>
	 * 1. 개요	: 
	 * 2. 처리내용	: 
	 * </pre>
	 * @Method Name : regist
	 * @param boeard
	 * @throws Exception
	 *****************************************************/
	public void regist(BoardDto board) throws Exception;
	
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
	 * @Method Name : modify
	 * @param board
	 * @throws Exception
	 *****************************************************/
	public void modify(BoardDto board) throws Exception;
	
	/*****************************************************
	 * <pre>
	 * 1. 개요	: 
	 * 2. 처리내용	: 
	 * </pre>
	 * @Method Name : remove
	 * @param b_no
	 * @throws Exception
	 *****************************************************/
	public void remove(int b_no) throws Exception;
	
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
	 * @Method Name : listCountCriteria
	 * @param cri
	 * @return
	 * @throws Exception
	 *****************************************************/
	public int listCountCriteria(Criteria cri) throws Exception;
	
	public List<BoardDto> listSearchCriteria(SearchCriteria cri) throws Exception;
	
	public int listSearchCount(SearchCriteria cri) throws Exception;
}
