package com.example.todo.controller;

import com.example.todo.model.TodoItem;
import com.example.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoRepository repo;

    @GetMapping
    public List<TodoItem> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public TodoItem create(@RequestBody TodoItem item) {
        return repo.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
