package com.Spring.TodoApp;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos") //to create connection with db
public class Todo {
	@Id
	private String id;
	@NotNull(message = "Title is requireed")
    @Size(min = 3 , message = "Title should be at least 3 char")
	private String title;
    @NotNull(message = "Description is requireed")
	private String description;
	private long timestamp;
	
	
	public Todo() {
		super();
		this.timestamp = System.currentTimeMillis();
	}
	public Todo(String id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
