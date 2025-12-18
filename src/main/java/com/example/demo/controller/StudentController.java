// package com.example.demo.controller;

// import org.springframework.web.bind.annotation.RestController;
// import com.example.demo.service.StudentService;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.Autowired;

// import com.example.demo.service.studententity;

// @RestController
// public class StudentController{
//     @Autowired StudentService ser

//     @PostMapping("/post")
//     public studententity senddata(@RequestBody studententity stu){
//         return ser.postData(stu); 
//     }
// }         

// package com.example.demo.controller;

// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.beans.factory.annotation.Autowired;

// import com.example.demo.service.StudentService;
// import com.example.demo.entity.studententity;

// @RestController
// public class StudentController {

//     @Autowired
//     private StudentService ser;

//     @PostMapping("/post")
//     public Studententity senddata(@RequestBody Studententity stu) {
//         return ser.postData(stu);
//     }
// }

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
            return ser.postdata(stu);
    }
}