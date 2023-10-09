package com.demo.main;

public class ArithOp {
	
	
	//byte --> short --> int -- float -- dobule
	
	public static void arithAdd(int a, int b) {
		System.out.println("method 1");
		int sum = a + b;
		System.out.println("Sum : " + sum);
		
	}
	
	public static void arithAdd(int a, byte b) {
		System.out.println("method 4");
		int sum = a + b;
		System.out.println("Sum : " + sum);
		
	}
	
	public static void arithAdd(byte a, int b) {
		System.out.println("method 5");
		int sum = a + b;
		System.out.println("Sum : " + sum);
		
	}
	
	public static void arithAdd(short a, short b) {
		System.out.println("method 3");
		int sum = a + b;
		System.out.println("Sum : " + sum);
	}
	

	
	public static void arithAdd(byte a, byte b) {
		System.out.println("method 2");
		byte sum = (byte) (a + b);
		System.out.println("Sum : " + sum);
	}
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
//		arithAdd(x, y);
		
		byte p = 120, q=2;
//		arithAdd(p, q);
		
		arithAdd(321, 30);
		
	}

}
