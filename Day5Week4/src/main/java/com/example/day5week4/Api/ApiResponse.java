package com.example.day5week4.Api;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;


@Data
@AllArgsConstructor
public class ApiResponse {
    private String message;
    private int status;


}
