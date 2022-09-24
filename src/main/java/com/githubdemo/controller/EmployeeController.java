package com.githubdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

	@GetMapping("/Employee")
	public String getEmployee() {
		return "wellcome to Employee Conroller";
	}
}
