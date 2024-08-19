package com.shan.studentmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentSaveDTO {

    
    private String studentName;
    private String studentAddress;
    private String studentPhone;

    
}
