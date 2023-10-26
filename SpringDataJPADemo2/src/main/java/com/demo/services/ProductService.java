package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositories.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepository productRepo;
	
	
}
