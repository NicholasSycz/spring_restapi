package com.restapi.restapi.controllers;

import com.restapi.restapi.models.ToDont;
import com.restapi.restapi.repositories.ToDontRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDontController {
	
	@Autowired
	ToDontRepository toDontRepository;
	
	@RequestMapping(method=RequestMethod.GET, value="/todonts")
	public Iterable<ToDont> toDont() {
		return toDontRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/todonts")
	public String save(@RequestBody ToDont toDont) {
		toDontRepository.save(toDont);
		
		return toDont.getID();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/todonts/{id}")
	public ToDont show(@PathVariable String id) {
		return toDontRepository.findOne(id);
	}
	
	
}
