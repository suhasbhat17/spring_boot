package com.suhas.springboot.spring_boot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String welcome() {
		return "Hello, Welcome to CourseSite";
	}
}
