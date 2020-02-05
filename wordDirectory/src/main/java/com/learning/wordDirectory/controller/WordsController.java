package com.learning.wordDirectory.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learning.wordDirectory.model.Word;
import com.learning.wordDirectory.model.WordMeaning;
import com.learning.wordDirectory.service.MeaningService;

@RestController
@RequestMapping("api")
public class WordsController {
	

	@Autowired
	private MeaningService meaningService;
	
	@GetMapping("getAll")
	public ResponseEntity<List<Word>> getAllWords() {
		Word word = new Word(1 , "book");
		WordMeaning w = meaningService.getMeaning();
		System.out.println(w.getMeaning()[0]);
		return new ResponseEntity<List<Word>>( Arrays.asList(word), HttpStatus.OK );
	}
}