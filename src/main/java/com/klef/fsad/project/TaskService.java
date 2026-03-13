package com.klef.fsad.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    TaskRepository repo;

    public Task insertTask(Task t) { return repo.save(t); }
    public List<Task> getAllTasks() { return repo.findAll(); }
    public Optional<Task> getTaskById(int id) { return repo.findById(id); }
    public Task updateTask(int id, Task t) { t.setId(id); return repo.save(t); }
    public void deleteTask(int id) { repo.deleteById(id); }
}