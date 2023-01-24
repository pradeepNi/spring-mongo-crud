package com.Package.services;

import com.Package.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Package.model.Task;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServices {
    @Autowired
    private TaskRepository repository;

    public Task addTask(Task  task) {
        task.setTaskId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(task);
    }

    public List<Task> getAllTasks() {
         List<Task> tasks = repository.findAll();
        System.out.println(tasks);
        return tasks;
    }
}
