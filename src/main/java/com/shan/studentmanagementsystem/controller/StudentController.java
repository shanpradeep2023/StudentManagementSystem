package com.shan.studentmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shan.studentmanagementsystem.dto.StudentSaveDTO;
import com.shan.studentmanagementsystem.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    
    @PostMapping(path = "/save")
    private String saveStudent(@RequestBody StudentSaveDTO studentSaveDTO){
        String stname = studentService.addStudent(studentSaveDTO);
        return stname;
    }
    
}
