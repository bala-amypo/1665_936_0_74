package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
;
import com.example.demo.service.studententity;

@RestController
public class StudentController{
    @Autowired StudentService ser

    @PostMapping("/post")
    public studententity senddata(@RequestBody studententity stu){
        return ser.postData(stu); 

    }
}         