package com.demo.model;

public class Student {

	private int studId;
	private String name;
	private int marks;
	
	private static int count;
	
	public Student() {
		count++;
		System.out.println("Student object is created!");
		System.out.println("Total Students : " + count);
	}
	
	public Student(int studId, String name, int marks) {
		this();		
		this.studId = studId;
		this.name = name;
		this.marks = marks;
	}

	
	public static Student createStudent(String input) {
		//break the comma separate string, and create a student object 
		
		return null;
	}
	
	public static Student createStudent(int id, String name, int marks) {
		
		return null;
	}
	
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	
}
