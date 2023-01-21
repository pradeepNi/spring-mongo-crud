package com.Package.controller;

import com.Package.model.Task;
import com.Package.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskServices service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task creatTask(@RequestBody Task task) {
        return  service.addTask(task);
    }
}
