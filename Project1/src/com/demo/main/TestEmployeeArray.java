package com.demo.main;

import java.util.Arrays;
import java.util.Comparator;

import com.demo.model.Employee;

public class TestEmployeeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//<data-type>[] var;
		Employee[] empArray = new Employee[3];
		
		empArray[0] = new Employee(101, "Adarsh", 5000.00);
		empArray[1] = new Employee(102, "Mohit", 1000.00);
		empArray[2] = new Employee(103, "Rohit", 2600.00);
		
		
		Arrays.sort(empArray);
		
		for (Employee emp : empArray) {
			System.out.println(emp.getEmpId() + " " + emp.getName() + " " + emp.getSalary());
		}
		
		
	}

}
