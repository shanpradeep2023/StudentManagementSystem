package com.shan.studentmanagementsystem.service;

import com.shan.studentmanagementsystem.dto.StudentDTO;
import com.shan.studentmanagementsystem.dto.StudentSaveDTO;
import com.shan.studentmanagementsystem.dto.StudentUpdateDTO;

import java.util.List;

public interface StudentService {

    String addStudent(StudentSaveDTO studentSaveDTO);

    List<StudentDTO> getAllStudents();

    String updateStudent(StudentUpdateDTO studentUpdateDTO);

    boolean deleteStudent(int id);
}
