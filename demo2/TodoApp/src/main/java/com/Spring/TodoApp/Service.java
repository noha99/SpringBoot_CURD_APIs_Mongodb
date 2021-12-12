package com.Spring.TodoApp;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import error.NotFoundException;

@Component
public class Service {

	@Autowired
	private Repository repo;

	public List<Todo> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Todo findById(String id) {
		try {
			return repo.findById(id).get();
		}catch(NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the id [%s] was found in our data", id));
		}
	}
	
	public void deleteTodoById(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	public Todo createTodo(Todo todo) {
		// TODO Auto-generated method stub
		return repo.insert(todo);
	}
	
	
}
