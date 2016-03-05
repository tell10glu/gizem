package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingHandler {
	@RequestMapping(path="/")
	public String index(){
		return "index";
	}
	
}
