package com.github.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.cinema.service.Service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String Home(Model model) {
		model.addAttribute("messages", userService.findAllUser());
		return "/Home";
	}
	
}
