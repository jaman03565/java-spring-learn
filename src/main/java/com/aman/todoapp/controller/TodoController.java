package com.aman.todoapp.controller;

import com.aman.todoapp.entities.TodoEntity;
import com.aman.todoapp.repository.TodoRepo;
import com.aman.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;
    @GetMapping("/")
    public List<TodoEntity> getTodos(){
        return todoService.getTodos();
    }

    @PostMapping("/")
    public String addTodo(@RequestBody TodoEntity newTodo){
        todoService.addTodo(newTodo);
        return "Todo Added";
    }

    @PutMapping("/")
    public String updateTodo(@RequestParam String id, @RequestBody TodoEntity updatedTodo){
        return todoService.updateTodo(id, updatedTodo);
    }

   @DeleteMapping("/")
    public  String deleteTodo(@RequestParam String id){
        return  todoService.deleteTodo(id);
   }

}
