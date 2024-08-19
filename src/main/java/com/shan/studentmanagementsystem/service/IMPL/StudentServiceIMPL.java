package com.shan.studentmanagementsystem.service.IMPL;

import com.shan.studentmanagementsystem.dto.StudentDTO;
import com.shan.studentmanagementsystem.dto.StudentUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shan.studentmanagementsystem.dto.StudentSaveDTO;
import com.shan.studentmanagementsystem.entity.Student;
import com.shan.studentmanagementsystem.repo.StudentRepo;
import com.shan.studentmanagementsystem.service.StudentService;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepo.findAll();
        List<StudentDTO> studentDTOs = new ArrayList<StudentDTO>();
        for (Student student : students) {
            StudentDTO studentDTO = new StudentDTO(
                    student.getStudentId(),
                    student.getStudentName(),
                    student.getStudentAddress(),
                    student.getStudentPhone()
            );
            studentDTOs.add(studentDTO);
        }
        return null;
    }

    @Override
    public String updateStudent(StudentUpdateDTO studentUpdateDTO) {
        if(studentRepo.existsById(studentUpdateDTO.getStudentId())){
            Student student = studentRepo.findById(studentUpdateDTO.getStudentId()).get();
            student.setStudentName(studentUpdateDTO.getStudentName());
            student.setStudentAddress(studentUpdateDTO.getStudentAddress());
            student.setStudentPhone(studentUpdateDTO.getStudentPhone());
            studentRepo.save(student);

            return student.getStudentName();
        }
        else{
            System.out.println("Student not found");
        }
    return null;
    }

    @Override
    public boolean deleteStudent(int id) {
        if(studentRepo.existsById(id)){
            studentRepo.deleteById(id);
        }
        else{
            System.out.println("Student not found");
        }
        return false;
    }

}
