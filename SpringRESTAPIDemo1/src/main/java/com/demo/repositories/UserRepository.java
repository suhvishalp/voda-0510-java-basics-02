package com.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);
	
	Optional<User> findByNameOrEmail(String name, String email);
	
	Optional<User> findByName(String name);
	
	Boolean existsByName(String name);
	
	Boolean existsByEmail(String email);
	
}
