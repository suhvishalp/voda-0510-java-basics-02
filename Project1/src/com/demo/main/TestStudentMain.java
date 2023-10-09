package com.demo.main;

import com.demo.model.Student;

public class TestStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student(101, "Rohit", 33);
		
		Student student2 = new Student(101, "Rohit", 33);
		
		
		if (student1.equals(student2))
			System.out.println("Both students are equal");
		else 
			System.out.println("not equal");

		
	}

}
