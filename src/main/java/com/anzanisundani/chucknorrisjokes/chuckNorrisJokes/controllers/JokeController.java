package com.anzanisundani.chucknorrisjokes.chuckNorrisJokes.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.anzanisundani.chucknorrisjokes.chuckNorrisJokes.model.Jokes;
import com.anzanisundani.chucknorrisjokes.chuckNorrisJokes.services.JokesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class JokeController {
	
	@Autowired
	private JokesService jokesService;
	
	@GetMapping("complete")
	public ResponseEntity<String> getAllJokesComplete() {
		return jokesService.findAllJokesComplete();
	}
	
	@GetMapping
	public Jokes getAllJokes() {
		return jokesService.findAllJokes();
	}
	
	@GetMapping("onclick")
	public Jokes getAllJokesOnClick() {
		
		return jokesService.findJokesOnClick();
	}
	 
	

}
