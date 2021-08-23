package com.forwardair.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	@RequestMapping("/forwardair/api/")
	public String hello() 
	{
		
		String msg = "{\r\n" + 
				"	\"id\": 12345689,\r\n" + 
				"	\"msg\": \"Spring Boot Demo service\"\r\n" + 
				"}";
		
		return msg;
	}
	
	
	@GetMapping("/forwardair/api/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "Greeting - Hello "+name;
	}
}
