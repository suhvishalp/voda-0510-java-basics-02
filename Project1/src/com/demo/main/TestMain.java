package com.demo.main;

import java.util.Scanner;

import com.demo.model.Employee;

public class TestMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int age;
		
		System.out.println("enter your age : ");
		age = scanner.nextInt();
		
		System.out.println("enter your name : ");
		String name = scanner.next();
		
		System.out.println("Age : " + age);
		System.out.println("Name : " + name);
		
	}

}
