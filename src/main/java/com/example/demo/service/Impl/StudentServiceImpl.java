package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student; 
//save()
// findall()
// findByid()
// deleteByid()
// existByid() 

   public studententity postData(studententity stu);
    return student.save();

}
