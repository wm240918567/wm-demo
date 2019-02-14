package com.wm.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/{name}")
	public String get1(@PathVariable("name")String name) {
		return "你好："+name;
	}
}
