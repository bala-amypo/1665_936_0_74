package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class StudentController{
    @Autowired StudentService ser

    @PostMapping("/post")
    public studententity senddata(@RequestBody)
}         