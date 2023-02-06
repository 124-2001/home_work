package com.example.demovidientu.model.DTO;

import com.example.demovidientu.model.Student;
import lombok.Data;

import java.util.List;
@Data
public class ClassTechMasterDTO {
    private String address;
    private List<Student> students;
}
