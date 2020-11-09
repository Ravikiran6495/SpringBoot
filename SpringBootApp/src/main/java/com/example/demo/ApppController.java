package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApppController {
	
	
	@RequestMapping("/home")
	public String process()
	{
		return "index";
	}
	
	
	
	@RequestMapping("/login")
	public String process1(@RequestParam("name") String name, Model model)
	{
		
		model.addAttribute("name", name);
		return "home";
	}
	
	
	

}
