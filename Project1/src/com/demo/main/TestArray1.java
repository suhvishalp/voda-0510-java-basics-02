package com.demo.main;

import java.util.Arrays;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[] {32,54,34,65,34,32, 32, 65,33,44,33};
		
		
		System.out.println(numbers.length);
		
//		for(int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		
		for(int value : numbers) {
			System.out.println(value);
		}
		
		Arrays.sort(numbers);
		int position = Arrays.binarySearch(numbers, 38);
		System.out.println(position);
	}

}

//list the duplicate elements from the given array 
//remove the duplicates from the array 
//create an array of Employees and sort the employees based on their salary. 


