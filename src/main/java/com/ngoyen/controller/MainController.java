package com.ngoyen.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	@GetMapping("/403")
	public String accessDenied() {
		return "403";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
}
