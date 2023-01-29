package com.aman.todoapp.service;

import com.aman.todoapp.entities.TodoEntity;
import com.aman.todoapp.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todo;

    public List<TodoEntity> getTodos(){
        List<TodoEntity> allTodos = todo.findAll();
        return allTodos;
    }

    public TodoEntity addTodo(TodoEntity newTodo){
        return todo.save(newTodo);
    }

    public String updateTodo(String id,TodoEntity updatedTodo){

        Optional<TodoEntity> oldTodo = todo.findById(id);
        if(oldTodo.isPresent()){
            updatedTodo.setId(id);
            todo.save(updatedTodo);
            return "Todo Updated";
        }else
          return "Todo Doesn't Exist";

    }

    public String deleteTodo(String id){
        todo.deleteById(id);
        return "Todo Deleted";
    }
}
