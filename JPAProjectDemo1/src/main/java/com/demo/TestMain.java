package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.demo.entities.Employee;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAProjectDemo1");
	    EntityManager entityManager =	factory.createEntityManager();
	    EntityTransaction transaction = entityManager.getTransaction();
	
//	    Employee emp1 = new Employee();
//	    emp1.setName("Vishal");
//	    emp1.setCity("Pune");
//	    emp1.setProjectName("Vodaphone Project");
//	    emp1.setSalary(1000.00);
//	    
//	    transaction.begin();
//	    entityManager.persist(emp1);
//	    transaction.commit();
//	    
//	    Employee emp = entityManager.find(Employee.class, 1);
//	
//	    if(emp!=null)
//	    	System.out.println(emp);
//	    else 
//	    	System.out.println("Not found");
//	    
//	    transaction.begin();
//	    emp.setCity("Mumbai");
//	    emp.setSalary(2000.00);
//	    transaction.commit();
//	    
//	    entityManager.remove(emp);
//	    
	} 

}
