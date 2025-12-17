package com.example.demo.service.Impl;
import com.example.demo.entity.studententity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentService;


import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student; 
//save()
// findall()
// findByid()
// deleteByid()
// existByid() 
@Override                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
   public studententity postData(studententity stu){
    return student.save(stu);
}
}