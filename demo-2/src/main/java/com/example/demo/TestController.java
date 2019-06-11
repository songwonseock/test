package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@Value("${test.name}")

	private String name;


	@RequestMapping("/test2")
	public @ResponseBody String root() {
		return "test2";
	}
	
	@RequestMapping("/test")
	public String root2() {
		System.out.println(name);
		return "test";
	}
	
	@RequestMapping("/hello")
	public String index(Model model) {
		model.addAttribute("name", "SpringBlog from Millky");
		return "hello";
	}

}
