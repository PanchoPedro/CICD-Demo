package com.CICD.Assesment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CICDController {

	@GetMapping("/")
	public String cicd(Model model) {
		model.addAttribute("message", "Welcome to CICD Assessment!!");
		System.out.println(model);
		return "welcome";
	}
}
