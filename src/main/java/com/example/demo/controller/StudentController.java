package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/getstudentdata")
	public String getdata() {
		return "this is a student dataF";
	}

}
