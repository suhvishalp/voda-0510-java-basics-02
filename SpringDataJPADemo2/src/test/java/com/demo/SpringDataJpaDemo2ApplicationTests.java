package com.demo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Address;
import com.demo.entities.Order;
import com.demo.entities.OrderItem;
import com.demo.entities.Product;
import com.demo.repositories.AddressRepository;
import com.demo.repositories.OrderItemRepository;
import com.demo.repositories.OrderRepository;
import com.demo.repositories.ProductRepository;
import com.demo.services.EmployeeService;

import jakarta.transaction.Transactional;

@SpringBootTest
class SpringDataJpaDemo2ApplicationTests {
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private AddressRepository addRepo;
	
	@Autowired
	private OrderItemRepository orderItemRepo;
	

	@Test
	void contextLoads() {
	}
	
//	
//	@Test
//	@Transactional
//	public void testGetOrder() {
//		
//		Order order = orderRepo.findByOrderTrackingNumber("123456");
//		//order --> address
//		
//		System.out.println("Order Id : " + order.getId());
//		System.out.println("Order Total :" + order.getTotalPrice());
//		System.out.println("Address  : " + order.getShippingAddress().getCity());
//		
//	}
//	
	
//	@Test
//	public void testCreateOrder() {
//		
//		//order ---> address
//		
//		Order order = new Order();
//		order.setOrderTrackingNumber("1234567");
//		order.setTotalQuantity(10);
//		order.setTotalPrice(new BigDecimal(6000.00));
//		order.setStatus("IN Progress");
//	
//		Address shipAdd = new Address();
//		shipAdd.setStreet("Mum-BLR highway");
//		shipAdd.setCity("Mumbai");
//		shipAdd.setCountry("IN");
//		shipAdd.setState("MH");
//		shipAdd.setZipCode("4534534");
//		
////		Address shipAdd = addRepo.findById(1L).get();			//managed entity
//		
//		order.setShippingAddress(shipAdd);
// 
//		orderRepo.save(order);
//	}
//	
	
	
	@Test
	public void saveOrder() {
		Order order = new Order();
		
		order.setOrderTrackingNumber("1234567");
		order.setStatus("IN Progress");
	
		Address shipAdd = new Address();
		shipAdd.setStreet("Mum-BLR highway");
		shipAdd.setCity("Mumbai");
		shipAdd.setCountry("IN");
		shipAdd.setState("MH");
		shipAdd.setZipCode("4534534");
		//op3 - inserts a new shipping address to the address table 		
		order.setShippingAddress(shipAdd);
		
		//create orderitems 
		
		OrderItem orderItem1 = new OrderItem();
		Product p1 = productRepo.findBySku("8786574");			//op1 - fetch product by the given id
		orderItem1.setProduct(p1);
		orderItem1.setQuantity(2);
		
		OrderItem orderItem2 = new OrderItem();
		Product p2 = productRepo.findBySku("54323333");			//	//op2 - fetch product by the given id
		orderItem2.setProduct(p2);
		orderItem2.setQuantity(2);
		
		Set<OrderItem> items = new HashSet<>();
		items.add(orderItem1);
		items.add(orderItem2);
		
		order.setOrderItems(items);
	
		
		//calculate the totalprice & qty based on items in the order x its qty
		order.setTotalPrice(new BigDecimal(6000.00));
		order.setTotalQuantity(10);
	
		
		//op4 - save the order items in the orderitems table
		
		//op5 - save the order
		orderRepo.save(order);
	}
	
	
	
	
//	@Test
//	public void testFindProducts() {

//		productRepo.findAllByPriceGreaterThan(new BigDecimal(1500.00))
//			.stream()
//			.forEach(p -> System.out.println(p));
		
//		Product p = productRepo.findBySku("5435345");
//		System.out.println(p);
		
		
//		productRepo.GetProducts()
//			.stream()
//			.forEach(p -> System.out.println(p));
		
//		BigDecimal min = new BigDecimal(500.00);
//		BigDecimal max = new BigDecimal(1500.00);
//		productRepo.getProductsByPrice(min, max)
//			.stream()
//			.forEach(p -> System.out.println(p));
//		
//	}
	
//	@Test
//	public void testCreateProduct() {
//		Product product1 = new Product();
//		product1.setSku("8786574");
//		product1.setName("Puma TShirt2");
//		product1.setDescription("Some description4");
//		product1.setPrice(new BigDecimal(1300.50));
//		product1.setActive(true);
//		product1.setImageUrl("Someimageurl");
//		
//		Product product2 = new Product();
//		product2.setSku("54323333");
//		product2.setName("Nike TShirt2");
//		product2.setDescription("Some description4");
//		product2.setPrice(new BigDecimal(900.50));
//		product2.setActive(true);
//		product2.setImageUrl("Someimageurl");
//		
//		Product product3 = new Product();
//		product3.setSku("8767856");
//		product3.setName("Adidas TShirt2");
//		product3.setDescription("Some description4");
//		product3.setPrice(new BigDecimal(2100.50));
//		product3.setActive(true);
//		product3.setImageUrl("Someimageurl");
//		
//
//		List<Product> listProduct = new ArrayList<>();
//		listProduct.add(product1);
//		listProduct.add(product2);
//		listProduct.add(product3);
//		
//		productRepo.saveAll(listProduct);
//		
//	}
//	
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
