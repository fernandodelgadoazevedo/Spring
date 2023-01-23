package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController // informa que é um controller
@RequestMapping("helloword")// informa o endereço da web
public class helloController {
	
	@GetMapping // pega a informação do método e exibe
	public String hello() {
		return "Hello Word! Fernando Azevedo";
	}

	
	
}
