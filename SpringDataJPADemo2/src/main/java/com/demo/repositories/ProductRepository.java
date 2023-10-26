package com.demo.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	//1. define Spring Data JPA - Query Methods 
	
	List<Product> findAllByPriceGreaterThan(BigDecimal price);
	List<Product> findAllByPriceGreaterThanAndPriceLessThan(BigDecimal max, BigDecimal min);
	Product findBySku(String sku);
	
	//2. define custom jpa queries using @Query annotation
	@Query("SELECT p FROM Product p WHERE p.price > ?1")
	List<Product> getAllProductsByPrice(BigDecimal price);
	
//	@Query("SELECT p FROM Product p WHERE p.price>= ?1 and p.price <= ?2")
//	List<Product> getProductsByPrice(BigDecimal min, BigDecimal max);
	
	@Query("SELECT p FROM Product p WHERE p.price>= :min and p.price <= :max")
	List<Product> getProductsByPrice(@Param("min") BigDecimal min, @Param("max") BigDecimal max);


	
	//3.define custom sql query statement using @Query annotation 
//	@Query(name = "select name, price from products where price > ?1", nativeQuery = true)
//	List<Product> getAllProductsByPrice(BigDecimal price);
	
	
	//4.using namedqueries 
	List<Product> GetProducts();
	
}
