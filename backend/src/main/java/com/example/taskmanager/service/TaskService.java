package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service 
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public Task createTask(Task task) {
        task.setId(System.currentTimeMillis());
        tasks.add(task);
        return task;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }   
}