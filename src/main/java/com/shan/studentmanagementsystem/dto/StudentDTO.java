package com.shan.studentmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data


public class StudentDTO {

    private int studentId;
    private String studentName;
    private String studentAddress;
    private String studentPhone;
    
}
