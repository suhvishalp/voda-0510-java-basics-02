package com.way2learnonline;

public class A {

	private String name;
	
	public A() {
		System.out.println("This is no-arg constructor of A ");
	}
	
	public A(String name) {
		this.name = name;
		System.out.println("This is paramtererized constructor " + name );
	}
	
	private String doSomething(String name) {
		System.out.println(name);
		return "Hello " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
