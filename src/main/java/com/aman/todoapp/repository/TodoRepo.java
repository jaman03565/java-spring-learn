package com.aman.todoapp.repository;

import com.aman.todoapp.entities.TodoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepo extends MongoRepository<TodoEntity,String> {

}
