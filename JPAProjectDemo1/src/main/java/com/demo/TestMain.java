package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.demo.entities.Person;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAProjectDemo1");
	    EntityManager entityManager =	factory.createEntityManager();
	    EntityTransaction transaction = entityManager.getTransaction();
	
	    Person person = new Person();
	    person.setName("vishal");
	    person.setPersonId(111L);
	    
	    transaction.begin();
	   
	    entityManager.persist(person);
	    transaction.commit();
	    
//	    Employee emp1 = new Employee();
//	    emp1.setName("Vishal");
//	    emp1.setCity("Pune");
//	    emp1.setProjectName("Vodaphone Project");
//	    emp1.setSalary(1000.00);
//	    
//	    
//	    List<Employee> list = new ArrayList<>();
//	    list.add(new Employee("vaibhav", "Pune", 4000.00));
//	    list.add(new Employee("mohit", "Pune", 3000.00));
//	    list.add(new Employee("rohit", "Pune", 5000.00));
//	    list.add(new Employee("amit", "Pune", 1400.00));
//	    list.add(emp1);
//	    
//	    for(Employee emp : list) {
//	    	transaction.begin();
//		    entityManager.persist(emp);
//		    transaction.commit();
//	    }
//	    
	    
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
	    
	    
//	    Query query = entityManager.createQuery("SELECT e FROM Employee e");
//	    List list = query.getResultList();
//	    for(Object emp : list) {
//	    	Employee employee = (Employee)emp;
//	    	System.out.println(employee);
//	    }
	    
// 	    
//	    TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e", Employee.class);
//	   
//	    List<Employee> list = query.getResultList();
//	  
//	    for(Employee emp : list) {
//	    	System.out.println(emp);
//	    }
	    
	} 

}
