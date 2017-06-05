package com.kedu.nodazi.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kedu.nodazi.dto.BoardDto;
import com.kedu.nodazi.dto.Criteria;
import com.kedu.nodazi.dto.PageMaker;
import com.kedu.nodazi.dto.SearchCriteria;
import com.kedu.nodazi.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardDto board, Model model) throws Exception{
		logger.info("register get..........");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(BoardDto board
			, RedirectAttributes rttr) throws Exception{
		logger.info("regist post..........");
		logger.info(board.toString());
		
		service.regist(board);
		
//		rttr.addAttribute("result", "success");
		
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void list(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception{
		logger.info(cri.toString());
		
		model.addAttribute("list", service.listSearchCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		
		pageMaker.setTotalCount(service.listSearchCount(cri));
		
		model.addAttribute("pageMaker", pageMaker);
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("b_no") int b_no
			, @ModelAttribute("cri") SearchCriteria cri
			, Model model) throws Exception{
		model.addAttribute(service.read(b_no));
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("b_no") int b_no
			, SearchCriteria cri
			, RedirectAttributes rttr) throws Exception{
		service.remove(b_no);
		
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addAttribute("searchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());
		
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int b_no
			, @ModelAttribute("cri") SearchCriteria cri
			, Model model) throws Exception{
		model.addAttribute(service.read(b_no));
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardDto board
			, SearchCriteria cri
			, RedirectAttributes rttr) throws Exception{
		logger.info(cri.toString());
		
		service.modify(board);
		
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addAttribute("searchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());
		
		logger.info(rttr.toString());
		
		return "redirect:/board/listAll";
	}
	
}
