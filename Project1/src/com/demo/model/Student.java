package com.demo.model;

import java.util.Objects;

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

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, studId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && studId == other.studId;
	}
	
	
	
	
	
	
	
//	//override the equals() 
//	public boolean equals(Object other) {
//		//logic to compare this object with the 'other' object 
//		
//		if(other instanceof Student) {
//			Student otherStudent = (Student)other;
//			
//			if(this == other)
//				return true;
//			
//			if(other == null)
//				return false;
//			
//			if(this.studId == otherStudent.getStudId() && 
//					this.name.equals(otherStudent.getName()) && 
//					this.marks == otherStudent.getMarks()) {
//				return true;
//			}
//		
//		}
//		
//		return false;
//		 
//	}
//	
	
	
	
	
	

//	//override the toString()method 
//	public String toString() {
//		return this.studId + " " + this.name + " " + this.marks;
//	}
//	
	
	
	
}
