package com.learning.wordDirectory.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.wordDirectory.model.Word;

@RestController
@RequestMapping("api")
public class WordsController {
	
	@GetMapping("getAll")
	public ResponseEntity<List<Word>> getAllWords() {
		Word word = new Word(1 , "book");
		return new ResponseEntity<List<Word>>( Arrays.asList(word), HttpStatus.OK );
	}
}
