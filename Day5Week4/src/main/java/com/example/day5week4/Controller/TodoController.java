package com.example.day5week4.Controller;

import com.example.day5week4.Api.ApiResponse;
import com.example.day5week4.Model.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController // تجبر تاخذ جيسون وترجع جسسون
@RequestMapping("/api/v1/todo")
public class TodoController {
    ArrayList<Todo> todos = new ArrayList<>(); // نخزن البيانات هنا بدل قاعدة البيانات

    // get
    @GetMapping("/get")
    public ArrayList<Todo> getTodos() {
        return todos;
    }

    // post
    @PostMapping("/add")
    public ApiResponse addTodo(@RequestBody Todo todo) {  // RequestBody نعطيه بيانات جيسون
        todos.add(todo);
        return new ApiResponse("Todo Added successfully",200); // رسبونس  Response
    }

    // put (set)
    @PutMapping("/update/{index}")
    public ApiResponse updateTodo(@PathVariable int index, @RequestBody Todo todo) {
        todos.set(index, todo);
        return new ApiResponse("Todo Updated successfully",200);
    }

    // delete
    @DeleteMapping("/delete/{index}")
    public ApiResponse deleteTodo(@PathVariable int index) {
        todos.remove(index);
        return new ApiResponse("Todo delete successfully",200);
    }


}
// نكتب المثود 1
// 2 الماب
