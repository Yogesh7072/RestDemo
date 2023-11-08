package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeecont")
public class EmployeeController {
	@GetMapping("/getstudentdata")
	public String getdata() {
		return "this is employee data";
	}
	
	// this is controller class we need to  change this class
	
	
	
	@GetMapping(value =  "/getemp" , produces = "application/json")
	public String getdatas() {
		return "this is employee data";
	}

}
