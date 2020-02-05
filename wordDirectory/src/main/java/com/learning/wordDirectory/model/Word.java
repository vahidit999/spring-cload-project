package com.learning.wordDirectory.model;

import java.io.Serializable;

public class Word implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2402409582612700849L;
	private int id;
	private String name;
	Word(){}
	public Word(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
