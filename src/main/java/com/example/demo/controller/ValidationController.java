package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class ValidationController{
    @Autowired ValidationService ser;
    @PostMapping("/post")
    public ValidatyEntity sendData(@RequestBody ValidationEntity stu){
            return ser.postdata(stu);
    }
}