package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TestModel;

@RestController
@RequestMapping("/")
public class MainController {

	@GetMapping("test")
	public String test() {
		return "Success!";
	}
	
	@PostMapping("test")
	public TestModel printModel(@RequestBody TestModel model) {
		return model;
	}
	
}
