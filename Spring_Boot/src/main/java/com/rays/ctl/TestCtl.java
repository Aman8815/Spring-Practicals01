package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Test")
public class TestCtl {
	@GetMapping("display")
	public String display() {
		return "In desplay method";
	}
	@PostMapping("submit")
	public String submit() {
		return "In submit Method";
	}

}
