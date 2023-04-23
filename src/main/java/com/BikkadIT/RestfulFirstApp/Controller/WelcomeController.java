package com.BikkadIT.RestfulFirstApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/WelcomeController")
public class WelcomeController {

	@GetMapping("/WelcomeMsg")
	public String WelcomeMsg() {
		
		String msg="Welcome to BikkadIT";
		
		return msg;
	}
	
	
	@GetMapping("/WelcomeMsg2")        // in Restful services url should be unique(should not be same)
	public String WelcomeMsg2() {
		
		String msg="Welcome to Pune";
		
		return msg;
	}
}


// in Restful services when we use @RestController annotation then there is no need to use Model class
