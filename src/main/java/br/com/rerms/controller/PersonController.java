package br.com.rerms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("properties")
public class PersonController {
	
	@GetMapping
	public ResponseEntity<String> findAll(){
		return ResponseEntity.ok("Hello World!");
	}
	
}
