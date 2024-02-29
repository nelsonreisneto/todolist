package br.com.todolist.controller;

import br.com.todolist.model.entity.Task;
import org.springframework.web.bind.annotation.*;

@RestController("/api/user")
public class UserController {


    @GetMapping("/get{id}")
    public Task getUser() {
        return null;
    }

    @PostMapping("/post")
    public void postUser() {
    }

    @PutMapping("/put/{id}")
    public Task putUser() {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser() {
    }
}
