package com.shan.studentmanagementsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shan.studentmanagementsystem.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    
}
