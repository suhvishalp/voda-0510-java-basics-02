package com.demo.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.CommentDto;
import com.demo.entities.Comment;
import com.demo.entities.Post;
import com.demo.repositories.CommentRepository;
import com.demo.repositories.PostRepository;

@Service
public class CommentService {
	
		@Autowired
		private CommentRepository commentRepository;
		
		@Autowired
		private PostRepository postRepository;
		
		@Autowired
		private ModelMapper mapper;

	 	public CommentDto createComment(long postId, CommentDto commentDto) throws Exception {
	 		
	 		Comment comment = mapToEntity(commentDto);
	 		
	 		Post post = postRepository.findById(postId).orElseThrow(() -> new Exception("Post ID " + postId + " Not Found"));
	 		
	 		comment.setPost(post);
	 		
	 		Comment commentResponse =  commentRepository.save(comment);
	 		
	 		return mapToDto(commentResponse);
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
	 	
	 	private CommentDto mapToDto(Comment comment) {
	 		CommentDto commentDto = mapper.map(comment, CommentDto.class);
	 		
	 		return commentDto;
	 	}
	 	
	 	private Comment mapToEntity(CommentDto commentDto) {
	 		Comment comment = mapper.map(commentDto, Comment.class);
	 		
	 		return comment;
	 	}
}
