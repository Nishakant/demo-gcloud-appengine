package com.demo.gcloud.appengine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to AppEngines- Changes";
	}

}
