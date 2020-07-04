package rest.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rest.demo.model.Input;

@RestController 
public class Controller {
	
	@PostMapping(path="/sum", produces = "applicatio/json")
	public String home(@RequestBody Input input) {
		int t= input.getNumber1()+ input.getNumber2();
		return "Sum is "+t;
		
	}
	

}
