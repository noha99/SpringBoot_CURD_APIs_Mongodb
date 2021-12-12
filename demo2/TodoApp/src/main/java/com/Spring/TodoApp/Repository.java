package com.Spring.TodoApp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface Repository extends MongoRepository<Todo , String> {

}
