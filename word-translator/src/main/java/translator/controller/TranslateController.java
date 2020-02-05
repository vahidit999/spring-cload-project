package translator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import translator.model.Language;
import translator.model.WordMeaning;

@RestController
@RequestMapping("api")
public class TranslateController {

	@GetMapping("getMeaning")
	public ResponseEntity<WordMeaning> getMeaning(@RequestParam("word") String word) {
		String[] meaning = {"کتاب" , "مجلد"};
		WordMeaning wordMeaning = new WordMeaning(1, "book", meaning , Language.fa); 
		return new ResponseEntity<WordMeaning>(wordMeaning , HttpStatus.OK);
	}
}
