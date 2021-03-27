package com.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MusicFormController {
	
	
	@RequestMapping(value = "/musicalbum", method = RequestMethod.GET)
	public String getMusicAlbum() {
		
		System.out.println("Inside getMusicAlbum method ");
		
		return "MusicAlbums";
	}
	
	@RequestMapping(value = "/musician", method = RequestMethod.GET)
	public String getMusician() {
		
		return "Musician";
	}
	

}
