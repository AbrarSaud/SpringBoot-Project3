package com.example.tasktrackersystem.Controller;

import com.example.tasktrackersystem.Api.ApiResponse;
import com.example.tasktrackersystem.Model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    ArrayList<Task> tasks = new ArrayList<>();

    // Display all tasks
    @GetMapping("/get")
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    // Create a new task
    @PostMapping("/add")
    public ApiResponse addTask(@RequestBody Task task) {
        tasks.add(task);
        return new ApiResponse("Added successfully");
    }

    // Update a task
    @PutMapping("/update/{index}")
    public ApiResponse updateTask(@PathVariable int index, @RequestBody Task task) {
        tasks.set(index, task);
        return new ApiResponse("Updated successfully");
    }

    // Delete a task
    @DeleteMapping("/delete/{index}")
    public ApiResponse deleteTask(@PathVariable int index) {
        tasks.remove(index);
        return new ApiResponse("Deleted successfully");
    }

    // Change the task status as done or not done
    @PutMapping("/change-task/{index}")
    public ApiResponse changeTask(@PathVariable int index, @RequestParam String status) {
        Task checkTask = tasks.get(index);
        String message = "Invalid status";
        if (checkTask.getStatus().equalsIgnoreCase("Done")) {
            checkTask.setStatus("Done");
            message = "Task is  Done.";
        } else if (checkTask.getStatus().equalsIgnoreCase("NOT Done")) {
            checkTask.setStatus("Done");
            message = "status changed successfully to ' Done'";
        }
        tasks.set(index, checkTask);
        return new ApiResponse(message);
    }

    //Search for a task by given title
    @GetMapping("/search-task")
    public ApiResponse searchTaskByTitle(@RequestParam String title) {
        // Search for the task by title
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                return new ApiResponse("Task found: " + task.toString());
            }
        }
        return new ApiResponse("Task with the given title not found.");
    }


}
