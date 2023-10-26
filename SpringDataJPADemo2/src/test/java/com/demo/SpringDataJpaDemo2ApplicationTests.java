package com.demo;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Employee;
import com.demo.entities.Product;
import com.demo.repositories.ProductRepository;
import com.demo.services.EmployeeService;

import jakarta.transaction.Transactional;

@SpringBootTest
class SpringDataJpaDemo2ApplicationTests {
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private ProductRepository productRepo;

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void testFindProducts() {

//		productRepo.findAllByPriceGreaterThan(new BigDecimal(1500.00))
//			.stream()
//			.forEach(p -> System.out.println(p));
		
//		Product p = productRepo.findBySku("5435345");
//		System.out.println(p);
		
		
//		productRepo.GetProducts()
//			.stream()
//			.forEach(p -> System.out.println(p));
		
		BigDecimal min = new BigDecimal(500.00);
		BigDecimal max = new BigDecimal(1500.00);
		productRepo.getProductsByPrice(min, max)
			.stream()
			.forEach(p -> System.out.println(p));
		
	}
	
//	@Test
//	public void testCreateProduct() {
//		Product product = new Product();
//		product.setSku("654654654");
//		product.setName("Mufti TShirt 4");
//		product.setDescription("Some description4");
//		product.setPrice(new BigDecimal(1800.50));
//		product.setActive(true);
//		product.setImageUrl("Someimageurl");
//		System.out.println("inserting a product");
//		productRepo.save(product);
//	}
	
//	@Test
//	public void testUpdateProduct() {
//		
//		
//	    Optional<Product> optionalProduct = productRepo.findById(1L);
//	    	    
//	    if(optionalProduct.isPresent()) {
//	    	Product product = optionalProduct.get();		//managed entity
//	    	System.out.println(product);
//	    	product.setName("Black Mufti TShirt");
//	    	product.setPrice(new BigDecimal(1999.00));
//	    	productRepo.save(product);
//	    }
//		
//	}
	
//	@Test
//	public void testCreateEmployee() {
//		empService.saveEmployee(new Employee(103, null, null, 4000.00));
//	}
	
//	@Test
//	public void testGetEmployee() {
//		
//		Optional<Employee> optionalEmp = empService.getEmployeeById(5);
//		
//		if(optionalEmp.isPresent()) {
//			Employee emp = optionalEmp.get();
//			System.out.println(emp);
//		}else {
//			System.out.println("employee with the given id not found in the db");
//		}
//	}

}
