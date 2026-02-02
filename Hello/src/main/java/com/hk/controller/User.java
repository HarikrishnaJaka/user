package com.hk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User
{
	@GetMapping("/wish")
	public String wish() {
		return "hollo boss how are you";
	}
	@GetMapping("/greet")
	public String greet() {
		return "hollo boss good morning";
	}
	@GetMapping("/newYear")
	public String newYear() {
		return "hollo boss wish you a happy new year";
	}


}
