package com.anzanisundani.chucknorrisjokes.chuckNorrisJokes.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anzanisundani.chucknorrisjokes.chuckNorrisJokes.model.Jokes;

@Service
public class JokesService {

	@Autowired
	private RestTemplate restTemplate = new RestTemplate();

	private static final String GET_ALL_CATEGORIES = "https://api.chucknorris.io/jokes/categories";
	private static final String GET_JOKES_FIRST_CATEG = "https://api.chucknorris.io/jokes/random?category=animal";

	private static final String GET_JOKES_ON_CATEG = "https://api.chucknorris.io/jokes/random?category={category}";

	public ResponseEntity<String> findAllJokesComplete() {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

		ResponseEntity<String> results = restTemplate.exchange(GET_ALL_CATEGORIES, HttpMethod.GET, entity,
				String.class);

		return results;

	}

	public Jokes findAllJokes() {

		return restTemplate.getForObject(GET_JOKES_FIRST_CATEG, Jokes.class);

	}

	public Jokes findJokesOnClick() {

		Map<String, String> param = new HashMap<>();
		param.put("category", "dev");

		Jokes joke = restTemplate.getForObject(GET_JOKES_ON_CATEG, Jokes.class, param);

		System.out.println(joke);

		return joke;

	}

}
