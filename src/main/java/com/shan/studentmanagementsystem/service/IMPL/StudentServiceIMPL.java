package com.shan.studentmanagementsystem.service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shan.studentmanagementsystem.dto.StudentSaveDTO;
import com.shan.studentmanagementsystem.entity.Student;
import com.shan.studentmanagementsystem.repo.StudentRepo;
import com.shan.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO) {
        Student student = new Student(
            
            studentSaveDTO.getStudentName(),
            studentSaveDTO.getStudentAddress(),
            studentSaveDTO.getStudentPhone()
        );

        studentRepo.save(student);

        return student.getStudentName();
    }
    
}
