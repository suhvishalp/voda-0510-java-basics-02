package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
