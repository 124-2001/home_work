package com.example.demovidientu.model.DTO;

import com.example.demovidientu.model.Level;
import lombok.Data;

@Data
public class StudentDTO {
    private String name;
    private int age;
    private Level level;
}
