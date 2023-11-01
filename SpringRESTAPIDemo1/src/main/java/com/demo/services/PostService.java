package com.demo.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.PostDto;
import com.demo.dto.PostResponse;
import com.demo.entities.Post;
import com.demo.repositories.PostRepository;

@Service
public class PostService {
	
		@Autowired
		private PostRepository postRepo;
		
		@Autowired
		private ModelMapper mapper;
		
	 	public PostService() {
			super();
		}

		public PostDto createPost(PostDto postDto) {
			
			Post post = mapToEntity(postDto);
			
			Post newPost = postRepo.save(post);
			
			PostDto postReponse = mapToDto(newPost);
			
	 		return postReponse;
	 	}

		public PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {
	    	
	    	
	    	return null;
	    }

		public PostDto getPostById(long id) {
	    	
	    	return null;
	    }

		public PostDto updatePost(PostDto postDto, long id) {
	    	
	    	return null;
	    }

		public void deletePostById(long id) {
	    	
	    }
		
		private PostDto mapToDto(Post post) {
			
			//receive a post and map it to PostDto
			PostDto postDto = mapper.map(post, PostDto.class);
			
			//return postDto
			return postDto;
		}
		
		private Post mapToEntity(PostDto postDto) {
			
			//receive a postDto and map it to Post
			Post post = mapper.map(postDto, Post.class);
			
			//return post
			return post;
		}

	   
}
