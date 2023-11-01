package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
