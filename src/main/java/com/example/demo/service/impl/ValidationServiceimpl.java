package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentEntity;


@Service
public class ValidationServiceimpl implements ValidationService{
    @Autowired ValidationRepository student;
    @Override
    public ValidationEntity postdata(ValidationEntity stu){
        return student.save(stu);
    }
}