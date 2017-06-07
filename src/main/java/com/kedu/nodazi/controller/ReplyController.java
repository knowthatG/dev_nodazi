package com.kedu.nodazi.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kedu.nodazi.dto.ReplyDto;
import com.kedu.nodazi.service.ReplyService;

@RestController
@RequestMapping("/replies")
public class ReplyController {
	
	@Inject
	private ReplyService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody ReplyDto rDto){
		ResponseEntity<String> entity = null;
		try{
			service.addReply(rDto);
			entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	@RequestMapping(value = "/all/{bno}", method = RequestMethod.GET)
	public ResponseEntity<List<ReplyDto>> list(@PathVariable("bno") Integer bno){
		
		ResponseEntity<List<ReplyDto>> entity = null;
		try{
			entity = new ResponseEntity<>(service.listReply(bno), HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
}
