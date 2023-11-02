package com.demo.dto;

import java.util.Set;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {
    private long id;

    // title should not be null  or empty
    // title should have at least 2 characters
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

   
    // post description should be not null or empty
    // post description should have at least 10 characters
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;

  
    // post content should not be null or empty
    @NotEmpty
    private String content;
    
    
    private Set<CommentDto> comments;

    
    private Long categoryId;


	public PostDto() {
		super();
	}


	public PostDto(long id,
			@NotEmpty @Size(min = 2, message = "Post title should have at least 2 characters") String title,
			@NotEmpty @Size(min = 10, message = "Post description should have at least 10 characters") String description,
			@NotEmpty String content, Set<CommentDto> comments, Long categoryId) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;
		this.comments = comments;
		this.categoryId = categoryId;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Set<CommentDto> getComments() {
		return comments;
	}


	public void setComments(Set<CommentDto> comments) {
		this.comments = comments;
	}


	public Long getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
    
    
    
}
