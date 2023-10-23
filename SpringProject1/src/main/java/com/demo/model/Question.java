package com.demo.model;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("myfile.properties")
public class Question {
	
	@Value("question.id")
	private int id;
	
	@Value("question.name")
	private String name;
	
	
	private List<String> answers;

	public Question() {
		System.out.println("Question object is created, no-arg constructor");
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
		System.out.println("id is set");
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
		System.out.println("name is set");
	}



	public List<String> getAnswers() {
		return answers;
	}



	public void setAnswers(List<String> answers) {
		this.answers = answers;
		System.out.println("answers are set");
	}



	public Question(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("answers are:");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
