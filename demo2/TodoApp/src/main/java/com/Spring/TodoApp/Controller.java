package com.Spring.TodoApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Service service;
	
	@RequestMapping("")
	public String sayHi () {
		return "hello";
	}
	
	@GetMapping(path = "/{name}")
    public String greetingWithName(@PathVariable String name)
    {
        return String.format("Helllo %s dear", name);
    }
	
	@GetMapping(path = "/api/todos")
    public ResponseEntity<List<Todo>> findAllTodos()
    {
		List<Todo> result = service.findAll() ;
        return new ResponseEntity<>(result , HttpStatus.OK);
    }
	
	@GetMapping(path = "/api/todos/{id}")
    public ResponseEntity<Todo> findTodosById(@PathVariable String id)
    {
		Todo result = service.findById(id) ;
        return new ResponseEntity<>(result , HttpStatus.OK);
    }
	
	@PostMapping(path = "/api/todos")
    public ResponseEntity<Todo> AddTodo(@RequestBody Todo todo)
    {
		Todo result = service.createTodo(todo) ;
        return new ResponseEntity<>(result , HttpStatus.CREATED);
    }
	
	
	@DeleteMapping(path = "/api/todos/{id}")
    public ResponseEntity<Void> deleteTodoById(@PathVariable String id)
    {
        service.deleteTodoById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
