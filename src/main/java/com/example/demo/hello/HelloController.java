package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String GetHello() {
		return "hello";
	}
	
	@PostMapping("/hello")
	public String PostHello(@RequestParam("text1") String str, Model model) {
		
		model.addAttribute("str", str);
		return "hello/response";
	}
}
