package br.com.todolist.controller;

import br.com.todolist.model.entity.Task;
import br.com.todolist.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/get/{id}")
    public Task getTask() {
        return null;
    }

    @PostMapping("/post")
    public void postTask() {
    }

    @PutMapping("/put/{id}")
    public Task putTask() {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask() {
    }
}
