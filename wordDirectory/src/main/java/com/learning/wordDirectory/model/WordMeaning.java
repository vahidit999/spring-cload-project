package com.learning.wordDirectory.model;

public class WordMeaning {
	private int id;
	private String word;
	private String[] meaning;
	private Language type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String[] getMeaning() {
		return meaning;
	}
	public void setMeaning(String[] meaning) {
		this.meaning = meaning;
	}
	public Language getType() {
		return type;
	}
	public void setType(Language type) {
		this.type = type;
	}
	WordMeaning(){}
	public WordMeaning(int id, String word, String[] meaning, Language type) {
		super();
		this.id = id;
		this.word = word;
		this.meaning = meaning;
		this.type = type;
	}

	
	
}
