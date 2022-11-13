package com.fita.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping("/")
	public String showHome() {

		return "home";
	}

	@GetMapping("/myLoginPage")
	public String showLoginPage() {

		return "plain-login";
	}

	@GetMapping("/leaders")
	public String showLeadersPage() {

		return "leaders";
	}

	@GetMapping("/systems")
	public String showSystemsPage() {

		return "admin";
	}

	@GetMapping("/access-denied")
	public String showAccessdenied() {

		return "access-denied";
	}
}
