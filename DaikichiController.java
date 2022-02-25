package com.codingdojo.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // create new controller called DaikichiController and annotate it as a REST controller
@RequestMapping("/daikichi")
public class DaikichiController {

	
	@RequestMapping("")
	// Create an http GET request to localhost:8080/daikichi to display text: "welcome"
	public String daikichi() {
		return "Welcome!";
	}
	
	
	@RequestMapping("/today")
	public String today() {
		// Create http GET request to localhost:8080/daikichi/today to display text: 
		// "Today you will have luck in all your endeavors!"
		return "Today you will have luck in all your endeavors!";
	}

	@RequestMapping("/tomorrow") 
	public String tomorrow() {
		// Create http GET request to localhost:8080/daikichi/tomorrow to display text:
		// "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!"
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	
	}
	
}
