package com.way2learnonline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.way2learnonline.dao.CustomerDao;

	@SpringBootApplication	
	public class CachingApplication {
		


		
		public static void main(String[] args) throws Exception {
			
			
			
			
			ApplicationContext context=SpringApplication.run(CachingApplication.class);
	
			CustomerDao customerDao=context.getBean(CustomerDao.class);
			
			
			
			customerDao.getCustomerById(1);	
			customerDao.getCustomerById(1);
			customerDao.getCustomerById(1);
			customerDao.getCustomerById(1);
			customerDao.getCustomerById(1);
			
//			A a = new A();
			
//			Class<A> c = A.class;
//			
//			A a = c.newInstance();
//			
//			
//						
//			Method doSomeThingMethod =	c.getMethod("doSomething", String.class);
//
//			doSomeThingMethod.setAccessible(true);
//			
//			System.out.println(doSomeThingMethod.getReturnType().getName());
//			
//			String result = (String) doSomeThingMethod.invoke(a, "Vishal");			//a.doSomething("Vishal")
//			
//			System.out.println(result);
			
//			Method[] methodArray = c.getDeclaredMethods();
//			
//			for(Method method : methodArray) {
//				System.out.println(method.getName());
//			}
		
		}
	
	}
	
	
