package com.pcm.wadda01.test01controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test01")
public class Test01Controller {

	@GetMapping
	public String hello() {
		return "--------hello!!!";
	}
}