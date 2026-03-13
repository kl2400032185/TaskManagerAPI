package com.klef.fsad.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public List<Task> getAll() {
        return service.getAllTasks();
    }

    @GetMapping("/{id}")
    public Optional<Task> getById(@PathVariable int id) {
        return service.getTaskById(id);
    }

    @PostMapping
    public Task insert(@RequestBody Task t) {
        return service.insertTask(t);
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable int id, @RequestBody Task t) {
        return service.updateTask(id, t);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.deleteTask(id);
        return "Deleted Successfully!";
    }
}