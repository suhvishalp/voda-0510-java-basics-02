package com.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.dto.CommentDto;

@Service
public class CommentService {

	 	public CommentDto createComment(long postId, CommentDto commentDto) {
	 		
	 		return null;
	 	}

	 	public List<CommentDto> getCommentsByPostId(long postId){
	    	
	    	return null;
	    }

	 	public CommentDto getCommentById(Long postId, Long commentId) {
	    	
	    	return null;
	    }

	 	public CommentDto updateComment(Long postId, long commentId, CommentDto commentRequest) {
	    	
	    	return null;
	    }

	 	public  void deleteComment(Long postId, Long commentId) {
	    	
	    }
}
