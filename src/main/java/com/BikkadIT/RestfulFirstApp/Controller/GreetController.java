package com.BikkadIT.RestfulFirstApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GreetController")  // it is used to give unique url to class level
public class GreetController {

	@GetMapping("/GreetMsg")
	public String GreetMsg() {
		
		String msg="Happy Akshaytritiya to all";
		
		return msg;
	}
	
	
	@GetMapping("/GreetMsg2")
	public String GreetMsg2() {
		
		String msg="Happy Ramzaan Eid to all";
		
		return msg;
	}
	
	
	@GetMapping("/WelcomeMsg")
	public String WelcomeMsg() {
		
		String msg="Welcome to BikkadIT Pune";
		
		return msg;
	}
}


//@RequestMapping is used to give url to class to overcome problem of ambiguity 
// when different controller class have methods with same url 
