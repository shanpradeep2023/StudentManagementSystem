package com.shan.studentmanagementsystem.controller;

import com.shan.studentmanagementsystem.dto.StudentDTO;
import com.shan.studentmanagementsystem.dto.StudentUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shan.studentmanagementsystem.dto.StudentSaveDTO;
import com.shan.studentmanagementsystem.service.StudentService;

import java.util.List;


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

    @GetMapping("/getAllStudents")
    public List<StudentDTO> getAllStudents(){
        List<StudentDTO> allStudents = studentService.getAllStudents();
        return allStudents;
    }

    @PutMapping("/update")
    public String StudentUpdate(@RequestBody StudentUpdateDTO studentUpdateDTO){
        String stname = studentService.updateStudent(studentUpdateDTO);
        return stname;
    }

    @DeleteMapping("/delete/{id}")
    public String StudentDelete(@PathVariable(value = "id")int id){
        //make below method boolean
        boolean deleteStudent = studentService.deleteStudent(id);
        return "Deleted Student";
    }
    
}
