package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;

@RestController
public class MyController {

@Autowired
MyService myService;
@CrossOrigin(origins = "http://localhost:4200")	
 @GetMapping("/Service")
 public String test() 
 {	 
	 return myService.myFunction();
 }
	    	
}
